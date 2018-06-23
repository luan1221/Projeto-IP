package Pessoa;

import Produto.Produto;

public class Cliente extends PessoaAbstract {
  
  public Cliente(String nome, String cpf){
   super();
  }
  
  public void venda(Produto a, int q) {
    int removeEstoque = q * -1;
    venda(a, removeEstoque);
    a.setEstoque(removeEstoque);
  }
}