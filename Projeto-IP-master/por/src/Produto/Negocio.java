package Produto;

import Outros.EVException;
import Outros.PJIException;
import Outros.PNEException;

public class Negocio {
	private repositorioProduto produto;
	public Negocio(repositorioProduto rep) {
		this.produto = rep;
	}
	 public void inserirProduto(Produto name) throws PJIException, PNEException {
		 produto.inserirProduto(name);
	 }
	  public boolean procurarProduto(Produto name) throws PNEException, EVException {
		  return produto.procurarProduto(name);
	  }
	  public void removerProduto(Produto name) throws PNEException{
		  produto.removerProduto(name);
	  }
}
