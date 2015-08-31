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
@WebServlet(name = "ShiftAmendmentFinalise", urlPatterns = {"/ShiftAmendmentFinalise"})
public class ShiftAmendmentFinalise extends HttpServlet {

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

        
        String[] things = request.getParameterValues("newTimes");
        HttpSession session = request.getSession();
        String shifty = (String) session.getAttribute("shiftId");
        Integer shiftId = Integer.parseInt(shifty);
       
        String sHour = "";
        String sMin = "";
        String fHour = "";
        String fMin = "";

        for (String thing : things){
            sHour = thing.split(" ")[0];
            sMin = thing.split(" ")[1];
            fHour = thing.split(" ")[2];
            fMin = thing.split(" ")[3];
         }
        
        System.out.println(shiftId + "<< finalise");
        
        ShiftDAO dao = new ShiftDAO();
        Shift shift = dao.getById(shiftId);
        shift.setStart(sHour + sMin);
        shift.setEnd(fHour + fMin);
        
        response.sendRedirect("adminRosterWeekOne.jsp");
        
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
