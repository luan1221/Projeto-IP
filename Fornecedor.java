package Pessoa;

import Produto.Produto;
import Venda.Venda;

public class Fornecedor extends PessoaAbstract {
  
  private Produto produto;
  private int Quantidade;
  
  public Fornecedor(Produto produto, int quantidade){
    super();
  }
  //Attention
  public void venda(Produto a,int addEstoque, Venda venda) {
    a.setEstoque(addEstoque);
  }
}