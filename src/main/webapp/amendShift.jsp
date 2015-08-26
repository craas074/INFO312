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


<%

    String name = (String) session.getAttribute("employeeEdit");
    String start = (String) session.getAttribute("startEdit");
    String finish = (String) session.getAttribute("finishEdit");
    String date = (String) session.getAttribute("dateEdit");
    String fillStartHours = start.substring(0, 2);
    String fillStartMins = start.substring(2, 4);
    String fillFinishHours = finish.substring(0, 2);
    String fillFinishMins = finish.substring(2, 4);

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
                    <h2>Amend shift for <%=name%></h2>

                    <!-- get the values = document.getElementById("timepicker1").getAttribute("data-timepicki-tim")-->
                    
                    <form method="post" action="#">
                        <div class="row uniform 50%">
                            <table class="alt" ">
                                <thead>
                                    <tr>
                                        <th>Date</th>
                                        <th>Current start</th>
                                        <th>Current finish</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td><%=date%></td>
                                        <td><%=fillStartHours%>:<%=fillStartMins%></td>
                                        <td><%=fillFinishHours%>:<%=fillFinishMins%></td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td></td>
                                        <td>Click time to set</td>
                                        <td></td>
                                    </tr>
                                    <tr>
                                        <td style="vertical-align: middle; background-color: #f7f7f7;">Set start:</td>
                                        <td style="margin: 0; padding: 0;">
                                            <input style="text-align: center; background-color: white;" id="timepicker1" type="text" name="timepicker1" value="<%=fillStartHours%>:<%=fillStartMins%>"/>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td style="vertical-align: middle;">Set finish:</td>
                                        <td style="margin: 0; padding: 0;">
                                            <input style="text-align: center; background-color: white;" id="timepicker2" type="text" name="timepicker1" value="<%=fillFinishHours%>:<%=fillFinishMins%>"/>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>

                            <div class="12u$">
                                <ul class="actions">
                                    <li><input type="submit" value="Ok" class="special" /></li>
                                    <li><input type="reset" value="Reset" /></li>
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
                    {start_time: ["<%=fillStartHours%>", "<%=fillStartMins%>"]});
            </script>

        </div>  
    </body>
</html>



