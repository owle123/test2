<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询商品列表</title>
</head>
<body>

	<form action="${pageContext.request.contextPath }/item/queryItem.action" method="post">
		查询条件
		
		商品列表
		<table width="100%" border="1">
			<tr>
				<th>商品名称</th>
				<th>商品价格</th>
				<th>生产日期</th>
				<th>商品描述</th>
				<th>操作</th>
			</tr>
			<c:forEach items="${itemsList }" var="item">
				<tr>
					<td>${item.name }</td>
					<td>${item.price }</td>
					<td>${item.createtime }</td>
					<td>${item.detail }</td>
					<td>
						<a href="">修改</a>
						<a href="">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</form>
	
	


</body>
</html>