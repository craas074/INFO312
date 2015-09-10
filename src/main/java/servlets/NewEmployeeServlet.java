/*

 */
package servlets;

import dao.EmployeeDAO;
import domain.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cameron
 */
@WebServlet("/newEmployee")
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
        String name= request.getParameter("ename");
        String email= request.getParameter("email");
        double minhrs = Double.parseDouble(request.getParameter("minHours"));
        double maxhrs = Double.parseDouble(request.getParameter("maxHours"));
        
        Employee e = new Employee(name, email, minhrs, maxhrs);
        EmployeeDAO.addEmployee(e);
        
        response.sendRedirect("newEmployee.jsp");
        //response.sendRedirect("newEmployee.jsp\"?newEmployee="+e.getId()+"&passwd="+e.getPassword());

    }

}
