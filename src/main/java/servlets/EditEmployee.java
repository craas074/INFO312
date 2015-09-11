/*

 */
package servlets;

import dao.EmployeeDAO;
import domain.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cameron
 */
public class EditEmployee extends HttpServlet {

    
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

        
        EmployeeDAO.updateEmployee(request.getParameter("id"),
                request.getParameter("ename"),
                request.getParameter("email"),
                Double.parseDouble(request.getParameter("minHours")),
                Double.parseDouble(request.getParameter("maxHours"))); 
        
        response.sendRedirect("/amendEmployee.jsp");
        
                
    }
}
