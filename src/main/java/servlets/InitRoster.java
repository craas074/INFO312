/*

 */
package servlets;

import dao.DateContainerDAO;
import dao.RosterDAO;
import domain.DateContainer;
import domain.Roster;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cameron
 */
@WebServlet(name = "InitRoster", urlPatterns = {"/admin/initRoster"})
public class InitRoster extends HttpServlet {

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String newDate = "";
        try {
            
            //set the DateContainer forward
            DateContainer dc = DateContainerDAO.getContainer();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            int day = Integer.parseInt(dc.getDay());
            int month = Integer.parseInt(dc.getMonth());
            int year = Integer.parseInt(dc.getYear());
            Calendar calendar = new GregorianCalendar(year, month, day);
            calendar.add(Calendar.DAY_OF_MONTH, 21);
            int newDay = calendar.get(Calendar.DAY_OF_MONTH);
            int newmonth = calendar.get(Calendar.MONTH);
            int newyear = calendar.get(Calendar.YEAR);
            DateContainer c = new DateContainer(Integer.toString(newDay), Integer.toString(newmonth), Integer.toString(newyear));
            DateContainerDAO.deleteContainer();
            DateContainerDAO.saveContainer(c);
            Roster r = new Roster(DateContainerDAO.getContainer());
            RosterDAO.save(r);
            response.sendRedirect("/admin/employees.jsp");
        } catch (NumberFormatException | ParseException e) {
            System.out.println("no date");
        }
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
