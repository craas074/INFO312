/*

 */

package dao;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import domain.Roster;
import domain.Shift;
import javax.jdo.PersistenceManager;
import jdo.PMF;

/**
 *
 * @author cameron
 * @version 0.1
 */
public final class RosterDAO {

    private static PersistenceManager pm;
    
    public RosterDAO(){
    }

    public static PersistenceManager getPm() {
        return pm;
    }
    
    public static void save(Roster roster){
        pm = PMF.get().getPersistenceManager();
        Key key = KeyFactory.createKey(Roster.class.getSimpleName(), roster.getId());
        roster.setKey(key);
        try{
            pm.makePersistent(roster);
            for(Shift shift : roster.getShifts()){
                ShiftDAO.addShift(shift);
            }
        }
        finally{
            pm.close();
        }
    }
    
    
    
}
