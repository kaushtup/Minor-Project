<%-- 
    Document   : editcourse
    Created on : Nov 22, 2016, 5:21:55 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
           <title>Edit Profile</title>
        <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Edit</title>

    <!-- Bootstrap Core CSS -->
    <link href="${pageContext.request.contextPath}/style/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/style/css/sb-admin.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="${pageContext.request.contextPath}/style/font-awesome-4.1.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    </head>
        <body>
               <div id="wrapper">

        <

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Sign Up
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="Home">Home</a>
                            </li>
                        </ol>
                    </div>
                </div>    
                
                
         <div class="row">
                    <div class="col-lg-6"> 
           <form action="${pageContext.request.contextPath}/editProfile" method="GET"> <%--
           ahref ko satta ${pageContext.request.contextPath} error audaina yo garyo bhane --%>
        <input type="hidden" name="pid" value="${register.get(0).pid}"/>
        <div class="form-group">
        Name<input class="form-control" type="text" name="username" value="${register.get(0).username}"/>
        </div>
        <div class="form-group">
        Age<input class="form-control" type="text" name="age" value="${register.get(0).age}"/>
        </div>
        <div class="form-group">
        Address<input class="form-control" type="text" name="address" value="${register.get(0).address}"/>
        </div>
        <div class="form-group">
        Gender<input class="form-control" type="text" name="gender" value="${register.get(0).gender}">
        </div>
        <input type="submit" value="Edit Profile"/>
        </form>
        </div>
         </div>
        </div>
        </div>
               </div>
         <!-- jQuery Version 1.11.0 -->
    <script src="js/jquery-1.11.0.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>
        
    </body>
</html>
