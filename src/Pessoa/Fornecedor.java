package Pessoa;

import Produto.Produto;

public class Fornecedor extends PessoaAbstract {
  
  private Produto produto;
  private int Quantidade;
  
  Fornecedor(){
    super();
  }
  
  public void venda(Produto a,int q) {
    a.setEstoque (q);
  }  
  
  
}