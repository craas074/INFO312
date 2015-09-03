<%-- 
    Author     : ashtoncranmer
--%>

<%@page import="dao.EmployeeDAO"%>
<!DOCTYPE html>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="domain.Shift"%>
<%@page import="domain.Shift"%>
<%@page import="dao.ShiftDAO"%>
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%!
    
    

    ShiftDAO shiftDAO = new ShiftDAO();
    EmployeeDAO employeeDAO = new EmployeeDAO();
    //List<Shift> shifts = shiftDAO.getShifts();
    List<Shift> shifts = new ArrayList();

    
    
    //these start values will need to come from a predefined 3 weekly pointer
    int day = 1;
    int month = 0;
    int year = 2015;
        
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YY");
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
        <title>Unipol Roster</title>

        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
        <link rel="stylesheet" href="assets/css/main.css" />
        <!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
    </head>
    <body id="top">

        <!-- Header -->
    <header id="header">
        <a href="#" class="image avatar"><img src="images/otago1.jpg" alt="" /></a>
    </header>

    <!-- Main -->
    <div id="main">
        
        <ul>
            <li>Week 1</li>
            <li><a href="adminRosterWeekTwo.jsp">Week 2</a></li>
            <li><a href="adminRosterWeekThree.jsp">Week 3</a></li>
        </ul>
        

        <section id="one">
            <header class="major">
                <h2><%=incrementDate(0)%></h2>
            </header>
            <div class="table-wrapper">
                <table class="alt">
                    <thead>
                        <tr>
                    <th>Name </th>
                    <th>Time</th>
                    <th>Amend</th>
                    </tr>
                    </thead>
                    <tbody>
                        <!-- spin through shifts here -->
                        <% for (Shift shift : shifts) {%>

                        <tr>
                            <td><%=EmployeeDAO.getEmployeeByEmail(shift.getEmpEmail()).getName()%></td>
                            <td><%=shift.getStart()%> - <%=shift.getFinish()%></td>
                            <td>
                                <form method="post" onsubmit="return clearSesh();" action="/AmendShift" style="margin: 0;">
                                    <input class="button small"id="submitButton" type="submit" value="Edit"/>
                                    <input name="employeeDetails" style="display: none" value="<%=EmployeeDAO.getEmployeeByEmail(shift.getEmpEmail()).getName()%>"/>
                                    <input name="employeeDetails" style="display: none" value="<%=shift.getStart() %>"/>
                                    <input name="employeeDetails" style="display: none" value="<%=shift.getFinish() %>"/>
                                    <input name="employeeDetails" style="display: none" value="<%=shift.getDate() %>"/>
                                    <input name="employeeDetails" style="display: none" value="<%=EmployeeDAO.getEmployeeByEmail(shift.getEmpEmail()).getId() %>"/>
                                    <input name="employeeDetails" style="display: none" value="<%=shift.getId() %>"/>
                                <form method="post" action="/AmendShift" style="margin: 0;">
                                    <input id="submitButton" type="submit" value="Edit"/>
                                    <input name="employeeDetails" style="display: none" value="<%=EmployeeDAO.getEmployeeByEmail(shift.getEmpEmail()).getName()%>"/>
                                    <input name="employeeDetails" style="display: none" value="<%=shift.getStart() %>"/>
                                    <input name="employeeDetails" style="display: none" value="<%=shift.getFinish() %>"/>
                                    <input name="employeeDetails" style="display: none" value="<%=shift.getDate() %>"/>
                                </form>
                            </td>
                        </tr>

                        <% }%>
                        <tr>
                            <td></td>
                            <td></td>
                            <td><form method="post" onsubmit="return clearSesh();" action="/addShift.jsp" style="margin: 0;">
                                    <input class="button special small" id="submitButton" type="submit" value="Add shift"/>
                                    <input name="shiftDate" style="display: none" value="<%=incrementDate(0)%>"/>
                                </form>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </section>

        <section id="one">
            <header class="major">
                <h2><%=incrementDate(1)%></h2>
            </header>
            <div class="table-wrapper">
                <table class="alt">
                    <thead>
                        <tr>
                    <th>Name </th>
                    <th>Time</th>
                    <th>Amend</th>
                    </tr>
                    </thead>
                    <tbody>
                        <!-- spin through shifts here -->
                        <tr id="1900 2300">
                            <td> someone</td>
                            <td></td>
                            <td> </a></td>
                        </tr> 
                        <tr id="1900 2300">
                            <td>someone</td>
                            <td></td>
                            <td> </a></td>
                        </tr> 
                        <tr id="1900 2300">
                            <td>someone</td>
                            <td></td>
                            <td> </td>
                        </tr> 
                        <tr id="1900 2300">
                            <td></td>
                            <td></td>
                            <td> <a href="url">Add Shift</a></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </section>
        <section id="one">
            <header class="major">
                <h2><%=incrementDate(2)%></h2>
            </header>
            <div class="table-wrapper">
                <table class="alt">
                    <thead>
                        <tr>
                            <th><p style="display: none">null</p></th>
                    <th>Name </th>
                    <th>Time</th>
                    <th>Amend</th>
                    </tr>
                    </thead>
                    <tbody>
                        <!-- spin through shifts here -->
                    </tbody>
                </table>
            </div>
        </section>
        <section id="one">
            <header class="major">
                <h2><%=incrementDate(3)%></h2>
            </header>
            <div class="table-wrapper">
                <table class="alt">
                    <thead>
                        <tr>
                            <th><p style="display: none">null</p></th>
                    <th>Name </th>
                    <th>Time</th>
                    <th>Amend</th>
                    </tr>
                    </thead>
                    <tbody>
                        <!-- spin through shifts here -->
                    </tbody>
                </table>
            </div>
        </section>
        <section id="one">
            <header class="major">
                <h2><%=incrementDate(4)%></h2>
            </header>
            <div class="table-wrapper">
                <table class="alt">
                    <thead>
                        <tr>
                            <th><p style="display: none">null</p></th>
                    <th>Name </th>
                    <th>Time</th>
                    <th>Amend</th>
                    </tr>
                    </thead>
                    <tbody>
                        <!-- spin through shifts here -->
                    </tbody>
                </table>
            </div>
        </section>
        <section id="one">
            <header class="major">
                <h2><%=incrementDate(5)%></h2>
            </header>
            <div class="table-wrapper">
                <table class="alt">
                    <thead>
                        <tr>
                            <th><p style="display: none">null</p></th>
                    <th>Name </th>
                    <th>Time</th>
                    <th>Amend</th>
                    </tr>
                    </thead>
                    <tbody>
                        <!-- spin through shifts here -->
                    </tbody>
                </table>
            </div>
        </section>
        <section id="one">
            <header class="major">
                <h2><%=incrementDate(6)%></h2>
            </header>
            <div class="table-wrapper">
                <table class="alt">
                    <thead>
                        <tr>
                            <th><p style="display: none">null</p></th>
                    <th>Name </th>
                    <th>Time</th>
                    <th>Amend</th>
                    </tr>
                    </thead>
                    <tbody>
                        <!-- spin through shifts here -->
                    </tbody>
                </table>
            </div>
        </section>

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
        <script src="assets/js/main.js"></script>
        <script>
            
            function clearSesh() { //just handles user clicking back (destroys session created using amend page)
                sessionStorage.clear();
                return true;
            }
                    
        </script>       

    </body>
</html>




