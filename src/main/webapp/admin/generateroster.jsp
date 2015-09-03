<%-- 
    Document   : generateroster
    Created on : 3/09/2015, 2:46:16 PM
    Author     : cameron
    Designed to solve the chicken vs egg problem. New batch of shifts should be
    created at time that they are ready to be processed. 
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="domain.DateContainer"%>
<%@page import="dao.DateContainerDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String newDate = "";
    try {
            DateContainer dc = DateContainerDAO.getContainer();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            int day = Integer.parseInt(dc.getDay());
            int month = Integer.parseInt(dc.getMonth());
            int year = Integer.parseInt(dc.getYear());
            Calendar calendar = new GregorianCalendar(year, month, day);
            calendar.add(Calendar.DAY_OF_MONTH, 21);
            newDate = sdf.format(calendar.getTime());
        } catch (Exception e) {
            System.out.println("no date");
        }
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Generate New Roster</title>
    </head>
    <body>
        <h1>Generate Roster</h1>
        
        <form action = "/initRoster" method = "post" name="initRoster">
            <label for ="startDate">Starting Date</label>
            <input type ="text" name="startDate" id="startDate" value="<%= newDate %>">
            <input type="submit" value="Go!">
        </form>
    </body>
</html>
