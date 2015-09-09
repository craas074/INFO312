<%-- 
    Document   : logout
    Created on : 7/09/2015, 1:30:07 PM
    Author     : cameron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% session.invalidate();
response.sendRedirect("/login.jsp");
return;
%>