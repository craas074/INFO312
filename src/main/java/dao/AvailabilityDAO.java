/*

 */

package dao;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import domain.Availability;
import domain.Employee;
import java.util.Collection;
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
    
    public static Collection<Availability> getByEmail(String email){
        pm = PMF.get().getPersistenceManager();
        Query q = pm.newQuery(Availability.class);
        q.setFilter("email == emailParam");
        q.declareParameters("String emailParam");
        try{
            Collection<Availability> res = (Collection<Availability>) q.execute(email);
            return res;
        }
        finally{
            pm.close();
        }
    }
    
    
}
