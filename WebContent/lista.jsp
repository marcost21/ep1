<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:useBean id="dao" class="br.edu.usp.pedidos.dao.PedidoDao" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>Cliente</td>
			<td>Data</td>
			<td>Qtd Itens</td>
			<td>Valor Total</td>
		</tr>

		<c:forEach items="${dao.listaTudo}" var="pedido">
			<tr>
				<td>${pedido.nome }</td>
				<td>${pedido.preco }</td>
				<td>${pedido.qtd }</td>
				<td>${pedido.preco }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
