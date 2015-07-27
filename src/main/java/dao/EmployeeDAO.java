/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.HashMap;
import java.util.Map;
import Domain.Employee;
/**
 *
 * @author benjamindawson-bruce
 */
public class EmployeeDAO {
    
    
    Map<String, Employee> employees = new HashMap<>();

    public Map<String, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Map<String, Employee> employees) {
        this.employees = employees;
    }
    
    
    public void addEmployee(Employee e){
        employees.put(e.getId(), e);
    }
    
    public void deleteEmployee(Employee e){
        employees.remove(e.getId());
    }
    
    public void updateEmployee(Employee e){
        //updates??
    }
    
    public Employee getEmployee(String id){
       return employees.get(id);
       
    }
    
    
    public void save(){
        //method ?
    }
    
}
