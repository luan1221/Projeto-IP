package Venda;

import Outros.EVException;
import Outros.PJIException;
import Outros.PNEException;
import Produto.Produto;

public interface RepositorioVendas {
  void inserir(Produto nome, int quantidade) throws PJIException;
  boolean procurar(Produto nome, int quantidade);
  void remover(Produto nome) throws PNEException;
  
    
    
}