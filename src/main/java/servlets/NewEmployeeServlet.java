/*

 */
package servlets;

import dao.EmployeeDAO;
import domain.Employee;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cameron
 */
@WebServlet("/new-employee")
public class NewEmployeeServlet extends HttpServlet {


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
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        Double minhrs = Double.parseDouble(request.getParameter("minHrs"));
        Double maxhrs = Double.parseDouble(request.getParameter("maxHrs"));
        
        Employee e = new Employee(name,email,minhrs,maxhrs);
        EmployeeDAO.addEmployee(e);
        
        response.sendRedirect("/admin/employees.jsp?newEmployee="+e.getId()+"&passwd="+e.getPassword());
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
