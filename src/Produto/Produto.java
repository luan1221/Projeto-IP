package Produto;

import Outros.EVException;

public class Produto {
  private String nome;
  private int estoque;
  public double preco;
  
  Produto (String name, int quantity, Double price) {
    this.nome = name;
    this.estoque = quantity;
    this.preco = price;
  }
 
  public void setPreco (Double price){
      this.preco = price;
    }
   
  public void setEstoque (int quantity) {
      this.estoque = this.estoque + quantity;
    }


public Double getPreco() {
      return this.preco;
    }
  


  public int getEstoque () throws EVException {
	  if (this.estoque == 0) {
		    throw new EVException(); 
      }else {
    	  return this.estoque;
      }
}
  
  
}
