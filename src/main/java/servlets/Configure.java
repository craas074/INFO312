/*

 */
package servlets;

import dao.AvailabilityDAO;
import dao.DateContainerDAO;
import dao.EmployeeDAO;
import domain.Availability;
import domain.DateContainer;
import domain.Employee;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cameron creates some test data
 */
@WebServlet(name = "Configure", urlPatterns = {"/Configure"})
public class Configure extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    //sets DateContainer to next Monday
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {

        response.setContentType("text/html;charset=UTF-8");
        Calendar now = Calendar.getInstance();
        int weekday = now.get(Calendar.DAY_OF_WEEK);
        if (weekday != Calendar.MONDAY) {
            // calculate how much to add
            // the 2 is the difference between Saturday and Monday
            int days = (Calendar.SATURDAY - weekday + 2) % 7;
            now.add(Calendar.DAY_OF_YEAR, days);
        }
        // now is the date you want
        Date date = now.getTime();
        String format = new SimpleDateFormat("dd/MM/yyyy").format(date);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int month = now.get(Calendar.MONTH);
        int year = now.get(Calendar.YEAR);
        DateContainer c = new DateContainer(Integer.toString(day), Integer.toString(month), Integer.toString(year));
        DateContainerDAO.saveContainer(c);
        //if someone could add a bunch of employees and availabilities that'd be awesome.
        //credit benjamin
        EmployeeDAO.addEmployee(new Employee("1", "cam@gmail.com", "707A3C64C7C00E52AE880442B769029D2D1328A29941DF71C53332D153F87820", "Cam", 1.0, 40.0, 15.0, false));
        EmployeeDAO.addEmployee(new Employee("2", "ben@gmail.com", "6700869C8FF7480E34A70A708B028700DBAA3A033B5652B903AFE89F49A31456", "Ben", 10.0, 40.0, 10.0, false));
        EmployeeDAO.addEmployee(new Employee("3", "jake@gmail.com", "CDF30C6B345276278BEDC7BCEDD9D5582F5B8E0C1DD858F46EF4EA231F92731D", "Jake", 8.0, 40.0, 15.0, false));
        EmployeeDAO.addEmployee(new Employee("4", "kistina@gmail.com", "A1F89F10C5FE5D3F950FE5C3A333504F3D85BC4977FD2FB716020DA77284071A", "Kistina", 1.0, 40.0, 15.0, false));
        EmployeeDAO.addEmployee(new Employee("5", "ashton@gmail.com", "127278762A70FEA92147A0C32C8BAEC2BD8F0CF8B6597613BA5C17C6263E886F", "Ashton", 10.0, 40.0, 15.0, false));
        EmployeeDAO.addEmployee(new Employee("6", "sam@gmail.com", "E96E02D8E47F2A7C03BE5117B3ED175C52AA30FB22028CF9C96F261563577605", "Sam", 1.0, 40.0, 15.0, false));
        EmployeeDAO.addEmployee(new Employee("7", "katie@gmail.com", "3460EB8087523E19AC486F37FC68192C2DCD087814A2A9C9AD6B668FEE3E0134", "Katie", 10.0, 20.0, 20.0, false));
        EmployeeDAO.addEmployee(new Employee("8", "ellis@gmail.com", "3C5DDD0948295663886511E0FD7A3AA89A86837D620648B702CC698C836F0166", "Ellis", 5.0, 20.0, 15.0, false));
        EmployeeDAO.addEmployee(new Employee("9", "lewis@gmail.com", "6C725C744767E0D745901FB74154FFD59924DCE57F1CB2D0137E368606BDFB62", "Lewis", 5.0, 10.0, 10.0, false));
        EmployeeDAO.addEmployee(new Employee("10", "fiona@gmail.com", "4C0DB82499CA9A6D65C396D1FBB8E77078E315BD8DB0E9476A88CD244AA76CA6", "Fiona", 5.0, 30.0, 25.0, false));

        try { 
        //and some availabilities
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy");

        //Monday
        AvailabilityDAO.addAvailability(new Availability("cam@gmail.com", "0845", "0900", sourceFormat.parse("07/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("ben@gmail.com", "0900", "1200", sourceFormat.parse("07/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("kistina@gmail.com", "1200", "1500", sourceFormat.parse("07/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("jake@gmail.com", "1500", "1900", sourceFormat.parse("07/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("cam@gmail.com", "1900", "2300", sourceFormat.parse("07/09/2015")));

        //Tuesday
        AvailabilityDAO.addAvailability(new Availability("fiona@gmail.com", "0545", "0845", sourceFormat.parse("08/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("cam@gmail.com", "0600", "0900", sourceFormat.parse("08/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("ben@gmail.com", "0900", "1200", sourceFormat.parse("08/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("kistina@gmail.com", "1200", "1500", sourceFormat.parse("08/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("sam@gmail.com", "1500", "1900", sourceFormat.parse("08/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("cam@gmail.com", "1900", "2300", sourceFormat.parse("08/09/2015")));

         //Wednesday
        AvailabilityDAO.addAvailability(new Availability("fiona@gmail.com", "0545", "0845", sourceFormat.parse("09/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("ellis@gmail.com", "0845", "1200", sourceFormat.parse("09/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("ben@gmail.com", "0900", "1200", sourceFormat.parse("09/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("kistina@gmail.com", "1200", "1500", sourceFormat.parse("09/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("jake@gmail.com", "1500", "1900", sourceFormat.parse("09/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("lewis@gmail.com", "1900", "2300", sourceFormat.parse("09/09/2015")));

         //Thursday
        AvailabilityDAO.addAvailability(new Availability("fiona@gmail.com", "0545", "0845", sourceFormat.parse("10/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("sam@gmail.com", "0600", "0900", sourceFormat.parse("10/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("ben@gmail.com", "0900", "1200", sourceFormat.parse("10/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("kistina@gmail.com", "1200", "1500", sourceFormat.parse("10/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("jake@gmail.com", "1500", "1900", sourceFormat.parse("10/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("lewis@gmail.com", "1900", "2300", sourceFormat.parse("10/09/2015")));

         //Friday
        AvailabilityDAO.addAvailability(new Availability("fiona@gmail.com", "0545", "0845", sourceFormat.parse("11/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("fiona@gmail.com", "0600", "0900", sourceFormat.parse("11/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("ben@gmail.com", "0900", "1200", sourceFormat.parse("11/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("kistina@gmail.com", "1200", "1500", sourceFormat.parse("11/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("jake@gmail.com", "1500", "1900", sourceFormat.parse("11/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("ashton@gmail.com", "1900", "2300", sourceFormat.parse("11/09/2015")));

         //Saturday
        AvailabilityDAO.addAvailability(new Availability("ashton@gmail.com", "0545", "0845", sourceFormat.parse("12/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("cam@gmail.com", "0845", "1200", sourceFormat.parse("12/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("ben@gmail.com", "0900", "1200", sourceFormat.parse("12/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("kistina@gmail.com", "1200", "1500", sourceFormat.parse("12/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("jake@gmail.com", "1500", "1900", sourceFormat.parse("12/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("ashton@gmail.com", "1900", "2300", sourceFormat.parse("12/09/2015")));

         //Sunday 
        AvailabilityDAO.addAvailability(new Availability("fiona@gmail.com", "0745", "1300", sourceFormat.parse("13/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("lewis@gmail.com", "0800", "1300", sourceFormat.parse("13/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("ellis@gmail.com", "1300", "1700", sourceFormat.parse("13/09/2015")));
        AvailabilityDAO.addAvailability(new Availability("kistina@gmail.com", "1500", "2100", sourceFormat.parse("13/09/2015")));

        response.sendRedirect("/admin/employees.jsp");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
