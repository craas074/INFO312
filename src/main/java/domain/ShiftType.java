/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author ashtoncranmer
 */
public class ShiftType {

    private String start;
    private String finish;
    private String type;

    public ShiftType(String start, String finish) {
        this.start = start;
        this.finish = finish;
        this.type = "";
    }

    public ShiftType(String start, String finish, String type) {
        this.start = start;
        this.finish = finish;
        this.type = type;
    }

    public String getStart() {
        return start;
    }

    public String getFinish() {
        return finish;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        
        if (type.equals("")){
            return start + " - " + finish;
        } else {
            return start + " - " + finish + " (" + type + ")";
        }
        
    }

    

    
}
