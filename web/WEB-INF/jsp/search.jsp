<%-- 
    Document   : index
    Created on : Feb 18, 2017, 10:26:05 AM
    Author     : DELL
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>My Match</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    
    
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/style.css" media="screen" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/iecss.css" />
<![endif]-->


    <!-- Bootstrap Core CSS -->
    <link href="style/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

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
  <div class="search_tab">
    <div class="search_title">Quick search</div>
    <div class="search_form">
      <div class="form_row">
        <label class="small">I am a:</label>
        <input type="text" class="small_input" value="woman" onclick="this.value=''" />
        <label class="small">seeking:</label>
        <input type="text" class="small_input" value="man" onclick="this.value=''" />
      </div>
         <div class="form_row">
        <label class="large">looking for :</label>
        <input type="text" class="large_input" value="relationship" onclick="this.value=''" />
        <input type="checkbox" class="checkbox" />
        <label class="small">+ photo</label>
      </div>
      <div class="form_row">
        <input type="image" src="${pageContext.request.contextPath}/style/css/images/search.gif" class="search_bt" />
      </div>
    </div>
  </div>
      
    <div id="center_content">
        <div class="center_top_bg"></div>
        
          <div class="center_bg">
              <div class="blue_title">Search</div> 
              
                 <form role="form" action="searchview" method="GET">
                              <div class="form-group">
                                  <input class="form-control" placeholder="on basis of age" name="age" type="text" autofocus >
                                </div>
                                
                                <button type="submit" class="btn btn-lg btn-success btn-block" value="Submitage">Search</button>
                         </form>
         
                        
                    
                            
                   
              <div class="clear"></div>
            </div>
        <div class="center_bottom_bg"></div>
          
    </div>
    <div id="footer">
   <div class="footer_links"> <a href="index">home </a> <a href="Aboutus"> about us</a> <a href="Contactus">contact us</a> </div>
    </div>
</div>
      


</body>
</html>


