package br.edu.usp.pedidos.entity;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String cliente;
	@Temporal (TemporalType.DATE)
	private Date data;
	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
	private List<ItemPedido> itens;
	private int qtd;
	private Double preco;
	
	public Pedido(String cliente, Date data, List<ItemPedido> itens) {
		this.cliente = cliente;
		this.data = data;
		this.itens = itens;
		this.calculaQtdTotal();
		this.calculaValorTotal();
	}

	public Long getId() {
		return id;
	}

	public String getCliente() {
		return cliente;
	}

	public Date getData() {
		return data;
	}

	public int getQtd() {
		return qtd;
	}

	public Double getPreco() {
		return preco;
	}
	
	public List<ItemPedido> getItens() {
		return itens;
	}

	public void calculaQtdTotal() {
		this.qtd = 0;
		
		for(Iterator<ItemPedido> itensIt = itens.iterator(); itensIt.hasNext();) {
			ItemPedido item = itensIt.next();
			
			this.qtd += (item.getQtd());
		}
	}
	
	public void calculaValorTotal() {
		this.preco = 0.0;
		
		for(Iterator<ItemPedido> itensIt = itens.iterator(); itensIt.hasNext();) {
			ItemPedido item = itensIt.next();
			
			this.preco += (item.getQtd() * item.getPreco());
		}
	}
}
