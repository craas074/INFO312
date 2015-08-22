/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Employee;
import domain.Shift;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author benjamindawson-bruce
 */
public class ShiftDAO {
    
    
    private static List<Shift> shifts = new ArrayList<>();

    
    public ShiftDAO() {

        Employee emp2 = new Employee("Mr Employee", "blahblah@gmail.com", 30.0, 15.0);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        try {

            //Monday
            shifts.add(new Shift("1", "545", "900", df.parse("01/01/2015"), emp2));
            shifts.add(new Shift("2", "600", "900", df.parse("01/01/2015"), emp2));
            shifts.add(new Shift("3", "900", "1200", df.parse("01/01/2015"), emp2));
            shifts.add(new Shift("4", "1200", "1500", df.parse("01/01/2015"), emp2));
            shifts.add(new Shift("5", "1500", "1900", df.parse("01/01/2015"), emp2));
            shifts.add(new Shift("6", "1900", "2300", df.parse("01/01/2015"), emp2));

            //Tuesday
            shifts.add(new Shift("7", "545", "900", df.parse("02/01/2015"), emp2));
            shifts.add(new Shift("8", "600", "900", df.parse("02/01/2015"), emp2));
            shifts.add(new Shift("9", "900", "1200", df.parse("02/01/2015"), emp2));
            shifts.add(new Shift("10", "1200", "1500", df.parse("02/01/2015"), emp2));
            shifts.add(new Shift("11", "1500", "1900", df.parse("02/01/2015"), emp2));
            shifts.add(new Shift("12", "1900", "2300", df.parse("02/01/2015"), emp2));

            //Wednesday
            shifts.add(new Shift("13", "545", "900", df.parse("03/01/2015"), emp2));
            shifts.add(new Shift("14", "600", "900", df.parse("03/01/2015"), emp2));
            shifts.add(new Shift("15", "900", "1200", df.parse("03/01/2015"), emp2));
            shifts.add(new Shift("16", "1200", "1500", df.parse("03/01/2015"), emp2));
            shifts.add(new Shift("17", "1500", "1900", df.parse("03/01/2015"), emp2));
            shifts.add(new Shift("18", "1900", "2300", df.parse("03/01/2015"), emp2));

            //Thurday
            shifts.add(new Shift("19", "545", "900", df.parse("04/01/2015"), emp2));
            shifts.add(new Shift("20", "600", "900", df.parse("04/01/2015"), emp2));
            shifts.add(new Shift("21", "900", "1200", df.parse("04/01/2015"), emp2));
            shifts.add(new Shift("22", "1200", "1500", df.parse("04/01/2015"), emp2));
            shifts.add(new Shift("23", "1500", "1900", df.parse("04/01/2015"), emp2));
            shifts.add(new Shift("24", "1900", "2300", df.parse("04/01/2015"), emp2));

            //Friday
            shifts.add(new Shift("25", "545", "900", df.parse("05/01/2015"), emp2));
            shifts.add(new Shift("26", "600", "900", df.parse("05/01/2015"), emp2));
            shifts.add(new Shift("27", "900", "1200", df.parse("05/01/2015"), emp2));
            shifts.add(new Shift("28", "1200", "1500", df.parse("05/01/2015"), emp2));
            shifts.add(new Shift("29", "1500", "1900", df.parse("05/01/2015"), emp2));
            shifts.add(new Shift("30", "1900", "2300", df.parse("05/01/2015"), emp2));

             //Weekend Shifts
            //Saturday
            shifts.add(new Shift("31", "745", "1300", df.parse("06/01/2015"), emp2));
            shifts.add(new Shift("32", "800", "1300", df.parse("06/01/2015"), emp2));
            shifts.add(new Shift("33", "1300", "1700", df.parse("06/01/2015"), emp2));
            shifts.add(new Shift("34", "1700", "2100", df.parse("06/01/2015"), emp2));

            //Sunday 
            shifts.add(new Shift("35", "845", "1200", df.parse("07/01/2015"), emp2));
            shifts.add(new Shift("36", "900", "1200", df.parse("07/01/2015"), emp2));
            shifts.add(new Shift("37", "1200", "1500", df.parse("07/01/2015"), emp2));
            shifts.add(new Shift("38", "1500", "1900", df.parse("07/01/2015"), emp2));
            shifts.add(new Shift("39", "1900", "2300", df.parse("07/01/2015"), emp2));

        } catch (ParseException ex) {

        }
    }
    
    
    
    
    
    public List<Shift> getShifts() {
        return shifts;
    }
    
    
    // may have a problem here, shift id is string , this is integer
     public Shift getById(Integer id) {
        return shifts.get(id);
    }
    
    public void add(Shift s){
        if(shifts.contains(s)){
            throw new IllegalArgumentException("Shift already exists");
        }
        shifts.add(s);
    }
    
    
    //not sure this method is right
    
    public void save(){
        //will be for db persistence. 
    }
    
  
    
    
    
}
