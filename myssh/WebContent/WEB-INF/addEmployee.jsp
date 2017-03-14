<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>新增职员</title>
</head>
<body>
	<h1>欢迎 ${loginUser.name} 你所在的部门是${loginUser.depart.name } 请选择你的操作</h1>
	<a href="#">返回首页</a><br />
	<h2>添加雇员</h2><br />
	<form action="${pageContext.request.contextPath }/employee.do?flag=saveEmployee" method="post">
		<table>
			<tr>
				<td>name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>pwd:</td>
				<td><input type="password" name="pwd" /></td>
			</tr>
			<tr>
				<td>grade:</td>
				<td><input type="text" name="grade" /></td>
			</tr>
			<tr>
				<td>email:</td>
				<td><input type="text" name="email" /></td>
			</tr>
			<tr>
				<td>hiredate:</td>
				<td><input type="test" name="hiredate" /></td>
			</tr>
			<tr>
				<td>salary:</td>
				<td><input type="text" name="salary" /></td>
			</tr>
			<tr>
				<td>department:</td>
				<td>
					<select name="department">
						<option value="1">财务部</option>
						<option value="2">开发部</option>
					</select>
				</td>
			</tr>
			
			<tr>
				<td><input type="submit" value="新增" /></td>
				<td><input type="reset" value="重置" /></td>
			</tr>
		</table>		
		
	</form>

</body>
</html>