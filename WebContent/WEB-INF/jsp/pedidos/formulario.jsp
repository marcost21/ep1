<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Pedidos</title>
</head>
<body>
	<form action="adiciona">
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
		<br> <br>
		<table>
			<tr>
				<td align="center">Item</td>
				<td align="center">Qtd</td>
				<td align="center">Unitário</td>
			</tr>
			<tr>
				<td><input type="text" name="item.descricao"
					value="{item.descricao}" /></td>
				<td><input type="text" name="item.qtd" value="{item.qtd}" /></td>
				<td><input type="text" name="item.valor" value="{item.valor}" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="center"><br>
					<button type="submit" /></button></td>
				<td></td>
			</tr>
		</table>
	</form>
</body>
</html>
