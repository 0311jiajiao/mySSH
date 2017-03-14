<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>显示所有员工</title>
</head>
<body>
	<h1>${request.empLists }</h1>
	
	<s:iterator value="empLists">
		<%--用EL表达式直接调用属性循环输出对象的各个属性值--%>
		<tr>
			<td>${id } </td>
			<td>${name } </td>
			<td>${pwd }</td>
			<td>${grade }</td>
			<td>${email }</td>
			<td>${hiredate }</td>
			<td>${salary }</td>
			<td>${depart.depart_id }</td>
		</tr>
	</s:iterator>

<br/>
<br/>
<br/>

	<c:forEach var="emp" items="${empLists}">
		 <%--用EL表达式调用list对象的属性循环输出对象的各个属性值--%> 
		 <tr>
			<td>${emp.id }</td>
			<td>${emp.name }</td>
			<td>${emp.pwd }</td>
			<td>${emp.grade }</td>
			<td>${emp.email }
			<td>${emp.hiredate }
			<td>${emp.salary }
			<td>${emp.depart.depart_id }
			</td>
		  </tr>
	</c:forEach>
</body>
</html>