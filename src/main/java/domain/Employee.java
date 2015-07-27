/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author benjamindawson-bruce
 */
public class Employee {
    
    
     private String id;
     private String name;
     private Double minhours;
     private Double maxhours;
     private Double currenthours;
     
     
     List<Shift> availableShifts = new ArrayList<>(); 
     List<Shift> completedShifts = new ArrayList<>();

    public Employee(String id, String name, Double minhours, Double maxhours, Double currenthours) {
        this.id = id;
        this.name = name;
        this.minhours = minhours;
        this.maxhours = maxhours;
        this.currenthours = currenthours;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMinhours() {
        return minhours;
    }

    public void setMinhours(Double minhours) {
        this.minhours = minhours;
    }

    public Double getMaxhours() {
        return maxhours;
    }

    public void setMaxhours(Double maxhours) {
        this.maxhours = maxhours;
    }

    public Double getCurrenthours() {
        return currenthours;
    }

    public void setCurrenthours(Double currenthours) {
        this.currenthours = currenthours;
    }

    public List<Shift> getAvailableShifts() {
        return availableShifts;
    }

    public void setAvailableShifts(List<Shift> availableShifts) {
        this.availableShifts = availableShifts;
    }

    public List<Shift> getCompletedShifts() {
        return completedShifts;
    }

    public void setCompletedShifts(List<Shift> completedShifts) {
        this.completedShifts = completedShifts;
    }
     
     
    
    public void addAvailableShift(Shift shift){
        
        availableShifts.add(shift);
    }
    
    public void addCompletedShift(Shift shift){
        
        completedShifts.add(shift);
    }
     
    
}
