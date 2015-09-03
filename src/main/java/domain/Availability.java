/*

 */

package domain;

import com.google.appengine.api.datastore.Key;
import java.util.Date;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

/**
 *
 * @author cameron
 * @version 0.1
 */
@PersistenceCapable
public class Availability {
    
    @Persistent
    private Key key;
    @Persistent
    private String email;
    @Persistent
    private String start;
    @Persistent
    private String finish;
    @Persistent
    private Date date;
    @Persistent
    private Boolean consumed;

    public Availability(String email, String start, String finish, Date date) {
        this.email = email;
        this.start = start;
        this.finish = finish;
        this.date = date;
        this.consumed = false;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getConsumed() {
        return consumed;
    }

    public void setConsumed(Boolean consumed) {
        this.consumed = consumed;
    }
    
    @Override
    public String toString() {
        return "Availability{" + "key=" + key + ", email=" + email + ", start=" + start + ", finish=" + finish + ", date=" + date + '}';
    }
    
    

}
