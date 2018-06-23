package Venda;

import Outros.PJIException;
import Outros.PNEException;
import Produto.Produto;
import Produto.RepositorioArrayProduto;

public class RepositorioVendasArray implements RepositorioVendas {
	  private Produto arrayProduto[] = new Produto[10];
	  private int [] quantidade = new int[2];
	  
	public void inserir(Produto nome, int quantidade) {
	    //Primeiro checar se o produto já foi inserido
	        for (int i = 0; i < 10; i++) {
	          if (this.arrayProduto[i] == null) {
	             this.arrayProduto[i] =  nome;
	             this.quantidade[i] = quantidade;
	             i +=10;
	          }
	        }
	      	    	  
	}

	public  boolean procurar(Produto nome, int quantidade) {
	    boolean nAchou = false;
	    for (int i = 0; i < 10 && nAchou; i++) {
	      if (this.arrayProduto[i].equals(nome)) {
	    	  this.quantidade[i] += quantidade;
	    	  nAchou = true;
	        return nAchou;
	      }
	  }
		return nAchou;
	}

	public void remover(Produto nome) throws PNEException {
	   boolean nAchou = false;
	   	for (int i = 0; i < 10 && nAchou; i++) {
		     if (arrayProduto[i].equals(nome)) {
		     nAchou = true;
		     arrayProduto[i] = null;
		  }
		if (nAchou) {
		throw new PNEException();
		}
	 }
	}
}