

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
            shift availability for date - date<br /></h1>
    </header>

    <!-- Main -->
    <div id="main">
        
        <header class="major"  style="text-align: center; padding: 0;">
            <h3><i>Please specify your shift availability by using the schedules below. You are welcome to specify
                    more than one shift per day. Selected shifts appear
                    as green. </i></h3>
            </header>
        
        <!-- One -->
        <section id="one" style="border-top: 2px solid #EFEFEF; padding-top: 0; margin-top: 5%;">
            <br>

            <div class="table-wrapper">
                <table class="alt" id="table1">
                    <thead>
                        <tr>
                            <th class="clear" style="padding-bottom: 0; "><h1><i class="icon fa-calendar"> </i>Week 1</h1></th>
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
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="0600 0900">
                            <td>0600 - 0900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="0900 1200">
                            <td>0900 - 1200</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="1200 1500">
                            <td>1200 - 1500</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        
                        <tr id="1500 1900">
                            <td>1500 - 1900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="1900 2300">
                            <td>1900 - 2300</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr class="clear">
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr style="display: none;"></tr>
                        <tr id="0745 1300">
                            <td>0745 - 1300</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="0800 1300">
                            <td>0800 - 1300</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="1300 1700">
                            <td>1300 - 2100</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="1700 2100">
                            <td>1700 - 2100</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                            <td class="none"></td>
                        </tr>
                        <tr class="clear">
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr style="display: none;"></tr>
                        <tr id="0845 1200">
                            <td>0845 - 1200</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>
                        <tr id="0900 1200">
                            <td>0900 - 1200</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>
                        <tr id="1200 1500">
                            <td>1200 - 1500</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>
                        <tr id="1500 1900">
                            <td>1500 - 1900</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>
                        <tr id="1900 2300">
                            <td>1900 - 2300</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>

                    </tbody>
                </table>
            </div>
        </section>

        <!-- Two -->
        <section id="two">
       
            <div class="table-wrapper">
                <table class="alt" id="table2">
                    <thead>
                        <tr>
                            <th class="clear" style="padding-bottom: 0; "><h1><i class="icon fa-calendar"> </i>Week 2</h1></th>
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
                        <tbody>
                        <tr id="0545 0900">
                            <td>0545 - 0900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="0600 0900">
                            <td>0600 - 0900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="0900 1200">
                            <td>0900 - 1200</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="1200 1500">
                            <td>1200 - 1500</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        
                        <tr id="1500 1900">
                            <td>1500 - 1900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="1900 2300">
                            <td>1900 - 2300</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr class="clear">
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr style="display: none;"></tr>
                        <tr id="0745 1300">
                            <td>0745 - 1300</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="0800 1300">
                            <td>0800 - 1300</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="1300 1700">
                            <td>1300 - 2100</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="1700 2100">
                            <td>1700 - 2100</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                            <td class="none"></td>
                        </tr>
                        <tr class="clear">
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr style="display: none;"></tr>
                        <tr id="0845 1200">
                            <td>0845 - 1200</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>
                        <tr id="0900 1200">
                            <td>0900 - 1200</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>
                        <tr id="1200 1500">
                            <td>1200 - 1500</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>
                        <tr id="1500 1900">
                            <td>1500 - 1900</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>
                        <tr id="1900 2300">
                            <td>1900 - 2300</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>

                    </tbody>
                </table>
            </div>
        </section>


        <!-- Three -->
        <section id="three">

            <div class="table-wrapper">
                <table class="alt" id="table3">
                    <thead>
                        <tr>
                            <th class="clear" style="padding-bottom: 0; "><h1><i class="icon fa-calendar"> </i>Week 3</h1></th>
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
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="0600 0900">
                            <td>0600 - 0900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="0900 1200">
                            <td>0900 - 1200</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="1200 1500">
                            <td>1200 - 1500</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        
                        <tr id="1500 1900">
                            <td>1500 - 1900</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="1900 2300">
                            <td>1900 - 2300</td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td class="none"></td>
                            <td class="none"></td>
                        </tr>
                        <tr class="clear">
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr style="display: none;"></tr>
                        <tr id="0745 1300">
                            <td>0745 - 1300</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="0800 1300">
                            <td>0800 - 1300</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="1300 1700">
                            <td>1300 - 2100</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                            <td class="none"></td>
                        </tr>
                        <tr id="1700 2100">
                            <td>1700 - 2100</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                            <td class="none"></td>
                        </tr>
                        <tr class="clear">
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr style="display: none;"></tr>
                        <tr id="0845 1200">
                            <td>0845 - 1200</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>
                        <tr id="0900 1200">
                            <td>0900 - 1200</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>
                        <tr id="1200 1500">
                            <td>1200 - 1500</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>
                        <tr id="1500 1900">
                            <td>1500 - 1900</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>
                        <tr id="1900 2300">
                            <td>1900 - 2300</td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td class="none"></td>
                            <td></td>
                        </tr>

                    </tbody>
                </table>
            </div>
        </section>
                        
        <section>
            <h2> <i class="icon fa-pencil"> Additional comments</i></h2>
            <p><i>If you find that your availability cannot be fully represented by this submission form,
                    please use the comment section below to outline any preferred shift/s or special cases.
                </i></p>
                <div class="row">
                    <div class="8u 12u$(small)">
                        <form method="post" onsubmit="return submitFunc();" action="EmployeeAvailability">
                            
                            <div class="row uniform 50%">
                                <div class="12u$"><textarea name="message" id="message" placeholder="" rows="6"></textarea></div>
                            </div>
                            <br>
                            <div id="shifts">
                                <!-- shifts dynamically placed here to be submitted as part of the post -->
                            </div>
                            <p><i> Please note: once shifts have been submitted you won't be able to re-submit, so
                                   review your selections carefully. Please notify work about any required changes or concerns. </i></p>
                            <ul class="actions">
                                <li><input id="submitButton" class="special" type="submit" value="Submit Availability" /></li>
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
        <script>
            //sets up sections of roster to make unclickable
            $('.clear').click(false);
            $('.none').click(false);
            $('.none').css("background-color", "#e7e5e5"); 
            $('.clear').css("background-color", "white");
            $('.clear').css("vertical-align", "middle");
        </script>
        
        <script>
        function submitFunc() {
            
            if ($('.shift').length === 0){
                
                var confirmed = confirm("You haven't chosen any shifts. You will not be able to re-submit for this 3 week period. Submit anyway?");

                if (confirmed === true){
                    return true;
                } else {
                    return false;
                }
            
            }
            
            var confirmed = confirm("Would you like to confirm your shift availability?");

            if (confirmed === true){
                return true;
            } else {
                return false;
            }
        }
        
        </script>
    </div>
    </body>
</html>
