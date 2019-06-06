<%-- 
    Document   : myprofile
    Created on : Feb 18, 2017, 11:06:44 AM
    Author     : DELL
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en">
<head>
<title>My Match</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/style.css" media="screen" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/iecss.css" />
<![endif]-->
<link rel="stylesheet" type="text/css" href="style/css/card/card.css"/>
<link href="style/css/displayprofile/cssnew/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" type="text/css" href="style/css/displayprofile/display.css" />

 <!-- Bootstrap Core CSS -->
    <link href="style/css/buttonstyle.css" rel="stylesheet">
    
   <!-- Bootstrap Core CSS -->
    <link href="style/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="style/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="style/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div id="main_container">
  <div id="header">
    <div id="logo"><a href="#"><img src="${pageContext.request.contextPath}/style/css/images/logo.png" width="206" height="63" alt="" border="0" /></a></div>
    <div id="menu">
      <ul>
        <li><a class="current" href="Home">home </a></li>
        <li><a href="Aboutus"> about us </a></li>
        <li><a href="Search">find a partner </a></li>
        <li><a href="Myprofile">my account</a></li>
        <li><a href="Contactus">contact us</a></li>
        <li><a href="Addpartner">add partner</a></li>
      </ul>
    </div>
  </div>
   
    
  
                    
                        
          <form action="addpartner.jsp" method="POST">              
       <%
    String user = session.getAttribute("user").toString();
    session.setAttribute("user",user);
    String pass = session.getAttribute("pass").toString();
    session.setAttribute("pass",pass);
       %>
          </form>
          
     <div id="center_content">
    
    
          
      
        
   <div class="col-xs-12 col-sm-12 col-md-6 col-lg-6 col-xs-offset-0 col-sm-offset-0 col-md-offset-3 col-lg-offset-3 toppad" >
   
          <div class="panel panel-info">
            <div class="panel-heading">
              <h3 class="panel-title">Information:</h3>
            </div>
            <div class="panel-body">
              <div class="row">
                <div class="col-md-3 col-lg-3 " align="center"> <img alt="User Pic" src="http://babyinfoforyou.com/wp-content/uploads/2014/10/avatar-300x300.png" class="img-circle img-responsive"> </div>
                
                
                <div class=" col-md-9 col-lg-9 "> 
                  <table class="table table-user-information">
                      <tbody>
                        <c:forEach items="${register}" var="sd">
                                        <c:if test ="${user==sd.username}">
                                            <c:if test ="${pass==sd.password}">
                      <tr>
                        <td>Username:</td>
                        <td>${sd.username}</td>
                      </tr>
                      <tr>
                        <td>Age:</td>
                        <td>${sd.age}</td>
                      </tr>
                      <tr>
                        <td>Address</td>
                        <td>${sd.address}</td>
                      </tr>
                   
                         
                             <tr>
                        <td>Gender</td>
                        <td>${sd.gender}</td>
                      </tr>
                         
                      <tr>
                        <td>Image</td>
                        <td>${sd.image}</td>
                      </tr>
                      
                     <td><img src="${sd.image}" width="50" height="50" /></td> 
                     </c:if>
                                            </c:if>
                                     </c:forEach> 
                    </tbody>
                  </table>
                  
                  <a href="${pageContext.request.contextPath}/EditProfile/${sd.pid}" class="btn btn-primary">Edit Profile</a>
                  <a href="recommendation" class="btn btn-primary">Recommendations</a>
                </div>
                  <div class="col-md-5  toppad  pull-right col-md-offset-3 ">
           <A href="index" class = "btn danger">Logout</A>
                  </div>
              </div>
            </div>
                 
          </div>
   
                  
          </div>
        </div>
        
        
      <div class="clear"></div>
    
            
  
<div id="footer">
<div class="footer_links"> <a href="index">home </a> <a href="Aboutus"> about us</a> <a href="Contactus">contact us</a> </div>
</div>
</div> 
                  
 <!-- jQuery -->
    <script src="vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="dist/js/sb-admin-2.js"></script>                   
        
</body>
                          
</html>
