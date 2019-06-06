<%-- 
    Document   : reccomendation
    Created on : Jul 10, 2017, 4:49:40 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
        <title>Add Partner</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="style/css/card/card.css"/>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/style.css" media="screen" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/iecss.css" />
<![endif]-->
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
    <div class="container">
        
     <%
    String age=request.getParameter("age");
    session.setAttribute("age",age);
     %>
                   
          <c:forEach items="${register}" var="sd">
                                        <c:if test ="${age==sd.age}">
                                          
                                               
<figure class="snip1139">
    

 


<button class = "btn success">Yes</button>
<button class = "btn danger">No</button>  

    
<div class="arrow"></div>
  

  
<img src="style/css/card/images/hey.jpg" alt="sample3" style="width:320px;height:225.45px;"/>
  
<div class="author">
    

                      
 <h5>Information:</h5>
Name:${sd.username}<br>
Age:${sd.age}<br>
Address:${sd.address}<br>
Gender:${sd.gender}
   </c:if>
                                            
                                      
</div>
</figure>
 </c:forEach>

    </div>
    



                        
                     
    </div>
   </body>
</html>
