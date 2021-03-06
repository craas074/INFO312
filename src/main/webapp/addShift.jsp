
<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.ShiftDAO"%>
<%@page import="domain.Shift"%>
<%@page import="domain.Employee"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="dao.EmployeeDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>


<%
    
    List <Employee>availableEmployees = new ArrayList(); 
    ArrayList <Employee>allEmployees = new ArrayList(EmployeeDAO.getAll());
    
%>

<html>
    <head>
        <title>Unipol Availability Submission</title>

        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" href="assets/css/main.css" />
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
        <link href="/assets/timepicker/css/timepicki.css" rel="stylesheet">

    </head>
    <body id="top">

        <!-- Header -->
        <header id="header">
            <a href="#" class="image avatar"><img src="images/otago1.jpg" alt="" /></a>
            <h1><strong>Welcome, dfgdfgfh</strong>. Submit your<br />
                shift availability using the given schedules<br /></h1>
        </header>

        <!-- Main -->
        <div id="main">
            <section style="border-style: solid; border-width: 2px; padding: 2%;">
                <header class="major">
                    <h2></h2>
                    <form method="post" action="/AmendShiftFinalise" onsubmit="return submitFunc()">
                        <div class="row uniform 50%">
                            <table class="alt">

                                <tbody>
                                    <tr>
                                        <td></td>
                                        <td>Click time to set</td>
                                    </tr>
                                    <tr>
                                        <td style="vertical-align: middle; background-color: #f7f7f7;">Set start:</td>
                                        <td style="margin: 0; padding: 0;">
                                            <input style="text-align: center; background-color: white;" id="timepicker1" type="text" name="timepicker1" value="05 : 45"/>
                                    </tr>
                                    <tr>
                                        <td style="vertical-align: middle;">Set finish:</td>
                                        <td style="margin: 0; padding: 0;">
                                            <input style="text-align: center; background-color: white;" id="timepicker2" type="text" name="timepicker1" value="11 : 00"/>
                                    </tr>
                                </tbody>
                            </table>
                            <table class="alt">
                           
                                <tbody id="tBody">
                                    <tr style="background-color:  white;" >
                                        <td>Select employee from:</td>
                                        <td>
                                            <div class="4u 12u$(small)" style="height: 25px;" >
                                                <input type="radio" id="allEmployees" name="demo-priority" checked>
                                                <label for="allEmployees">All</label>
                                            </div>
                                        </td>
                                        <td>
                                            <div class="4u 12u$(small)" style="height: 25px;">
                                                <input type="radio" id="availableEmployees" name="demo-priority">
                                                <label for="availableEmployees">Available</label>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr id="selectRow">
                                        <td></td>
                                        <td>
                                            <div class="select-wrapper">
                                                <select>
                                                    <% for (Employee employee : allEmployees) {%>
                                                        <option value="<%=employee.getId() %>"><%=employee.getName() %></option>
                                                    <% }%>
                                                </select> 
                                            </div>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>


                            <div class="12u$">
                                <ul class="actions">
                                    <li><input type="submit" value="Ok" class="special" /></li>
                                    <li><input type="reset" value="Reset" onclick="reset()" /></li>
                                </ul>
                            </div>
                        </div>              
                    </form>
            </section>

            <!-- Footer -->
            <footer id="footer">
                <ul class="icons">
                    <li><a href="https://www.facebook.com/UnipolRecreationServices" class="icon fa-facebook"><span class="label">Facebook</span></a></li>
                    <!--<li><a href="#" class="icon fa-github"><span class="label">Github</span></a></li>
                    <li><a href="#" class="icon fa-dribbble"><span class="label">Dribbble</span></a></li> -->
                    <li><a href="#" class="icon fa-envelope-o"><span class="label">Email</span></a></li>
                </ul>
                <ul class="copyright">
                    <li>&copy; Unipol</li><li>Design: <a href="">University of Otago</a></li>
                </ul>
            </footer>


            <!-- Timepicker scripts -->
            <script src="/assets/js/jquery.min.js"></script>
            <script src="/assets/timepicker/js/timepicki.js"></script>
            <script>$('#timepicker1').timepicki();</script>
            <script>$('#timepicker2').timepicki();</script>
            <script src="/assets/timepicker/js/bootstrap.min.js"></script>


            <!-- Scripts -->
            <script src="assets/js/jquery.poptrox.min.js"></script>
            <script src="assets/js/skel.min.js"></script>
            <script src="assets/js/util.js"></script>
            <!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
            <script src="assets/js/main.js"></script>

            <!-- Timepicker config -->
            <script type="text/javascript">$('#timepicker1').timepicki(
                        {start_time: ["5", "30"]});
            </script>
            <script type="text/javascript">$('#timepicker2').timepicki(
                        {start_time: ["5", "30"]});
            </script>

            <script type="text/javascript">

                reset(); // preload current times as selected values

                function reset() {
                    document.getElementById("timepicker1").setAttribute('data-timepicki-tim', "");
                    document.getElementById("timepicker1").setAttribute('data-timepicki-mini', "");
                    document.getElementById("timepicker2").setAttribute('data-timepicki-tim', "");
                    document.getElementById("timepicker2").setAttribute('data-timepicki-mini', "");
                }
                // If page is refreshed, send back to roster page (so we don't need to persist chosen times in a session)
                if (sessionStorage.getItem("is_reloaded")) {
                    sessionStorage.clear();
                    history.go(-1);
                } else {
                    sessionStorage.setItem("is_reloaded", true);
                }
                
                function submitFunc() {
                    
                   var sHour = document.getElementById("timepicker1").getAttribute("data-timepicki-tim");
                   var sMin = document.getElementById("timepicker1").getAttribute("data-timepicki-mini");
                   var fHour = document.getElementById("timepicker2").getAttribute("data-timepicki-tim");
                   var fMin = document.getElementById("timepicker2").getAttribute("data-timepicki-mini");
                   
                   var confirmed = confirm("  Confirm shift?\n\n" + sHour + " : " + sMin + "  –  " + fHour + " : " + fMin );

                   if (confirmed === true){
                       console.log("here");
                       $("#newTimes").append("<input name='newTimes' id='' type='text' value='" + sHour + " " + sMin + " " + fHour + " " + fMin + "' style='display: none'/>");
                       return true;
                   } else {
                       return false;
                   }
                }
     
            </script>
            <script type="text/javascript"> // handle radio buttons
                 
                var ex1 = document.getElementById('allEmployees');
                var ex2 = document.getElementById('availableEmployees');

                ex1.onclick = handlerAll;
                ex2.onclick = handlerAvail;
               
                
                function handlerAll() {
                   $("#selectRow").remove(); 
                   $("#tBody").append("<tr id='selectRow'></tr>");
                   $("#selectRow").append("<td></td><td><div id='selectCell' class='select-wrapper'></div></td>");
                   $("#selectCell").append("<select id='selectBox';></select>");
                   
                   <% for (Employee employee : allEmployees) {%>
                   
                        $("#selectBox").append("<option value='<%=employee.getId() %>'><%=employee.getName()%></option>");
                                            
                   <% }%>
                   }
                
                function handlerAvail() {
                   $("#selectRow").remove(); 
                   $("#tBody").append("<tr id='selectRow'></tr>");
                   $("#selectRow").append("<td></td><td></td><td><div id='selectCell' class='select-wrapper'></div></td>");
                   $("#selectCell").append("<select id='selectBox';></select>");
                   
                   <% for (Employee employee : availableEmployees) {%>
                   
                        $("#selectBox").append("<option value='<%=employee.getId() %>'><%=employee.getName()%></option>");
                                            
                   <% }%>
                }
                
                
            </script>
        </div>  
    </body>
</html>



