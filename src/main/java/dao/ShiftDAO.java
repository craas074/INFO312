/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Domain.Shift;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author benjamindawson-bruce
 */
public class ShiftDAO {
    
    
    Map<String, Shift> shifts = new HashMap<>();

    public Map<String, Shift> getShifts() {
        return shifts;
    }

    public void setShifts(Map<String, Shift> shifts) {
        this.shifts = shifts;
    }

   

    public void addShift(Shift s){
        shifts.put(s.getId(), s);
    }
    
    public void deleteShift(Shift s){
        shifts.remove(s.getId());
    }
    
    public void updateShift(Shift s){
        //update??
    }
    
    
    public Shift getShift(String id){
        return shifts.get(id);
    }
    
    //not sure this method is right
    
    public void save(){
        //save method??
    }
    
    
    
    
}
