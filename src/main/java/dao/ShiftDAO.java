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
