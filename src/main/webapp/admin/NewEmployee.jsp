<%-- 
    Document   : NewEmployee
    Created on : 1/08/2015, 1:08:20 AM
    Author     : cameron
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Create New Employee</h1>
        <form name="newEmployeeForm" method="post" action="">
            <label for="name">Name</label>
            <input type="text" id="name" class="formTextIn" name="name">
            <label for="email">Email</label>
            <input type="text" id="email" class="formTextIn" name="email">
            <label for="minHrs">Minimum Hours</label>
            <input type="text" id="minHrs" class="formTextIn" name="minHrs">
            <label for="maxHrs">Maximum Hours</label>
            <input type="text" id="minHrs" class="formTextIn" name="maxHrs">
            <input type="submit" value="Create Employee">
        </form>
    </body>
</html>
