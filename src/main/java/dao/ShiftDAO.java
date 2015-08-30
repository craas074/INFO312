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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author benjamindawson-bruce
 */
public class ShiftDAO {
    
    
    private static Map<Integer, Shift> shifts = new TreeMap<>();

    
    public ShiftDAO() {

        Employee emp2 = new Employee("Mr Employee", "blahblah@gmail.com", 30.0, 15.0);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        if (shifts.isEmpty()) { //singleton for adding dummy shifts for testing

            try {

                //Monday
                shifts.put(1, new Shift(1, "0545", "0900", df.parse("01/01/2015"), emp2));
                /*
                 shifts.add(new Shift(2, "0600", "0900", df.parse("01/01/2015"), emp2));
                 shifts.add(new Shift(3, "0900", "1200", df.parse("01/01/2015"), emp2));
                 shifts.add(new Shift(4, "1200", "1500", df.parse("01/01/2015"), emp2));
                 shifts.add(new Shift(5, "1500", "1900", df.parse("01/01/2015"), emp2));
                 shifts.add(new Shift(6, "1900", "2300", df.parse("01/01/2015"), emp2));
                 */

                //Tuesday
                shifts.put(7, new Shift(7, "0900", "1700", df.parse("02/01/2015"), emp2));

                /*
                 shifts.add(new Shift(8, "600", "900", df.parse("02/01/2015"), emp2));
                 shifts.add(new Shift(9, "900", "1200", df.parse("02/01/2015"), emp2));
                 shifts.add(new Shift(10, "1200", "1500", df.parse("02/01/2015"), emp2));
                 shifts.add(new Shift(11, "1500", "1900", df.parse("02/01/2015"), emp2));
                 shifts.add(new Shift(12, "1900", "2300", df.parse("02/01/2015"), emp2));
                 */
            } catch (ParseException ex) {

            }

        }
    }
    
    public List<Shift> getShifts() {
        
        List<Shift> list = new ArrayList<Shift>(shifts.values());
        return list;
    }
    
    /*
    
    public void deleteAllShifts(){
        shifts.clear();
    }
    */

    public Shift getById(Integer id) {
        return shifts.get(id);
    }
    
    public void add(Shift s){
    }
    
    public void save(){
        //will be for db persistence. 
    }

    public void update() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
    
    
    
}
