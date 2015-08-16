/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 *
 * @author benjamindawson-bruce
 */
public class Shift {

    private String id;
    private String start;
    private String end;
    //made start and end integers, easier to work with in 24 hr time
    private Date date;
    private Employee employee;

<<<<<<< HEAD
    public Shift() {

    }

  
    public Shift(String id, String start, String end, Date date) {
=======
    public Shift(String id, String start, String end, Date date, Employee employee) {
>>>>>>> 7407e8a528b5e38a43727b99cb6c3225c6956722
        this.id = id;
        this.start = start;
        this.end = end;
        this.date = date;
<<<<<<< HEAD

=======
        this.employee = employee;
>>>>>>> 7407e8a528b5e38a43727b99cb6c3225c6956722
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

<<<<<<< HEAD
    public String getShiftLength() {

        return "";

    }
    
     @Override
    public String toString() {
        return "Shift{" + "id=" + id + ", start=" + start + ", end=" + end + ", date=" + date + ", employee=" + employee + '}';
    }
=======
    public Integer getShiftLength() {
        return null;
>>>>>>> 7407e8a528b5e38a43727b99cb6c3225c6956722

      //  return end-start;
    }

}
