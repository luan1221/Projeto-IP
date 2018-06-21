package Produto;

import Outros.EVException;
import Outros.PNEException;

public interface repositorioProduto{

   
   void inserirProduto(Produto name);
   boolean procurarProduto(Produto name) throws PNEException, EVException;
   void removerProduto(Produto name) throws PNEException;

}

