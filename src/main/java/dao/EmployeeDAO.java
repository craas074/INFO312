/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import domain.Employee;
import java.util.ArrayList;
import java.util.Collection;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;
import jdo.PMF;

/**
 *
 * @author benjamindawson-bruce
 */


public final class EmployeeDAO {
    
    private static PersistenceManager pm;
    
    public EmployeeDAO(){
    }
    

    public static PersistenceManager getPmf() {
        return pm;
    }
    
    /* Gets all employees in storage */
    public static Collection<Employee> getAll(){
        pm = PMF.get().getPersistenceManager();
        Transaction tx = pm.currentTransaction();
        try{
            tx.begin();
            Query q = pm.newQuery(domain.Employee.class);
            Collection<Employee> query_emps = (Collection<Employee>)q.execute();
            //
            //employees = (Collection<Employee>)pm.detachCopy(query_emps);
            tx.commit();
            return query_emps;
        }
        finally{
            if(tx.isActive()){
                tx.rollback();
            }
            pm.close();
        }
        //return employees;
    }
    
    public static void toggleEmployeeLogStatus(Employee employee) {
        pm = PMF.get().getPersistenceManager();
        try{
            Employee e = pm.getObjectById(Employee.class, employee.getEmail());
            e.setFirstLogin(!e.getFirstLogin());
        }       
        finally {
        pm.close();
        }
    }
    
    public static void updateEmployeeHrs(String email, Double currentHours){
        pm = PMF.get().getPersistenceManager();
        try{
            Key k = KeyFactory.createKey(Employee.class.getSimpleName(), email);
            Employee e = pm.getObjectById(Employee.class, k);
            e.setCurrenthours(currentHours);
        }
        finally{
            pm.close();
        }
    }
    
    public static void updateEmployee(String id, String name, String email, Double minhrs, Double maxhrs){
        pm = PMF.get().getPersistenceManager();
        try{
            Key k = KeyFactory.createKey(Employee.class.getSimpleName(), id);
            Employee e = pm.getObjectById(Employee.class, k);
            e.setEmail(email);
            e.setName(name);
            e.setMinhours(minhrs);
            e.setMaxhours(maxhrs);
        }
        finally{
            pm.close();
        }
    }
    
    public static void deleteEmployee(String id){
        pm = PMF.get().getPersistenceManager();
        try{
            Key k = KeyFactory.createKey(Employee.class.getSimpleName(), id);
            Employee e = pm.getObjectById(Employee.class, k);
            pm.deletePersistent(e);
        }
        finally{
            pm.close();
        }
    }
    
    public static Employee getEmployeeById(String id){
        pm = PMF.get().getPersistenceManager();
        try{
            Key k = KeyFactory.createKey(Employee.class.getSimpleName(), id);
            return pm.getObjectById(Employee.class, k);
        }
        finally{
            pm.close();
        }
    }
    
    
    public static Employee getEmployeeByEmail(String email){
        pm = PMF.get().getPersistenceManager();
        try{
            Key k = KeyFactory.createKey(Employee.class.getSimpleName(), email);
            return pm.getObjectById(Employee.class, k);
        }
        finally{
            pm.close();
        }
    }
    
    
    public static Employee getEmployeeByName(String name){
        
         /*   
        pm = PMF.get().getPersistenceManager();
        try{
            Key k = KeyFactory.createKey(Employee.class.getSimpleName(), 1);
            return pm.getObjectById(Employee.class, k);
        }
        finally{
            pm.close();
        }
          */
        
        return new Employee("1", "test@gmail.com", "707A3C64C7C00E52AE880442B769029D2D1328A29941DF71C53332D153F87820", "Test Person", 6.0, 40.0, 15.0, false);
    }
    
    
    
    public static void addEmployee(Employee e){
        pm = PMF.get().getPersistenceManager();
        Key key = KeyFactory.createKey(Employee.class.getSimpleName(), e.getEmail());
        e.setKey(key);
        try{
            pm.makePersistent(e);
        }
        finally{
            pm.close();
        }
    }
    
    public static ArrayList<Employee> getEmployeeByConstraint(String con){
        Collection<Employee> emps = getAll();
        ArrayList<Employee> retset = new ArrayList<>();
        String regex = "/"+con+"/";
        for(Employee e: emps){
            if(e.getConstraints().matches(regex)){
                retset.add(e);
            }
        }
        return retset;
        
    }
    
    
    
}
