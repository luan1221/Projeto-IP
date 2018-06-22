package Venda;

import Outros.PJIException;
import Outros.PNEException;
import Produto.Produto;

public class Venda {
	private RepositorioVendas carrinho;
	private double saldoCompra;
	private int numItens;
	
	Venda(RepositorioVendas carrinho) {
		this.carrinho = null;
		this.saldoCompra = 0.0;
		this.numItens = 0;
	}
	public void inserirItem(Produto prod, int quantidade) {
		carrinho.inserir(prod,quantidade);
		saldoCompra += quantidade*prod.getPreco();
		numItens += quantidade; 
	}
	public boolean procurarItem(Produto nome, int quantidade) {
		boolean x = carrinho.procurar(nome, quantidade);
		if (x) {
			saldoCompra += quantidade*nome.getPreco();
			numItens += quantidade;
		} else {
			return x;
		}
		return x;
	}
	public void removerItem(Produto nome, int quantidade) throws PNEException {
		if (quantidade == -1) {
			carrinho.remover(nome);
		} else {
			quantidade = quantidade*(-1);
			carrinho.inserir(nome, quantidade);
			saldoCompra += quantidade;
		}
		
	}
}
