/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

/**
 *
 * @author benjamindawson-bruce
 */
@PersistenceCapable
public class Shift {

    @Persistent
    private String id;
    @Persistent
    private String start;
    @Persistent
    private String end;
    //made start and end integers, easier to work with in 24 hr time
    @Persistent
    private Date date;
    @Persistent
    private Employee employee;
    @Persistent
    private String constraint;

    public Shift() {

    }

    public Shift(String start, String end) {
        this.start = start;
        this.end = end;
    }
    
    public Shift(String start, String end, String constraint) {
        this.start = start;
        this.constraint = constraint;
        this.end = end;
    }

    public Shift(String id, String start, String end, Date date, Employee employee) {
        
        this.id = id;
        this.start = start;
        this.end = end;
        this.date = date;
        this.employee = employee;
    }
    
    //to be assigned to employees
    public Shift(String start, String end, Date date){
        this.start = start;
        this.end = end;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }
    

    public void assign(Employee employee) {
        this.employee = employee;
    }

    public String getConstraint() {
        return constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    
    
     @Override
    public String toString() {
        return "Shift{" + "id=" + id + ", start=" + start + ", end=" + end + ", date=" + date + ", employee=" + employee + '}';
    }
    
    public Integer getShiftLength() {
        return null;

      //  return end-start;
    }

}
