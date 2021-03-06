
<%@page import="java.util.GregorianCalendar"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

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
            <li><a href="adminRosterWeekOne.jsp">Week 1</a></li>
            <li><a href="adminRosterWeekTwo.jsp">Week 2</a></li>
            <li>Week 3</li>
        </ul>
        

        <section id="one">
            <header class="major">
                <h2><%=incrementDate(14)%></h2>
            </header>
            <div class="table-wrapper">
                <table id="table1">
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
                <h2><%=incrementDate(15)%></h2>
            </header>
            <div class="table-wrapper">
                <table id="table1">
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
                <h2><%=incrementDate(16)%></h2>
            </header>
            <div class="table-wrapper">
                <table id="table1">
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
                <h2><%=incrementDate(17)%></h2>
            </header>
            <div class="table-wrapper">
                <table id="table1">
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
                <h2><%=incrementDate(18)%></h2>
            </header>
            <div class="table-wrapper">
                <table id="table1">
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
                <h2><%=incrementDate(19)%></h2>
            </header>
            <div class="table-wrapper">
                <table id="table1">
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
                <h2><%=incrementDate(20)%></h2>
            </header>
            <div class="table-wrapper">
                <table id="table1">
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
        <script src="assets/js/newjavascript.js"></script>
        <script src="assets/js/main.js"></script>

    </body>
</html>

