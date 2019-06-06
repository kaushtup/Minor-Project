
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>My Match</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/style.css" media="screen" />
<!--[if IE 6]>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/style/css/iecss.css" />
<![endif]-->
</head>
<body>
<div id="main_container">
  <div id="header">
      <div id="logo"><img src="${pageContext.request.contextPath}/style/css/images/logo.png" width="206" height="63" alt="" border="0"></img></div>
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
      <div class="left_content">
        <div class="partner_box">
          <div class="title">Find the perfect partner</div>
          <div class="left_banner_content">
            <p>Every year, hundreds of thousands of singles find their one and only online at Mymatch.com. Offering advanced search options, unlimited two-way chatting and free photo profiles. <!--Mymatch.com continues to redefine the way singles meet, date and fall in love.
Mymatch.com has over 36.5 million members, with tens of thousands of singles joining daily.
Whether you're looking for Christian Dating, Jewish Dating, Asian Dating, Black Dating, Seniors Dating, among others, Mymatch.com is the place for you (even if you're not sure you want something long-term or casual).
So don't waste another night, join the fastest growing and most dynamic network of singles in your area now, and find someone today   --></p>
            <a href="#" class="read_more">read more</a> </div>
        </div>
        <div class="blue_title">Our Services</div>
        <ul class="list">
            <li><p>Connect with beautiful people</p></li>ss
             <li><p>Be discovered</p></li>
              <li><p>Browse beautiful profiles of men and women</p></li>
               <li><p>Be part of the largest most exclusively beautiful community</p></li>
                <li><p>Chat live with other beautiful men and women</p></li>
        </ul>
        <div class="blue_title">About Us</div>
        <img src="${pageContext.request.contextPath}/style/css/images/pic1.gif" alt="" class="photo" />
        <p class="left">Mymatch.com is the only major online dating site with an easy-to-use interface that allows multiple, simultaneous chats. By membership, you get access to these popular features, as well as advanced search options, unlimited messages, photo personals browsing, and the chance to view others profile. So get started with online dating now, the Mymatch way, and find someone today!</p>
      </div>
      <div class="right_content">
        <div class="blue_title">Latest members</div>
        <div class="member_tab"> <img src="${pageContext.request.contextPath}/style/css/images/m1.gif" alt="" class="photo" />
          <div class="member_details"> <span>Tanya</span><br />
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
            <a href="#" class="more">more</a> </div>
        </div>
        <div class="member_tab"> <img src="${pageContext.request.contextPath}/style/css/images/m3.gif" alt="" class="photo" />
          <div class="member_details"> <span>Carl</span><br />
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
            <a href="#" class="more">more</a> </div>
        </div>
        <div class="member_tab"> <img src="${pageContext.request.contextPath}/style/css/images/m2.gif" alt="" class="photo" />
          <div class="member_details"> <span>Alexa</span><br />
            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. </p>
            <a href="#" class="more">more</a> </div>
        </div>
        <a href="#" class="view_all">view all</a> </div>
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
