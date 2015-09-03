/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import domain.Shift;
import java.util.Collection;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import jdo.PMF;

/**
 *
 * @author benjamindawson-bruce
 */
public class ShiftDAO {
    
    
    private static PersistenceManager pm;
    
    public static void addShift(Shift s){
        pm = PMF.get().getPersistenceManager();
        Key key = KeyFactory.createKey(Shift.class.getSimpleName(), s.getRosterId());
        s.setKey(key);
        try{
            pm.makePersistent(s);
        }
        finally{
            pm.close();
        }
    }
    
   public static Collection<Shift> getAll(){
       pm = PMF.get().getPersistenceManager();
       Query q = pm.newQuery(domain.Availability.class);
       try{
           Collection<Shift> res = (Collection<Shift>)q.execute();
           return res;
       }
       finally{
           q.closeAll();
           pm.close();
       }
   }
    
    public static Collection<Shift> getByRosterId(String id){
        pm = PMF.get().getPersistenceManager();
        Query q = pm.newQuery(domain.Shift.class);
        q.setFilter("rosterId == idParam");
        q.declareParameters("String idParam");
        try{
            Collection<Shift> res = (Collection<Shift>) q.execute(id);
            return res;
        }
        finally{
            q.closeAll();
            pm.close();
        }
    }
    
    public static Shift getById(String id){
        pm = PMF.get().getPersistenceManager();
        Query q = pm.newQuery(domain.Shift.class);
        q.setFilter("id == idParam");
        q.declareParameters("String idParam");
        try{
            Shift res = (Shift) q.execute(id);
            return res;
        }
        finally{
            q.closeAll();
            pm.close();
        }
    }
    
    public static void editShift(String id, String start, String finish, String empEmail, Boolean assigned){
        pm = PMF.get().getPersistenceManager();
        Query q = pm.newQuery(domain.Shift.class);
        q.setFilter("id == idParam");
        q.declareParameters("String idParam");
        try{
            Shift res = (Shift) q.execute(id);
            res.setStart(start);
            res.setFinish(finish);
            res.setEmpEmail(empEmail);
            res.setAssigned(assigned);
        }
        finally{
            q.closeAll();
            pm.close();
        }
    }
    
  
    
    
    
}