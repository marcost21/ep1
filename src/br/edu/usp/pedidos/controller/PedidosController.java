	package br.edu.usp.pedidos.controller;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import br.edu.usp.pedidos.dao.PedidoDao;
import br.edu.usp.pedidos.entity.ItemPedido;
import br.edu.usp.pedidos.entity.Pedido;

@Resource
public class PedidosController {
	
	private final PedidoDao dao;
	private final Result result;
	private final Validator validator;
	
	public PedidosController(PedidoDao dao, Result result, Validator validator) {
		this.dao = dao;
		this.result = result;
		this.validator = validator;
	}	
	
	public List<Pedido> lista() {
		return dao.listaTudo();
	}
	
	public List<ItemPedido> listaPedido(long id) {
		return this.dao.listaUm(id).getItens();
	}
	
	public void adiciona(Pedido pedido) {
		if(pedido.getCliente() == null) {
			validator.add(new ValidationMessage("Nome do cliente é obrigatório!", "pedido.nome"));
		}
		
		if(pedido.getData() == null) {
			validator.add(new ValidationMessage("Data é obrigatório!", "pedido.data"));
		}
		
		dao.salva(pedido);
		result.redirectTo(this).lista();
	}
	
	public void formulario() {
		
	}
	
}
