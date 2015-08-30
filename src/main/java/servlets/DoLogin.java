/*

 */
package servlets;

import com.google.appengine.repackaged.org.apache.commons.codec.digest.DigestUtils;
import dao.EmployeeDAO;
import domain.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cameron
 */
public class DoLogin extends HttpServlet {

    
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
        
        String email = request.getParameter("username");
        String passwd = request.getParameter("password");
        String hashpwd = DigestUtils.sha256Hex(passwd);
        System.out.println(email);
        System.out.println(passwd);
        System.out.println(hashpwd);
        //try{
            Employee e = EmployeeDAO.getEmployeeByEmail(email);
            if(e.getEmail().equals(email) && e.getPassword().equals(hashpwd)){
                System.out.println("employee found");
                HttpSession session = request.getSession();
                session.setAttribute("verified", e.getEmail()); // this will need to be checked at each page
                session.setAttribute("name", e.getName());
                session.setAttribute("employeeId", e.getId());
                response.sendRedirect("/index.jsp"); //this page will need to check what type of employee (i.e isAdmin) and redirect them to the correct home page
            }
            else if(e.getEmail().equals(email) && e.getPassword().equals(hashpwd) && e.getFirstLogin()==true){
                System.out.println("employee found, first login");
                HttpSession session = request.getSession();
                session.setAttribute("email", e.getEmail());
                response.sendRedirect("newPassword.jsp");
            }
            else{
                //send em packing
                response.sendRedirect("login.jsp?employeeFound=false");
            }            
        //}
        //catch(Exception ex){
           // System.out.println("Employee not found");
            //response.sendRedirect("login.jsp?employeeFound=false"); //remind me to edit the login jsp to include this functionality
       //}
        
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
