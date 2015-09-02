/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import dao.ShiftDAO;
import domain.Shift;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author benjamindawson-bruce
 */
@WebServlet(name = "AmendShiftServlet", urlPatterns = {"/AmendShiftServlet"})
public class ShiftAmendmentSetup extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.text.ParseException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String[] employeeDetails = request.getParameterValues("employeeDetails");
        SimpleDateFormat initialFormat = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy");
        SimpleDateFormat requiredFormat = new SimpleDateFormat("dd/MM/yyyy");

        String employee = employeeDetails[0];
        String start = employeeDetails[1];
        String finish = employeeDetails[2];
        String employeeId = employeeDetails[4];
        String shiftId = employeeDetails[5];
        String date = "";
        System.out.println(shiftId + "<< setup");
        try {

            Date parsedDate = initialFormat.parse(employeeDetails[3]);
            date = requiredFormat.format(parsedDate);

        } catch (ParseException ex) {
            System.out.println(ex);
        }

        HttpSession session = request.getSession();
        session.setAttribute("employeeEdit", employee); // this will need to be checked at each page
        session.setAttribute("startEdit", start);
        session.setAttribute("finishEdit", finish);
        session.setAttribute("dateEdit", date);
        session.setAttribute("employeeId", employeeId);
        session.setAttribute("shiftId", shiftId);

        response.sendRedirect("amendShift.jsp");
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
