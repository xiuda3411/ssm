<%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 2019/4/22
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>记忆约拍</title>
</head>
<frameset rows="100,*,90" frameborder="1" border="1" noresize="noresize"><!--窗口-->
    <frame name="top" src="top.jsp" /><!--子窗口-->
    <frameset cols="30%,70%">
        <frame name="left" src="left.jsp"/>
        <frame name="right" src="right.jsp" />
    </frameset>
    <frame name="bottom" src="bottom.jsp"/>
</frameset>
</html>
