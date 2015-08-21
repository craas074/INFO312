<%-- 
    Document   : editemployee
    Created on : 21/08/2015, 3:47:03 PM
    Author     : cameron
--%>

<%@page import="dao.EmployeeDAO"%>
<%@page import="domain.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% 
    Employee e = EmployeeDAO.getEmployeeById(request.getParameter("id"));
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit Employee</title>
    </head>
    <body>
        <h1>Edit Employee</h1>
        <form name="editEmployeeForm" method="post" action="/editEmployee">
            <label for="name">Name</label>
            <input type="text" id="name" class="formTextIn" name="name" value=<%='"'+e.getName()+'"'%>>
            <label for="email">Email</label>
            <input type="text" id="email" class="formTextIn" name="email" value=<%='"'+e.getEmail()+'"'%>>
            <label for="minHrs">Minimum Hours</label>
            <input type="text" id="minHrs" class="formTextIn" name="minHrs" value=<%='"'+e.getMinhours()+'"'%>>
            <label for="maxHrs">Maximum Hours</label>
            <input type="text" id="minHrs" class="formTextIn" name="maxHrs" value=<%='"'+e.getMaxhours()+'"'%>>
            <input type="hidden" name="id" value=<%='"'+e.getId()+'"'%>>
            <input type="submit" value="Edit Employee">
        </form>
        <form name="deleteEmployee" method="get" action="/deleteEmployee?id="<%=e.getId()%>>
            <input type="submit" value="Delete Employee">
        </form>
    </body>
</html>
