package Venda;

import Outros.PJIException;
import Outros.PNEException;
import Produto.Produto;

public class Venda {
	private RepositorioVendas carrinho;
	private String cliente;
	private double saldoCompra;
	private int numItens;
	
	public Venda(RepositorioVendas carrinho) {
		this.carrinho = carrinho;
		this.saldoCompra = 0.0;
		this.numItens = 0;
	}
	//Insere o item à lista de compra e adiciona o preco ao Saldo Total
	public void inserirItem(Produto prod, int quantidade) {
		carrinho.inserir(prod,quantidade);
		saldoCompra = quantidade*prod.getPreco();
		numItens = quantidade; 
	}
	public boolean procurarItem(Produto nome, int quantidade) {
		//Se o item já foi inserido, adicionar a quantidade da nova inserção
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
			//Se a quantidade for -1 remove toda a quantidade de itens do carrinho;
			carrinho.remover(nome);
		} else {
			//se não, apenas a quantidade passada;
			quantidade = quantidade*(-1);
			carrinho.inserir(nome, quantidade);
			saldoCompra += quantidade;
		}
		
	}
}
