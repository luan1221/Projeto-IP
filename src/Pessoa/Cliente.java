package Pessoa;

import Produto.Produto;

public class Cliente extends PessoaAbstract {
  
  Cliente(){
   super();
  }
  
  public void venda(Produto a, int q) {
    int removeEstoque = q * -1;
    double preco = a.getPreco();
    venda(a, removeEstoque);
    a.setEstoque(removeEstoque);
  }
}