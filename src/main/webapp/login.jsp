<%-- 
    Document   : login
    Created on : 4/08/2015, 3:36:57 PM
    Author     : cameron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
        <% //if already logged in send to the index page
            if(request.getSession(false)==null){
                response.sendRedirect("index.jsp");
            }
        %>
        <%
            if(request.getParameter("employeeFound")!=null){
                if(request.getParameter("employeeFound").equals("false")){
            %>
            <p id="warning">Username or password incorrect</p>
            <%
                }
            }
        %>
        
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="DoLogin" method="post">
            <label for="username">Username</label>
            <input type="text" name="username">
            <label for="password">Password</label>
            <input type="password" name="password">
            <input type="submit" value="login">
        </form> 
    </body>
</html>
