/*

 */
package jdo;

import javax.jdo.JDOHelper;
import javax.jdo.PersistenceManagerFactory;


/**
 *
 * @author cameron
 * @version 0.1
 */
public final class PMF {
    
    private static final PersistenceManagerFactory pmfInstance = JDOHelper.getPersistenceManagerFactory("transactions-optional");
    
    private PMF(){}
    
    public static PersistenceManagerFactory get(){
        return pmfInstance;
    }
    
}
