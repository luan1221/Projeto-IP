package Pessoa;

import Produto.Produto;
import Venda.Venda;

public class Cliente extends PessoaAbstract {
  
  public Cliente(String nome, String cpf){
   super();
  }
  
  public void venda(Produto a, int q, Venda venda) {
    int removeEstoque = q * -1;
    boolean b = venda.procurarItem(a, q);
    if (!b) {
    venda.inserirItem(a, removeEstoque);
    }
    a.setEstoque(removeEstoque);
  }
}