/*

 */
package domain;

import com.google.appengine.api.datastore.Key;
import dao.DateContainerDAO;
import dao.ShiftDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.UUID;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

/**
 *
 * @author cameron
 * @version 0.1 Representation of the static roster of shifts.. for now
 * Will actually be used to hold finalised roster with specified employees.
 */
@PersistenceCapable
public class Roster {

    @Persistent
    private Key key;
    @Persistent
    private String id; //actually just "dd/MM/yyyy of startdate
    @Persistent
    private Date startDate;
    
    private Collection<Shift> shifts;
    

    public Roster() throws ParseException {
        DateContainer d = DateContainerDAO.getContainer();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.startDate = formatter.parse(d.getDay()+"/"+d.getMonth()+"/"+d.getYear());
        this.id = d.getDay()+"/"+d.getMonth()+"/"+d.getYear();
        
        Calendar c = Calendar.getInstance();
        c.setTime(this.startDate);
        for (int i = 0; i < 21; i++) {
            c.add(Calendar.DAY_OF_MONTH, 1);
            if (c.get(Calendar.DAY_OF_WEEK) == 1) {
                shifts.add(new Shift(this.id, c.getTime(), "0845", "0900"));
                shifts.add(new Shift(this.id, c.getTime(), "0900", "1200"));
                shifts.add(new Shift(this.id, c.getTime(), "1200", "1500"));
                shifts.add(new Shift(this.id, c.getTime(), "1200", "1500"));
                shifts.add(new Shift(this.id, c.getTime(), "1500", "1900"));
                shifts.add(new Shift(this.id, c.getTime(), "1500", "1900"));
                shifts.add(new Shift(this.id, c.getTime(), "1500", "1900"));
                shifts.add(new Shift(this.id, c.getTime(), "1900", "2300", "W8"));
                shifts.add(new Shift(this.id, c.getTime(), "1900", "2300"));
                shifts.add(new Shift(this.id, c.getTime(), "1900", "2300"));
            }
            if (c.get(Calendar.DAY_OF_WEEK) == 3 || c.get(Calendar.DAY_OF_WEEK) == 6) {
                shifts.add(new Shift(this.id, c.getTime(), "0545", "0845"));
                shifts.add(new Shift(this.id, c.getTime(), "0545", "0845", "C13"));
                shifts.add(new Shift(this.id, c.getTime(), "0900", "1200", "C13"));
                shifts.add(new Shift(this.id, c.getTime(), "0845", "1200"));
                shifts.add(new Shift(this.id, c.getTime(), "1200", "1500"));
                shifts.add(new Shift(this.id, c.getTime(), "1200", "1500"));
                shifts.add(new Shift(this.id, c.getTime(), "1500", "1900", "C10"));
                shifts.add(new Shift(this.id, c.getTime(), "1500", "1900"));
                shifts.add(new Shift(this.id, c.getTime(), "1500", "1900"));
                shifts.add(new Shift(this.id, c.getTime(), "1900", "2300"));
                shifts.add(new Shift(this.id, c.getTime(), "1900", "2300", "W8"));
                shifts.add(new Shift(this.id, c.getTime(), "1900", "2300", "C11"));
            }
            if (c.get(Calendar.DAY_OF_WEEK) == 7) {
                shifts.add(new Shift(this.id, c.getTime(), "0745", "1300"));
                shifts.add(new Shift(this.id, c.getTime(), "0800", "1300"));
                shifts.add(new Shift(this.id, c.getTime(), "0800", "1300", "C10"));
                shifts.add(new Shift(this.id, c.getTime(), "1300", "1700"));
                shifts.add(new Shift(this.id, c.getTime(), "1300", "1700"));
                shifts.add(new Shift(this.id, c.getTime(), "1300", "1700", "W8"));
                shifts.add(new Shift(this.id, c.getTime(), "1500", "2100"));
                shifts.add(new Shift(this.id, c.getTime(), "1500", "2100", "W8"));
            } else {
                shifts.add(new Shift(this.id, c.getTime(), "0545", "0845"));
                shifts.add(new Shift(this.id, c.getTime(), "0600", "0900", "C13"));
                shifts.add(new Shift(this.id, c.getTime(), "0900", "1200", "C13"));
                shifts.add(new Shift(this.id, c.getTime(), "0900", "1200"));
                shifts.add(new Shift(this.id, c.getTime(), "1200", "1500"));
                shifts.add(new Shift(this.id, c.getTime(), "1200", "1500"));
                shifts.add(new Shift(this.id, c.getTime(), "1500", "1900", "C10"));
                shifts.add(new Shift(this.id, c.getTime(), "1500", "1900"));
                shifts.add(new Shift(this.id, c.getTime(), "1500", "1900"));
                shifts.add(new Shift(this.id, c.getTime(), "1900", "2300"));
                shifts.add(new Shift(this.id, c.getTime(), "1900", "2300", "C11"));
                shifts.add(new Shift(this.id, c.getTime(), "1500", "1900", "W8"));
            }
        }
    }

    public Collection<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(Collection<Shift> shifts) {
        this.shifts = shifts;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
    
    
    
    

}
