package Produto;

import Outros.EVException;
import Outros.PNEException;

public class Negocio {
	private InterfaceProduto produto;
	Negocio(InterfaceProduto rep) {
		this.produto = rep;
	}
	 public void inserirProduto(String name) {
		 produto.inserirProduto(name);
	 }
	  public boolean procurarProduto(String name) throws PNEException, EVException {
		  return produto.procurarProduto(name);
	  }
	  public void removerProduto(String name) throws PNEException{
		  produto.removerProduto(name);
	  }
}
