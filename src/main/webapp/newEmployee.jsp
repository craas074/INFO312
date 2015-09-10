
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
                <header class="major"></header>
                                                            
                    
                    
                
                
                <form method="post" action="">
                        
                        <div class="row uniform 50%">
                            
                            <h2>Create new employee</h2>
                            <table class="alt">
                                <tbody id="tBody">
                                    <tr style="background-color: white;" >
                                        <td>
                                            <div style="height: 32px;">
                                                <label for="firstname"><h3>First name:</h3></label>
                                            </div>
                                        </td>
                                        <td>
                                            <div style="height: 32px;">
                                                <input name="demo-name" id="firstname" type="text" size="40" required>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr style="background-color: white;" >
                                        <td>
                                            <div style="height: 32px;">
                                                <label for="lastname"><h3>Last name:</h3></label>
                                            </div>
                                        </td>
                                        <td>
                                            <div style="height: 32px;">
                                                <input name="demo-name" id="lastname" type="text" size="40" required>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr style="background-color: white;" >
                                        <td>
                                            <div style="height: 32px;">
                                                <label for="email"><h3>Email:</h3></label>
                                            </div>
                                        </td>
                                        <td>
                                            <div style="height: 32px;">
                                                <input type="email" name="demo-name" id="email"size="40" required>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr style="background-color: white;" >
                                        <td>
                                            <div style="height: 32px;">
                                                <label for="minHours"><h3>Minimum hours</h3></label>
                                            </div>
                                        </td>
                                        <td>
                                            <div style="height: 32px;">
                                                <input style="width: 100%" type="number" size="2" name="minHours"  step="0.5" min="0" max="99" value="10">
                                            </div>
                                        </td>
                                    </tr>
                                    <tr style="background-color: white;" >
                                        <td>
                                            <div style="height: 32px;">
                                                <label for="maxHours"><h3>Maximum hours</h3></label>
                                            </div>
                                        </td>
                                        <td>
                                            <div style="height: 32px;">
                                                <input style="width: 100%" type="number" size="2" name="maxHours" min="0" step="0.5" max="99" value="10">
                                            </div>
                                        </td>
                                    </tr>
                                    
                                
                                </tbody>
                            </table>
                            <table>
                                
                                
                                
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

            
            <!-- Scripts -->
            <script src="/assets/js/jquery.min.js"></script>
            <script src="assets/js/jquery.poptrox.min.js"></script>
            <script src="assets/js/skel.min.js"></script>
            <script src="assets/js/util.js"></script>
            <!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
            <script src="assets/js/main.js"></script>
        </div>  
    </body>
</html>




