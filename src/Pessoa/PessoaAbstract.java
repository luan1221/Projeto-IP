package Pessoa;

import Produto.Produto;

public abstract class PessoaAbstract {
  
  private String nome;
  private String cpf;
  
 PessoaAbstract(){
    this.nome = null;
    this.cpf = null;
  }
 //Fornecedor adiciona ao Estoque
 //Cliente retira do estoque
public void venda(Produto a, int d) {
}
  
}