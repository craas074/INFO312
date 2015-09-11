/*

 */

package dao;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import domain.Availability;
import domain.Employee;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import jdo.PMF;

/**
 *
 * @author cameron
 * @version 0.1
 */
public final class AvailabilityDAO {

    private static PersistenceManager pm;
    
    public static void addAvailability(Availability av){
        pm = PMF.get().getPersistenceManager();
        Key key = KeyFactory.createKey(Availability.class.getSimpleName(), av.getEmail());
        av.setKey(key);
        try{
            pm.makePersistent(av);
        }
        finally{
            pm.close();
        }
    }
    
   public static Collection<Availability> getAll(){
       pm = PMF.get().getPersistenceManager();
       Query q = pm.newQuery(domain.Availability.class);
       try{
           Collection<Availability> res = (Collection<Availability>)q.execute();
           return res;
       }
       finally{
           q.closeAll();
           pm.close();
       }
   }
    
    public static Collection<Availability> getByEmail(String email){
        pm = PMF.get().getPersistenceManager();
        Query q = pm.newQuery(domain.Availability.class);
        q.setFilter("email == emailParam");
        q.declareParameters("String emailParam");
        try{
            Collection<Availability> res = (Collection<Availability>) q.execute(email);
            return res;
        }
        finally{
            q.closeAll();
            pm.close();
        }
    }
    
    public static Collection<Availability> getByDate(String date) throws ParseException{
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date d = sourceFormat.parse(date);
        pm = PMF.get().getPersistenceManager();
        Query q = pm.newQuery(domain.Availability.class);
        q.setFilter("date == dateParam");
        q.declareParameters("java.util.Date dateParam");
        try{
            Collection<Availability> res = (Collection<Availability>) q.execute(d);
            return res;
        }
        finally{
            q.closeAll();
            pm.close();
        }
    }
    
    
}
