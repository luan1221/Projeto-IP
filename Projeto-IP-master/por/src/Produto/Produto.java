package Produto;

import Outros.EVException;

public class Produto {
  private String nome;
  private int estoque;
  public double preco;
  
  public Produto (String name, int quantity, double price) {
    this.nome = name;
    this.estoque = quantity;
    this.preco = price;
  }
 
  public void setPreco (double price){
      this.preco = price;
    }
   
  public void setEstoque (int quantity) {
      this.estoque = this.estoque + quantity;
    }


public double getPreco() {
      return this.preco;
    }
  


  public int getEstoque () throws EVException {
	  if (this.estoque == 0) {
		    throw new EVException(); 
		    //Atribuir Erro para quando tentar remover uma quantidade maior que a do estoque 
      }else {
    	  return this.estoque;
      }
}
  
  
}
