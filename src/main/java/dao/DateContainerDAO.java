/*

 */

package dao;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import domain.DateContainer;
import javax.jdo.PersistenceManager;
import jdo.PMF;

/**
 *
 * @author cameron
 * @version 0.1
 */
public class DateContainerDAO {

    private static PersistenceManager pm;
    
    public DateContainerDAO(){
    }
    

    public static PersistenceManager getPmf() {
        return pm;
    }
    
    public static void saveContainer(DateContainer d){
        pm = PMF.get().getPersistenceManager();
        Key key = KeyFactory.createKey(DateContainer.class.getSimpleName(), d.getId());
        d.setKey(key);
        try{
            pm.makePersistent(d);
        }
        finally{
            pm.close();
        }
    }
    
    public static DateContainer getContainer(){
        pm = PMF.get().getPersistenceManager();
        try{
            Key k = KeyFactory.createKey(DateContainer.class.getSimpleName(), 1);
            return pm.getObjectById(DateContainer.class, k);
        }
        finally{
            pm.close();
        }
    }
    
}
