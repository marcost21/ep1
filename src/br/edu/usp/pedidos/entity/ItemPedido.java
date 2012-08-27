package br.edu.usp.pedidos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ItemPedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	private Pedido pedido;
	private String descricao;
	private int qtd;
	private Double preco;

	public ItemPedido(String descricao, int qtd, Double preco) {
		this.descricao = descricao;
		this.qtd = qtd;
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public Double getPreco() {
		return preco;
	}
}
