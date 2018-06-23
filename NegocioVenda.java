package Venda;

import Outros.EVException;
import Outros.PJIException;
import Outros.PNEException;
import Produto.Produto;
import Produto.repositorioProduto;

public class NegocioVenda {
	private RepositorioVendas venda;
		public NegocioVenda(RepositorioVendas rep) {
		this.venda = rep;
	}
	public void inserirProduto(Produto name, int quantidade) throws PJIException, PNEException {
		venda.inserir(name, quantidade);
	 }
	public boolean procurarProduto(Produto name,int quantidade) throws PNEException, EVException {
		  return venda.procurar(name, quantidade);
	  }
	public void removerProduto(Produto name) throws PNEException{
	  venda.remover(name);
	 }
	}