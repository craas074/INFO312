<%-- 
    Document   : login
    Created on : 4/08/2015, 3:36:57 PM
    Author     : cameron
--%>

<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.ShiftDAO"%>
<%@page import="domain.Shift"%>
<%@page import="domain.Employee"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Date"%>

<% //if already logged in send to the index page
    if (request.getSession(false) == null) {
        response.sendRedirect("index.jsp");
    }
%>
<%
    if (request.getParameter("employeeFound") != null) {
        if (request.getParameter("employeeFound").equals("false")) {
%>
<p id="warning">Username or password incorrect</p>
<%
        }
    }
%>

<html>
    <head>
        <title>Unipol Availability Submission</title>

        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="assets/css/main.css" />
    </head>
    <body id="top">


        <!-- Main -->
        <div>

            <section id="one">

                <div style="width: 200px;margin: auto;">
                    <a href="#" class="image avatar"><img src="images/otago1.jpg" alt="" /></a>
                    <form action="DoLogin" method="post">
                        <label for="username">Username</label>
                        <input type="text" name="username">
                        <label for="password">Password</label>
                        <input type="password" name="password">
                        <input type="submit" value="login">
                    </form> 
                </div>
                
            </section>
    </body>
</html>

