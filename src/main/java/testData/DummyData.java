package testData;

import domain.Employee;
import domain.Shift;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jake Wysocki
 */
public class DummyData {

    public static void main(String[] args) {
        
        System.out.println("Inserting data");

        Employee emp1 = new Employee("Miss Admin", "blah@gmail.com", 0.0, 0.0);

        Employee emp2 = new Employee("Mr Employee", "blahblah@gmail.com", 30.0, 15.0);

        try {
            
            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        // shift times for days during the week
            //Monday
            Shift shift1 = new Shift("1", "545", "900", df.parse("01/01/2015"), emp2);

            Shift shift2 = new Shift("2", "600", "900", df.parse("01/01/2015"), emp2);

            Shift shift3 = new Shift("3", "900", "1200", df.parse("01/01/2015"), emp2);

            Shift shift4 = new Shift("4", "1200", "300", df.parse("01/01/2015"), emp2);

            Shift shift5 = new Shift("5", "300", "700", df.parse("01/01/2015"), emp2);

            Shift shift6 = new Shift("6", "700", "1100", df.parse("01/01/2015"), emp2);

            //Tuesday
            Shift shift7 = new Shift("7", "545", "900", df.parse("02/01/2015"), emp2);

            Shift shift8 = new Shift("8", "600", "900", df.parse("02/01/2015"), emp2);

            Shift shift9 = new Shift("9", "900", "1200", df.parse("02/01/2015"), emp2);

            Shift shift10 = new Shift("10", "1200", "300", df.parse("02/01/2015"), emp2);

            Shift shift11 = new Shift("11", "300", "700", df.parse("02/01/2015"), emp2);

            Shift shift12 = new Shift("12", "700", "1100", df.parse("02/01/2015"), emp2);

            //Wednesday
            Shift shift13 = new Shift("13", "545", "900", df.parse("03/01/2015"), emp2);

            Shift shift14 = new Shift("14", "600", "900", df.parse("03/01/2015"), emp2);

            Shift shift15 = new Shift("15", "900", "1200", df.parse("03/01/2015"), emp2);

            Shift shift16 = new Shift("16", "1200", "300", df.parse("03/01/2015"), emp2);

            Shift shift17 = new Shift("17", "300", "700", df.parse("03/01/2015"), emp2);

            Shift shift18 = new Shift("18", "700", "1100", df.parse("03/01/2015"), emp2);

            //Thurday
            Shift shift19 = new Shift("19", "545", "900", df.parse("04/01/2015"), emp2);

            Shift shift20 = new Shift("20", "600", "900", df.parse("04/01/2015"), emp2);

            Shift shift21 = new Shift("21", "900", "1200", df.parse("04/01/2015"), emp2);

            Shift shift22 = new Shift("22", "1200", "300", df.parse("04/01/2015"), emp2);

            Shift shift23 = new Shift("23", "300", "700", df.parse("04/01/2015"), emp2);

            Shift shift24 = new Shift("24", "700", "1100", df.parse("04/01/2015"), emp2);

            //Friday
            Shift shift25 = new Shift("25", "545", "900", df.parse("05/01/2015"), emp2);

            Shift shift26 = new Shift("26", "600", "900", df.parse("05/01/2015"), emp2);

            Shift shift27 = new Shift("27", "900", "1200", df.parse("05/01/2015"), emp2);

            Shift shift28 = new Shift("28", "1200", "300", df.parse("05/01/2015"), emp2);

            Shift shift29 = new Shift("29", "300", "700", df.parse("05/01/2015"), emp2);

            Shift shift30 = new Shift("30", "700", "1100", df.parse("05/01/2015"), emp2);

        //Weekend Shifts
            //Saturday
            Shift shift31 = new Shift("31", "745", "100", df.parse("06/01/2015"), emp2);

            Shift shift32 = new Shift("32", "800", "100", df.parse("06/01/2015"), emp2);

            Shift shift33 = new Shift("33", "100", "500", df.parse("06/01/2015"), emp2);

            Shift shift34 = new Shift("34", "500", "900", df.parse("06/01/2015"), emp2);

            //Sunday 
            Shift shift35 = new Shift("35", "845", "1200", df.parse("07/01/2015"), emp2);

            Shift shift36 = new Shift("36", "900", "1200", df.parse("07/01/2015"), emp2);

            Shift shift37 = new Shift("37", "1200", "300", df.parse("07/01/2015"), emp2);

            Shift shift38 = new Shift("38", "300", "700", df.parse("07/01/2015"), emp2);

            Shift shift39 = new Shift("39", "700", "1100", df.parse("07/01/2015"), emp2);

        } catch (ParseException ex) {

        }
    }

}
