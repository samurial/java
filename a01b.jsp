<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java第十周.User" %>
        <%@ page import="java第十周.UserDao" %>
        <%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>接收数据并实现添加</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");//设置字符编码，避免乱码
String id=request.getParameter("id");
String name=request.getParameter("name");
String sex=request.getParameter("sex");
int idd=Integer.parseInt(id);
User u=new User(idd,name,sex);
UserDao dao=new UserDao();
dao.add(u);
List <User> users=dao.QueryAll();
request.setAttribute("userslist", users);
%>
<jsp:forward page="a01c.jsp"></jsp:forward>
</body>
</html>