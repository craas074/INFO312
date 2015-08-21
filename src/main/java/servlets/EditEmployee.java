/*

 */
package servlets;

import dao.EmployeeDAO;
import domain.Employee;
import java.io.IOException;
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
                request.getParameter("name"),
                request.getParameter("email"),
                Double.parseDouble(request.getParameter("minHrs")),
                Double.parseDouble(request.getParameter("maxHrs")));
        response.sendRedirect("/admin/employees.jsp");
                
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
