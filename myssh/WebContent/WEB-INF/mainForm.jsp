<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>欢迎 ${loginUser.name} 你所在的部门是${loginUser.depart.name } 请选择你的操作</h1>
	<a href="<%=this.getServletContext().getContextPath() %>/employee.do?flag=goAddUi">添加雇员</a><br/>
	<a href="${pageContext.request.contextPath }/employee.do?flag=showEmployee">显示雇员</a><br/>
	<a href="#">查询雇员</a><br/>
	<a href="#">修改雇员</a><br/>
	<a href="#">退出系统</a><br/>
</body>
</html>