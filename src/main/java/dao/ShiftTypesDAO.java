/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.google.appengine.repackaged.com.google.common.collect.ArrayListMultimap;
import com.google.appengine.repackaged.com.google.common.collect.Multimap;
import domain.ShiftType;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author ashtoncranmer
 */
public final class ShiftTypesDAO {

    Multimap<String, ShiftType> map = ArrayListMultimap.create();
    ArrayList<String> days = new ArrayList();
    

    public ShiftTypesDAO() {

        days.add("MON");
        days.add("TUES");
        days.add("WED");
        days.add("THU");
        days.add("FRI");
        days.add("SAT");
        days.add("SUN");

        for (String day : days) {
            
            switch (day) {
                
                case "SAT":
                    map.put(day, new ShiftType("0745", "1300"));
                    map.put(day, new ShiftType("0800", "1300"));
                    map.put(day, new ShiftType("0800", "1300", "C10"));
                    map.put(day, new ShiftType("1300", "1700"));
                    map.put(day, new ShiftType("1700", "2100"));
                    break;
                    
                case "SUN":
                    map.put(day, new ShiftType("0845", "1200"));
                    map.put(day, new ShiftType("0900", "1200"));
                    map.put(day, new ShiftType("1200", "1500"));
                    map.put(day, new ShiftType("1500", "1900"));
                    map.put(day, new ShiftType("1900", "2300"));
                    map.put(day, new ShiftType("1900", "2300", "W8"));
                    break;
                    
                default:
                    map.put(day, new ShiftType("0545", "0900"));
                    map.put(day, new ShiftType("0600", "0900", "C13"));
                    map.put(day, new ShiftType("0900", "1200", "C13"));
                    map.put(day, new ShiftType("0900", "1200"));
                    map.put(day, new ShiftType("1200", "1500"));
                    map.put(day, new ShiftType("1500", "1900", "C10"));
                    map.put(day, new ShiftType("1500", "1900"));
                    map.put(day, new ShiftType("1900", "2300", "C11"));
                    map.put(day, new ShiftType("1900", "2300"));
                    break;
            }
        } 
    }
    
    public Collection getShiftsForDay(String day){
        
        Collection <ShiftType> coll = (Collection) map.get(day);
        return coll;
       
    }
    
    public void setNewType(String day, String start, String finish, String type, String newType){
        
        Collection<ShiftType> shiftTypes = map.get(day);
        
        for (ShiftType st : shiftTypes){
            
            String s = st.getStart();
            String f = st.getFinish();
            String t = st.getType();
            
            if (start.equals(s) && finish.equals(f) && type.equals(t)){
                
                st.setType(newType);
            }
        } 
    }
   
}
