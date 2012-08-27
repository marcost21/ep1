<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Cliente:</td>
			<td><input type="text" name="pedido.nome" value="{pedido.nome}" /></td>
		</tr>
		<tr>
			<td>Data:</td>
			<td><input type="text" name="pedido.data" value="{pedido.data}" /></td>
		</tr>
	</table>
	<table>
		<tr>
			<td>Item</td>
			<td>Qtd</td>
			<td>Unitário</td>
			<td>Total</td>
		</tr>

		<c:forEach items="${itemPedidoList}" var="item">
			<tr>
				<td>${item.descricao }</td>
				<td>${item.qtd }</td>
				<td>${item.preco }</td>
				<td>${(item.preco * item.qtd) }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
