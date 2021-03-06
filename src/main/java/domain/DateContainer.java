/*

 */

package domain;

import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 *
 * @author cameron
 * @version 0.1
 */
@PersistenceCapable
public class DateContainer {
    
    @PrimaryKey
    @Persistent
    private int id;
    @Persistent
    private String day;
    @Persistent
    private String month;
    @Persistent
    private String year;

    public DateContainer(String day, String month, String year) {
        this.id = 1;
        this.day = day;
        this.month = month;
        this.year = year;
    }


    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    
            
}
