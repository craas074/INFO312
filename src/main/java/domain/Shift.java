package domain;

import com.google.appengine.api.datastore.Key;
import java.util.Date;
import java.util.UUID;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;

@PersistenceCapable
public class Shift {

    @Persistent
    private Key key;
    @Persistent
    private String id;
    @Persistent
    private Date date;
    @Persistent
    private String empEmail;
    @Persistent
    private String rosterId;
    @Persistent
    private String start;
    @Persistent
    private String finish;
    @Persistent
    private Boolean assigned;
    @Persistent
    private String constraint;

    public Shift(String rosterId, Date date, String start, String finish) {
        this.id = UUID.randomUUID().toString();
        this.date = date;
        this.rosterId = rosterId;
        this.start = start;
        this.finish = finish;
        this.assigned = false;
    }

    public Shift(String rosterId, Date date, String start, String finish, String constraint) {
        this.id = UUID.randomUUID().toString();
        this.date = date;
        this.rosterId = rosterId;
        this.start = start;
        this.finish = finish;
        this.constraint = constraint;
    }

    public Shift(Date date, String empEmail, String rosterId, String start, String finish) {
        this.id = UUID.randomUUID().toString();
        this.date = date;
        this.empEmail = empEmail;
        this.rosterId = rosterId;
        this.start = start;
        this.finish = finish;
        this.assigned = true;
    }
    
    public int getTime(){
        return Integer.parseInt(start)-Integer.parseInt(finish);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public String getRosterId() {
        return rosterId;
    }

    public void setRosterId(String rosterId) {
        this.rosterId = rosterId;
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

    public Boolean getAssigned() {
        return assigned;
    }

    public void setAssigned(Boolean assigned) {
        this.assigned = assigned;
    }

    public String getConstraint() {
        return constraint;
    }

    public void setConstraint(String constraint) {
        this.constraint = constraint;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
    
    

}
