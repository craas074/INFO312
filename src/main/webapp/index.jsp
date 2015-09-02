

<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="dao.ShiftDAO"%>
<%@page import="domain.Shift"%>
<%@page import="domain.Employee"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Date"%>

<%
    
    //String name = (String)session.getAttribute("name");
    String name1 = "TestTest";

%>

<%!
    
    //these start values will need to come from a predefined 3 weekly pointer
    int day = 1;
    int month = 0;
    int year = 2015;
        
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM");
    Calendar calendar;

    public String incrementDate(int amount) {

        int day = this.day;
        int month = this.month;
        int year = this.year;

        calendar = new GregorianCalendar(year, month, day);
        calendar.add(Calendar.DAY_OF_MONTH, amount);
        return sdf.format(calendar.getTime());
    }
    
    

%>

<html>
    <head>
        <title>Unipol Availability Submission</title>

        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" href="assets/css/main.css" />
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
    </head>
    <body id="top">

        <!-- Header -->
    <header id="header">
        <a href="#" class="image avatar"><img src="images/otago1.jpg" alt="" /></a>
        <h1><strong>Welcome, <%=name1%></strong>. Submit your<br />
            shift availability using the given schedules<br /></h1>
    </header>

    <!-- Main -->
    <div id="main">

        <!-- One -->
        <section id="one">
            <header class="major">
                <h2><%="Date displayed here"%></h2>
            </header>
            <div class="table-wrapper">
                <table class="alt" id="table1">
                    <thead>
                        <tr>
                            <th><p style="display: none">null</p></th>
                            <th id="<%=incrementDate(0) + "/" + year %>">Mon <br> <%=incrementDate(0) %></th>
                            <th id="<%=incrementDate(1) + "/" + year %>">Tue <br> <%=incrementDate(1) %></th>
                            <th id="<%=incrementDate(2) + "/" + year %>">Wed <br> <%=incrementDate(2) %></th>
                            <th id="<%=incrementDate(3) + "/" + year %>">Thu <br> <%=incrementDate(3) %></th>
                            <th id="<%=incrementDate(4) + "/" + year %>">Fri <br> <%=incrementDate(4) %> </th>
                            <th id="<%=incrementDate(5) + "/" + year %>">Sat <br> <%=incrementDate(5) %></th>
                            <th id="<%=incrementDate(6) + "/" + year %>">Sun <br> <%=incrementDate(6) %></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr id="0545 0900">
                            <td>0545 - 0900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="0600 0900">
                            <td>0600 - 0900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="0745 1300">
                            <td>0745 - 1300</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="0800 1300">
                            <td>0900 - 1200</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        
                        <tr id="0900 1200">
                            <td>0900 - 1200</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1200 1500">
                            <td>1200 - 1500</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1300 1700">
                            <td>1300 - 1700</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1500 1900">
                            <td>1500 - 1900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1700 2100">
                            <td>1700 - 2100</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1900 2300">
                            <td> 1900 - 2300</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr> 
                    </tbody>
                </table>
            </div>
        </section>

        <!-- Two -->
        <section id="two">
            <header class="major">
                <h2> Date displayed here</h2>
            </header>
            <div class="table-wrapper">
                <table class="alt" id="table2">
                    <thead>
                        <tr>
                            <th><p style="display: none">null</p></th>
                            <th id="<%=incrementDate(7) + "/" + year %>">Mon <br> <%=incrementDate(7) %></th>
                            <th id="<%=incrementDate(8) + "/" + year %>">Tue <br> <%=incrementDate(8) %></th>
                            <th id="<%=incrementDate(9) + "/" + year %>">Wed <br> <%=incrementDate(9) %></th>
                            <th id="<%=incrementDate(10) + "/" + year %>">Thu <br> <%=incrementDate(10) %></th>
                            <th id="<%=incrementDate(11) + "/" + year %>">Fri <br> <%=incrementDate(11) %> </th>
                            <th id="<%=incrementDate(12) + "/" + year %>">Sat <br> <%=incrementDate(12) %></th>
                            <th id="<%=incrementDate(13) + "/" + year %>">Sun <br> <%=incrementDate(13) %></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr id="0545 0900">
                            <td>0545 - 0900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="0600 0900">
                            <td>0600 - 0900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="0745 1300">
                            <td>0745 - 1300</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="0800 1300">
                            <td>0900 - 1200</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        
                        <tr id="0900 1200">
                            <td>0900 - 1200</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1200 1500">
                            <td>1200 - 1500</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1300 1700">
                            <td>1300 - 1700</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1500 1900">
                            <td>1500 - 1900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1700 2100">
                            <td>1700 - 2100</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1900 2300">
                            <td> 1900 - 2300</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr> 
                    </tbody>
                </table>
            </div>
        </section>


        <!-- Three -->
        <section id="three">

            <header class="major">
                <h2> Date displayed here</h2>
            </header>
            <div class="table-wrapper">
                <table class="alt" id="table3">
                    <thead>
                        <tr>
                            <th><p style="display: none">null</p></th>
                            <th id="<%=incrementDate(14) + "/" + year %>">Mon <br> <%=incrementDate(14) %></th>
                            <th id="<%=incrementDate(15) + "/" + year %>">Tue <br> <%=incrementDate(15) %></th>
                            <th id="<%=incrementDate(16) + "/" + year %>">Wed <br> <%=incrementDate(16) %></th>
                            <th id="<%=incrementDate(17) + "/" + year %>">Thu <br> <%=incrementDate(17) %></th>
                            <th id="<%=incrementDate(18) + "/" + year %>">Fri <br> <%=incrementDate(18) %> </th>
                            <th id="<%=incrementDate(19) + "/" + year %>">Sat <br> <%=incrementDate(19) %></th>
                            <th id="<%=incrementDate(20) + "/" + year %>">Sun <br> <%=incrementDate(20) %></th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr id="0545 0900">
                            <td>0545 - 0900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="0600 0900">
                            <td>0600 - 0900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="0745 1300">
                            <td>0745 - 1300</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="0800 1300">
                            <td>0900 - 1200</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        
                        <tr id="0900 1200">
                            <td>0900 - 1200</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1200 1500">
                            <td>1200 - 1500</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1300 1700">
                            <td>1300 - 1700</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1500 1900">
                            <td>1500 - 1900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1700 2100">
                            <td>1700 - 2100</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr id="1900 2300">
                            <td> 1900 - 2300</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr> 
                    </tbody>
                </table>
            </div>
        </section>


        <section>
            <h2>Additional comments</h2>
                <div class="row">
                    <div class="8u 12u$(small)">
                        <form method="post" action="EmployeeAvailability">
                            
                            <div class="row uniform 50%">
                                <div class="12u$"><textarea name="message" id="message" placeholder="" rows="6"></textarea></div>
                            </div>
                            <div id="shifts">
                                <!-- shifts dynamically placed here to be submitted as part of the post -->
                            </div>
                            <ul class="actions">
                                <li><input id="submitButton" type="submit" value="Submit Availability" /></li>
                            </ul>
                            
                        </form>
                    </div>

                </div>
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
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/js/jquery.poptrox.min.js"></script>
        <script src="assets/js/skel.min.js"></script>
        <script src="assets/js/util.js"></script>
        <!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
        <script src="assets/js/newjavascript.js"></script>
        <script src="assets/js/main.js"></script>
    </div>
    </body>
</html>
