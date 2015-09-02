/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.EmployeeDAO;
import dao.ShiftDAO;
import domain.Employee;
import domain.Shift;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author ashtoncranmer
 */
@WebServlet(name = "EmployeeAvailabilityServlet", urlPatterns = {"/EmployeeAvailabilityServlet"})
public class EmployeeAvailabilityServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Shift shift;
        ShiftDAO shiftDAO = new ShiftDAO();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");          
        String[] shifts = request.getParameterValues("shifts");
        HttpSession session = request.getSession();
        String employeeId = (String) session.getAttribute("email");
        System.out.println(employeeId);
        ArrayList<Shift> newShifts = new ArrayList<>();
        if (shifts != null) {
            for (String selectedShift : shifts) {

                String sDate = selectedShift.split(" ")[0];
                String sStart = selectedShift.split(" ")[1];
                String sFinish = selectedShift.split(" ")[2];

                try {
                    
                    //Date d = formatter.parse(sDate);
                    Date date = formatter.parse(sDate); // for testing only
                    System.out.println("Date: " + date.toString() + "||| Formatted date: " + formatter.format(new Date()));
                    //shift = new Shift(employeeId, start, finish, d);
                    shift = new Shift(sStart, sFinish, date);
                    newShifts.add(shift);
                    
                } catch (ParseException ex) {
                    System.out.println("ex");
                }   
            }
            for(Shift shifty: newShifts){
                System.out.println(shifty);
            }
            EmployeeDAO.editAvailibleShifts(employeeId, newShifts);
            
            /* -------------------Testing------------------*/
            Employee e = EmployeeDAO.getEmployeeByEmail(employeeId);
            System.out.println(e.toString());
            //-----------------------------------------------
        }
        
        //response.sendRedirect("/index.jsp");
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
