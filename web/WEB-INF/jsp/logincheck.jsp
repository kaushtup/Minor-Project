<%@page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
        <form action="myprofile.jsp" method="POST">   
    <%
    try {      
    String user=request.getParameter("username");
    session.setAttribute("user",user);
    String pass=request.getParameter("password");
    session.setAttribute("pass",pass);
    Connection conn = null;
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mymatch","root", "");
    Statement st =conn.createStatement();
    String sql="SELECT * FROM register WHERE username='"+user+"' AND password='"+pass+"'";
    ResultSet rs=st.executeQuery(sql);
    int count =0; 
        while(rs.next()){
            count++;
        }
        if(count>0){
                response.sendRedirect("Myprofile");
            }
            else
            {
                response.sendRedirect("index");
            }
        }catch(Exception e){
                
           System.out.println(e);
        }
           
%>

        </form>    

    </body>
</html>
