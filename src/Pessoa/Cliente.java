package Pessoa;

import Produto.Produto;

public class Cliente extends PessoaAbstract implements InterfaceCliente2 {
  
  Cliente(){
   super();
  }
  
  public void venda(Produto a, int q, double preco2) {
    int z = q * -1;
    double preco = a.getPreco();
    venda(a, z, preco);
    a.setEstoque(z);
  }
  
}