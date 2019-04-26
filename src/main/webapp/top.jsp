<%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 2019/4/26
  Time: 12:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>top</title>
</head>
<body bgcolor="#00A0A3">
<h1 align="center">网页的顶部</h1>
<div style="float: right;margin-right: 25px;">
    <%
        String user_name = "";
        if (session != null){
            user_name = (String) session.getAttribute("user_name");
            if (user_name != null){
                out.println("<a target = \"_blank\" href='personalPage.jsp'>"+user_name+"</a>");
            }else {
                out.print("<a  target = \"_blank\" href='login.jsp'>登录 &nbsp&nbsp&nbsp</a>");
                out.print("<a target = \"_blank\" href='register.jsp'>注册</a>");
            }

        }
    %>
</div>
</body>
</html>
