
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

                
                <form method="post" id="form" onsubmit="//return submitFunc()">
                        
                        <div class="row uniform 50%">
                            
                            <h2>Amend employee details</h2>
                       

                            <table class="alt">
                                <tbody id="tBody">
                                    <tr style="background-color: white;" >
                                        <td>
                                            <div style="height: 32px;">
                                                <label for="firstname"><h3>Select employee:</h3></label>
                                            </div>
                                        </td>
                                        <td>
                                            <div class="select-wrapper" >
                                                <select id="selectEmployee" onchange="changeFunc();" id="demo-category">
                                                    <option value=""></option>
                                                    <% for (Employee employee : allEmployees) {%>
                                                    <option value="<%=employee.getEmail() %>"><%=employee.getName()%></option>
                                                    <% }%>
                                                </select>
                                            </div>
                                        </td>
                                    </tr>
                                    <tr style="background-color: white;" >
                                        <td></td>
                                        <td></td>
                                    </tr>
                                    <tr style="background-color: white;" >
                                        <td>
                                            <div style="height: 32px;">
                                                <label for="ename"><h3>Name:</h3></label>
                                            </div>
                                        </td>
                                        <td>
                                            <div style="height: 32px;">
                                                <input id="ename" name="ename" type="text" size="30" required>
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
                                                <input id="email" type="email" name="email" size="30" required>
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
                                                <input id="minhrs" style="width: 100%" type="number" size="2" name="minHours"  step="0.5" min="0" max="99">
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
                                                <input id="maxhrs" style="width: 100%" type="number" size="2" name="maxHours" min="0" step="0.5" max="99">
                                            </div>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                                                
                                              
                                                
                            <div id="postId"></div>                    
                            <div class="12u$">
                                <ul class="actions">
                                    <li><input type="submit" name="Amend" value="Amend" class="special submitbutton" formaction="/editEmployee"/></li>
                                    <li><input type="submit" name="Delete" value="Delete" class="submitbutton" formaction="/deleteEmployee"/></li>
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

            <script>
                
                
                function changeFunc(){
                    

                    var employeeEmail = $("#selectEmployee").val();
                    $("#postId").empty();
                    
                    $.post( 'getEmployeeData', { email: employeeEmail })
                        .done(function( data ) {
                            
                        $("#ename").val(data.name);
                        $("#email").val(data.email);
                        $("#minhrs").val(data.minhours);
                        $("#maxhrs").val(data.maxhours);
                        
                        $("#postId").append("<input type='hidden' name='id' value='" + data.email + "'>");

                    });
 
                }
                
            </script>
            <script>

            $(function() {
                
                var buttonpressed;
                    
                $('.submitbutton').click(function() {
                    buttonpressed = $(this).attr('name');
                });
                
                $('form').submit(function() {                    
                   var ename = $("#ename").val();
                   var email = $("#email").val();
                   var minhrs = $("#minhrs").val();
                   var maxhrs = $("#maxhrs").val();
                                      
                   if (parseFloat(minhrs) > parseFloat(maxhrs)){
                       alert("Minimum hours must not be more than maximum hours");
                       return(false);
                   }
                   
                   if (buttonpressed === "Amend"){
                       
                        var confirmed = confirm("Confirm employee details?\n\n\n" + "Name: " + ename + "\n\n" + "Email: " + email + "\n\n" + "Minimum hours: " + minhrs + "\n\n" + "Maximum hours: " + maxhrs );

                        if (confirmed === true){
                            return(true);
                        } else {
                            return(false);
                        }
                    
                    } else if (buttonpressed === "Delete"){
                        
                        var confirmed = confirm("Confirm delete?");

                        if (confirmed === true){
                            return(true);
                        } else {
                            return(false);
                        }
                    }
                     
                });   
            });
     
                
                
            </script>
    
        </div>  
    </body>
</html>



