<%-- 
    Document   : adminRoster
    Created on : Aug 10, 2015, 3:00:37 PM
    Author     : benjamindawson-bruce
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Collection"%>
<%@page import="dao.ShiftDAO"%>
<%@page import="domain.Shift"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>

    <head>
        <title>Administrator Roster</title>

    </head>

    <body>

        <h1>Shifts</h1>

        <%

            List<Shift> shifts = new ShiftDAO().getShifts();


        %>


<!--
       <div id="daysmenu">
            Day: <a href="/adminRoster.jsp">
            </a>

            <a href="/adminRoster.jsp">Mon
            </a>
            <a href="/adminRoster.jsp">Tue
            </a>
            <a href="/adminRoster.jsp">Wed
            </a>
            <a href="/adminRoster.jsp">Thu
            </a>
            <a href="/adminRoster.jsp">Fri
            </a>
            <a href="/adminRoster.jsp">Sat
            </a>
            <a href="/adminRoster.jsp">Sun
            </a>


        </div>-->




        <table border="1"
               <caption>Monday</caption>
               <thead>
                    
                <tr>
                    <th>Shift</th>
                    <th>Date</th>
                    <th>Employee</th>


                </tr>
            </thead>
            <tbody>

                <% for (Shift shift : shifts) {

                        Calendar c = Calendar.getInstance();
                        c.setTime(shift.getDate());
                        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

                        // sunday = 1 , monday = 2 ......
                        
                       if (dayOfWeek == 1) {
                        
                        //tablehead = mon
                             
                       // else if (dayOfWeek == 2){
                        
                        //table head = tuesday

                %>

                <tr>
                    <td><%=shift.getDate()%></td>

                    <td><%=shift.getStart() + "-" + shift.getEnd()%></td>

                    <td><%=shift.getEmployee().getName()%></td>

                    <td><form action="/SelectedShiftServlet"><button type="submit" name="shiftId" value="<%=shift.getId()%>">Amend</button></form></td> 
                </tr>

                

            </tbody>
        </table>
                
              
                <table border="1"
               <caption>Tuesday</caption>
               <thead>
                    
                <tr>
                    <th>Shift</th>
                    <th>Date</th>
                    <th>Employee</th>


                </tr>
            </thead>
            <tbody>

                <% //for (Shift shift : shifts) {

                       // Calendar c = Calendar.getInstance();
                       // c.setTime(shift.getDate());
                       // int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);

                        // sunday = 1 , monday = 2 ......
                        
                     //   if (dayOfWeek == 1) {
                        
                        //tablehead = mon
                             
                       // else if (dayOfWeek == 2){
                        
                        //table head = tuesday
                        
                        if (dayOfWeek == 2) {
                %>

                <tr>
                    <td><%=shift.getDate()%></td>

                    <td><%=shift.getStart() + "-" + shift.getEnd()%></td>

                    <td><%=shift.getEmployee().getName()%></td>

                    <td><form action="/SelectedShiftServlet"><button type="submit" name="shiftId" value="<%=shift.getId()%>">Amend</button></form></td> 
                </tr>

                

            </tbody>
        </table>
                
                <form action="/addShift.jsp"><button type="submit" name="newshift" value="">Create Shift</button></form>

    </body>
</html>
