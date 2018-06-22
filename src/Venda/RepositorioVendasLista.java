package Venda;

import Outros.EVException;
import Outros.PNEException;
import Produto.Produto;
import Produto.RepositorioListaProduto;

public class RepositorioVendasLista implements RepositorioVendas {
  private Produto nome;
  private int quantidade;
  private RepositorioVendasLista proximo;

  RepositorioVendasLista() {
    this.nome = null;
    this.proximo = null;
    this.quantidade = 0;
  }
public void inserir(Produto nome, int quantidade) {
    if (this.nome == null) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.proximo = new RepositorioVendasLista();
     } else if (this.proximo != null) {
        this.proximo.inserir(nome, quantidade);
     }
   }

public boolean procurar(Produto nome, int quantidade) {
    boolean resposta= false;
    if (this.nome.equals(nome) && this.nome != null) {
       resposta = true;
       return resposta;
    } else if (this.nome == null && this.proximo == null) {
      resposta = false;
    } else if (this.proximo != null) {
       this.proximo.procurar(nome, quantidade);
    }
	return resposta;
}

public void remover(Produto nome) throws PNEException {
	   if (this.nome.equals(nome)) {
	       this.nome = this.proximo.nome;
	       this.quantidade = this.proximo.quantidade;
	       this.proximo = this.proximo.proximo;
	    } else if (this.proximo != null) {
	       this.proximo.remover(nome);
	    } else {
	     throw new PNEException();
	   
	    }
	}
}
 