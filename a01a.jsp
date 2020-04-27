<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提交数据页面</title>
</head>
<body>
<form action="a01b.jsp" method="post">
<table>
<tr><td>编号：</td><td><input name="id"></td></tr>
<tr><td>姓名：</td><td><input name="name"></td></tr>
<tr><td>性别：</td><td><input name="sex"></td></tr>
<tr><td><input type="submit" value="提交"></td><td><input type="reset" value="取消"></td></tr>
</table>
</form>
</body>
</html>