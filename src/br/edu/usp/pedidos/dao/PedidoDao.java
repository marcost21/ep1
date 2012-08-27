package br.edu.usp.pedidos.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.vraptor.ioc.Component;
import br.edu.usp.pedidos.entity.Pedido;

@Component
public class PedidoDao {
	
	private final Session session;
	
	public PedidoDao(Session session) {
		this.session = session;
	}
	
	public List<Pedido> listaTudo() {
		return session.createCriteria(Pedido.class).list();
    }
	
	public Pedido listaUm(long id) {
		return (Pedido)this.session.load(Pedido.class, id);
	}

	public void salva(Pedido pedido) {
		Transaction tx = this.session.beginTransaction();
		this.session.save(pedido);
		tx.commit();
	}
	
	
}
