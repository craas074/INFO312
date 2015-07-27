/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;



import java.util.Date;

/**
 *
 * @author benjamindawson-bruce
 */
public class Shift {
    
    
   String id;
   Integer start;
   Integer end;
   //made start and end integers, easier to work with in 24 hr time
   Date date;
   Employee assignedTo;

    public Shift(String id, Integer start, Integer end, Date date, Employee assignedTo) {
        this.id = id;
        this.start = start;
        this.end = end;
        this.date = date;
        this.assignedTo = assignedTo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Employee assignedTo) {
        this.assignedTo = assignedTo;
    }
    
    
    
    
    public void Assign (Employee employee){
    
        //wasnt sure how to implement this method
    }

            
    public Integer getShiftLength(){
        
        
        return end-start;
    
    }
   
   
   
    
}


