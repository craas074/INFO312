<%-- 
    Document   : employees
    Created on : 21/08/2015, 2:31:39 PM
    Author     : cameron
--%>

<%@page import="dao.EmployeeDAO"%>
<%@page import="domain.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employees</title>
    </head>
    <body>
        <h1>Employees</h1>
        
        <table>
            <tr>
                <th>Name</th><th>Email</th><th>Minimum Hours</th><th>Maximum Hours</th><th>Edit</th>
            </tr>
            <% 
                //get all employees as an arraylist
                for(Employee e : EmployeeDAO.getAll()){
                    %>
                    <tr>
                        <td><%= e.getName() %></td>
                        <td><%= e.getEmail() %></td>
                        <td><%= e.getMinhours()%></td>
                        <td><%= e.getMaxhours() %></td>
                        <td><%= e.getId() %></td>
                        <td><a href="/admin/editemployee.jsp?email=<%=e.getEmail()%>">Edit</a></td>
                    </tr>
                    <%
                }
            %>
        </table>
        
    </body>
</html>
