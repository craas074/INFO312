<%-- 
    Document   : ammendShift
    Created on : Aug 4, 2015, 9:16:14 PM
    Author     : benjamindawson-bruce
--%>

<%@page import="domain.Shift"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
          Shift shift = (Shift) session.getAttribute("shift");
        %>
        

<html>
    <head><title></title></head>
    
    
    
    <body>
      
        <h1>Amend Shift</h1>
        <p> ShiftID <%=shift.getId()%> <p>
        <p> Start <%=shift.getStart()%> <p>
        <p> End <%=shift.getEnd()%> <p>
        <p> Date <%=shift.getDate()%> <p>
            
        <form action="/AmendShiftServlet" method="post">
            
            <fieldset>
                <legend>Employee</legend>
                <label>Employee:<input type="text" name="employee"/></label>
                
                <button type="submit">Save Changes</button>
            </fieldset>
        </form>
    </body>
</html>