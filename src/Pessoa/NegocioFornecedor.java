package Pessoa;

import Outros.EVException;
import Outros.PNEException;

public class NegocioFornecedor {
	private InterfaceFornecedor produto;
	NegocioFornecedor(InterfaceFornecedor rep) {
		this.produto = rep;
	}
	 public void inserirFornecedor(Fornecedor name) {
		 produto.inserirFornecedor(name);
	 }
	  public boolean procurarFornecedor(Fornecedor name) throws PNEException, EVException {
		  return produto.procurarFornecedor(name);
	  }
	  public void removerProduto(Fornecedor name) throws PNEException{
		  produto.removerFornecedor(name);
	  }
}
