/*

 */
package domain;

import java.util.HashMap;

/**
 *
 * @author cameron
 * @version 0.1 Representation of the static roster of shifts
 */
public class Roster {

    private HashMap<Integer, Shift> shifts;

    public Roster() {
        //i reps day of week where 1 = sunday
        //Calendar c = Calendar.getInstance();
        //c.setTime(yourDate);
        //int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        for (int i = 1; i < 8; i++) {
            if (i == 1) {
                shifts.put(i, new Shift("0845", "1200"));
                shifts.put(i, new Shift("0900", "1200"));
                shifts.put(i, new Shift("1200", "1500"));
                shifts.put(i, new Shift("1200", "1500"));
                shifts.put(i, new Shift("1500", "1900"));
                shifts.put(i, new Shift("1500", "1900"));
                shifts.put(i, new Shift("1500", "1900"));
                shifts.put(i, new Shift("1900", "2300", "W8"));
                shifts.put(i, new Shift("1900", "2300"));
                shifts.put(i, new Shift("1900", "2300"));
            }
            if (i == 3 || i == 6) {
                shifts.put(i, new Shift("0545", "0845"));
                shifts.put(i, new Shift("0545", "0845", "C13"));
                shifts.put(i, new Shift("0900", "1200", "C13"));
                shifts.put(i, new Shift("0845", "1200"));
                shifts.put(i, new Shift("1200", "1500"));
                shifts.put(i, new Shift("1200", "1500"));
                shifts.put(i, new Shift("1500", "1900", "C10"));
                shifts.put(i, new Shift("1500", "1900"));
                shifts.put(i, new Shift("1500", "1900"));
                shifts.put(i, new Shift("1900", "2300"));
                shifts.put(i, new Shift("1900", "2300", "W8"));
                shifts.put(i, new Shift("1900", "2300", "C11"));
            }
            if (i == 7) {
                shifts.put(i, new Shift("0745", "1300"));
                shifts.put(i, new Shift("0800", "1300"));
                shifts.put(i, new Shift("0800", "1300", "C10"));
                shifts.put(i, new Shift("1300", "1700"));
                shifts.put(i, new Shift("1300", "1700"));
                shifts.put(i, new Shift("1300", "1700", "W8"));
                shifts.put(i, new Shift("1500", "2100"));
                shifts.put(i, new Shift("1500", "2100", "W8"));
            } else {
                shifts.put(i, new Shift("0545", "0845"));
                shifts.put(i, new Shift("0600", "0900", "C13"));
                shifts.put(i, new Shift("0900", "1200", "C13"));
                shifts.put(i, new Shift("0900", "1200"));
                shifts.put(i, new Shift("1200", "1500"));
                shifts.put(i, new Shift("1200", "1500"));
                shifts.put(i, new Shift("1500", "1900", "C10"));
                shifts.put(i, new Shift("1500", "1900"));
                shifts.put(i, new Shift("1500", "1900"));
                shifts.put(i, new Shift("1900", "2300"));
                shifts.put(i, new Shift("1900", "2300", "C11"));
                shifts.put(i, new Shift("1500", "1900", "W8"));
            }

        }

    }

    public HashMap<Integer, Shift> getShifts() {
        return shifts;
    }

    public void setShifts(HashMap<Integer, Shift> shifts) {
        this.shifts = shifts;
    }
    
    

}
