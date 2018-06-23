package Pessoa;

import Produto.Produto;
import Venda.Venda;

public abstract class PessoaAbstract {
  
  private String nome;
  private String cpf;
  
 PessoaAbstract(){
    this.nome = null;
    this.cpf = null;
  }
 //Fornecedor adiciona ao Estoque
 //Cliente retira do estoque
public abstract void venda(Produto a,int addEstoque, Venda venda);
  
}