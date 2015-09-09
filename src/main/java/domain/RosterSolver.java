/*

 */
package domain;

import dao.AvailabilityDAO;
import dao.DateContainerDAO;
import dao.EmployeeDAO;
import dao.ShiftDAO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author cameron
 * @version 0.1
 */
public class RosterSolver {

    private ArrayList<Shift> shifts;
    private ArrayList<Availability> avails;
    private long seed;

    public RosterSolver() {
        DateContainer dc = DateContainerDAO.getContainer();
        this.shifts = (ArrayList<Shift>) ShiftDAO.getByRosterId(dc.getDay() + "/" + dc.getMonth() + "/" + dc.getYear());
        this.avails = (ArrayList<Availability>) AvailabilityDAO.getAll();
        this.seed = System.nanoTime();
        for (Employee e : EmployeeDAO.getAll()) {
            EmployeeDAO.updateEmployeeHrs(e.getEmail(), 0.00);
        }
    }

    public void solve() {
        resolveConstrainedShifts();
        satisfyMinHrs();
        fill();
        persist();
    }

    private void resolveConstrainedShifts() {
        //randomise the process to avoid favoritism
        Collections.shuffle(shifts, new Random(seed));
        Collections.shuffle(avails, new Random(seed));
        for (Shift shift : shifts) {
            if (!shift.getAssigned() && shift.getConstraint() != null);
            String pattern = "/" + shift.getConstraint() + "/";
            for (Availability av : avails) {
                Employee e = EmployeeDAO.getEmployeeByEmail(av.getEmail());
                if (av.getConsumed() == false && av.getStart().equals(shift.getStart())
                        && av.getFinish().equals(shift.getFinish()) && av.getDate().equals(shift.getDate())
                        && e.getConstraints().matches(pattern) && e.getCurrenthours() + shift.getTime() < e.getMaxhours()) {
                    //assign the shift
                    av.setConsumed(true);
                    shift.setEmpEmail(av.getEmail());
                    shift.setAssigned(true);
                    EmployeeDAO.updateEmployeeHrs(e.getEmail(), e.getCurrenthours() + shift.getTime());
                }
            }
        }
    }

    private void satisfyMinHrs() {
        Collections.shuffle(shifts, new Random(seed));
        Collections.shuffle(avails, new Random(seed));
        for (Availability av : avails) {
            if (!av.getConsumed()) {
                Employee e = EmployeeDAO.getEmployeeByEmail(av.getEmail());
                if (e.getCurrenthours() < e.getMinhours()) {
                    for (Shift shift : shifts) {
                        if (shift.getAssigned() == false && av.getStart().equals(shift.getStart())
                                && av.getFinish().equals(shift.getFinish()) && av.getDate().equals(shift.getDate())
                                && e.getCurrenthours() + shift.getTime() < e.getMaxhours()) {
                            av.setConsumed(true);
                            shift.setEmpEmail(av.getEmail());
                            shift.setAssigned(true);
                            EmployeeDAO.updateEmployeeHrs(e.getEmail(), e.getCurrenthours() + shift.getTime());
                        }
                    }
                }
            }
        }
    }

    private void fill() {
        Collections.shuffle(shifts, new Random(seed));
        Collections.shuffle(avails, new Random(seed));
        for (Shift shift : shifts) {
            if (!shift.getAssigned() && shift.getConstraint() == null);
            for (Availability av : avails) {
                Employee e = EmployeeDAO.getEmployeeByEmail(av.getEmail());
                if (av.getConsumed() == false && av.getStart().equals(shift.getStart())
                        && av.getFinish().equals(shift.getFinish()) && av.getDate().equals(shift.getDate())
                        && e.getCurrenthours() + shift.getTime() < e.getMaxhours()) {
                    //assign the shift
                    av.setConsumed(true);
                    shift.setEmpEmail(av.getEmail());
                    shift.setAssigned(true);
                    EmployeeDAO.updateEmployeeHrs(e.getEmail(), e.getCurrenthours() + shift.getTime());
                }
            }
        }
    }
    

    private void persist() {
        for(Shift shift : shifts){
            ShiftDAO.editShift(shift.getId(), shift.getStart(), shift.getFinish(), shift.getEmpEmail(), shift.getAssigned());
        }
    }

}
