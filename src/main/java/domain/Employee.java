/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


import com.google.appengine.api.datastore.Key;
import com.google.appengine.repackaged.org.apache.commons.codec.digest.DigestUtils;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author benjamindawson-bruce
 */
@PersistenceCapable
public class Employee {
    
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
     private Key key;
    @Persistent
     private String email;
    @Persistent
     private String password;
    @Persistent
     private String name;
    @Persistent
     private Double minhours;
    @Persistent
     private Double maxhours;
    @Persistent
     private Double currenthours;
    @Persistent
     private Boolean firstLogin;

     
     List<Shift> availableShifts = new ArrayList<>();
     
     List<Shift> completedShifts = new ArrayList<>();


    public Employee(String name, String email, Double minhours, Double maxhours) {
        this.email = email;
        this.name = name;
        this.minhours=minhours;
        this.maxhours = maxhours;
        this.password = newPassword(email);
        this.currenthours = 0.00;
        this.firstLogin=true;  
    }
    
    /* email generated pass to the employee, hash that pass and store the employee in the DAO
    we want to avoid this being accessed, so keep it private*/
    private String newPassword(String email){
        if(email.equals("")){
            throw new IllegalArgumentException("email must not be null");
        }
        String pass = RandomStringUtils.randomAlphanumeric(8);
        //email the employee the password they can use to login
        
        Properties props = new Properties();
        Session session = Session.getDefaultInstance(props, null);
        
        String messagebody = String.format("Dear %s %n"
                + "%n"
                + "Your account is now ready to login and submit availibility at URL %n"
                + "%n"
                + "login: %s %n"
                + "password: %s %n"
                + "%n"
                + "Regards,"
                + "Administration",getName(), getEmail(), RandomStringUtils.random(8));
        try{
            Message msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress("admin@poised-resource-99801.appspotmail.com", "Administration"));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(getEmail(), getName()));
            msg.setSubject("Your account has been activated");
            msg.setText(messagebody);
            Transport.send(msg);
        }
        catch 
                (MessagingException | UnsupportedEncodingException ex) {
             Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
         }
        //hash the string and set the employee's password to the hashed one. USED SHA256
        System.out.println(pass);
        String hash = DigestUtils.sha256Hex(pass);
        return hash;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Boolean getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(Boolean firstLogin) {
        this.firstLogin = firstLogin;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Key getKey() {
        return this.key;
    }

    public void setKey(Key id) {
        this.key = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMinhours() {
        return minhours;
    }

    public void setMinhours(Double minhours) {
        this.minhours = minhours;
    }

    public Double getMaxhours() {
        return maxhours;
    }

    public void setMaxhours(Double maxhours) {
        this.maxhours = maxhours;
    }

    public Double getCurrenthours() {
        return currenthours;
    }

    public void setCurrenthours(Double currenthours) {
        this.currenthours = currenthours;
    }

    public List<Shift> getAvailableShifts() {
        return availableShifts;
    }

    public void setAvailableShifts(List<Shift> availableShifts) {
        this.availableShifts = availableShifts;
    }

    public List<Shift> getCompletedShifts() {
        return completedShifts;
    }

    public void setCompletedShifts(List<Shift> completedShifts) {
        this.completedShifts = completedShifts;
    }
     
     
    
    public void addAvailableShift(Shift shift){
        
        availableShifts.add(shift);
    }
    
    public void addCompletedShift(Shift shift){
        
        completedShifts.add(shift);
    }
     
    
}
