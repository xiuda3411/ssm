<%--
  Created by IntelliJ IDEA.
  User: ASUS-PC
  Date: 2019/3/28
  Time: 23:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>

<div>
    <strong> welcome,${sessionScope.user.username}! </strong>
</div>
this is success page!
<span id="totalSecond">5</span>秒后跳转至首页</h3>
    <script language="javascript" type="text/javascript">
        var second = totalSecond.innerText;
        setInterval("redirect()", 1000);
        function redirect(){
            totalSecond.innerText=--second;
            if(second==0) location.href='/../Homepage.jsp';
        }
    </script>

<a href="${pageContext.request.contextPath}/user/anotherpage">点我跳到另一个页面</a>

<form action="${pageContext.request.contextPath}/user/login">
    <table>
        <tr>
            <td><input type="submit" value="退出登录" ></td>
        </tr>
    </table>
</form>
</body>
</html>
