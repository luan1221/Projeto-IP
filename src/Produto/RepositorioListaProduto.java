package Produto;

import Outros.EVException;
import Outros.PNEException;

public class RepositorioListaProduto implements repositorioProduto {
  private Produto nome;
  private RepositorioListaProduto proximo;
  
  RepositorioListaProduto() {
    this.nome = null;
    this.proximo = null;
  }
  
  public void inserirProduto (Produto name) {
    if (this.nome == null) {
       this.nome = name;
       this.proximo = new RepositorioListaProduto();
    } else if (this.proximo != null) {
       this.proximo.inserirProduto(name);
    }
  }
  
  public boolean procurarProduto(Produto name) throws PNEException, EVException { 
    boolean resposta;
    if (this.nome.equals(name) && this.nome != null) {
       resposta = true;
       return resposta;
    } else if (this.nome == null && this.proximo == null) {
      throw new EVException();
    } else if (this.proximo != null) {
       this.proximo.procurarProduto(name);
    } else {
      throw new PNEException();
    }
    return false;
  }
  
  public void removerProduto (Produto name) throws PNEException{
   if (this.nome.equals(name)) {
       this.nome = this.proximo.nome;
       this.proximo = this.proximo.proximo;
    } else if (this.proximo != null) {
       this.proximo.removerProduto(name);
    } else {
     throw new PNEException();
   }
  }


}