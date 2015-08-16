/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Employee;
import domain.Shift;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author benjamindawson-bruce
 */
public class ShiftDAO {
    
    
    private List<Shift> shifts = new ArrayList<>();

   
      
    Employee employee1 = new Employee("muss", "muss", 1.0, 5.0);
    Shift shift1 = new Shift("1", "845", "945", new Date(), employee1);
   // shifts.add(shift1);
    
    
    
    
    
    
    
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
