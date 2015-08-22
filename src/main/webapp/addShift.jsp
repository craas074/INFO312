<%-- 
    Document   : addShift
    Created on : Aug 4, 2015, 9:15:42 PM
    Author     : benjamindawson-bruce
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add a Shift</h1>
        <form name="addShiftForm" method="post" action="/AddShiftServlet">

            <label>Start:<input type="text" name="start"/></label>
            <label>End:<input type="text" name="end"/></label>
            <label>Date:<input type="text" name="date"/></label>
            <label>Employee:<input type="text" name="employee"/></label>
           
            <button type="submit">Add Shift</button>
        </form>
    </body>
</html>
