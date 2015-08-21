/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import domain.Employee;

import javax.jdo.PersistenceManager;
import jdo.PMF;

/**
 *
 * @author benjamindawson-bruce
 */

public class EmployeeDAO {
    
    private static PersistenceManager pm;
    
    public EmployeeDAO(){
    }
    

    public PersistenceManager getPmf() {
        return pm;
    }
    
    public void toggleEmployeeLogStatus(Employee employee) {
    try {
        Employee e = pm.getObjectById(Employee.class, employee.getEmail());
        e.setFirstLogin(!e.getFirstLogin());

        
    } finally {
        pm.close();
    }
}
    
    public static Employee getEmployeeByEmail(String email){
        Key k = KeyFactory.createKey(Employee.class.getSimpleName(), email);
        return pm.getObjectById(Employee.class, k);
    }
    
    
    public static Employee getEmployeeByName(String name){
        Key k = KeyFactory.createKey(Employee.class.getSimpleName(), name);
        return pm.getObjectById(Employee.class, k);
    }
    
    public static void addEmployee(Employee e){
        pm = PMF.get().getPersistenceManager();
        Key key = KeyFactory.createKey(Employee.class.getSimpleName(), e.getEmail());
        e.setKey(key);
        System.out.println("Null pointer is not the employee");
        pm.makePersistent(e);
    }
    
}
