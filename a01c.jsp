<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ page import="java第十周.User" %>
        <%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加后显示数据</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");//设置字符编码，避免乱码
List <User> users=(List <User>)(request.getAttribute("userslist"));
for(int i=0;i<users.size();i++)
{
	User u=users.get(i);
	String abc="编号："+u.getUserid()+" 姓名："+u.getUsername()+" 性别："+u.getSex();
	out.println(abc+"<br>");
}
%>
</body>
</html>