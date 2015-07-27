/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import domain.Shift;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author benjamindawson-bruce
 */
public class ShiftDAO {
    
    
    private List<Shift> shifts = new ArrayList<>();

    public List<Shift> getShifts() {
        return shifts;
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
