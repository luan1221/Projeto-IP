package Produto;

import Outros.EVException;
import Outros.PJIException;
import Outros.PNEException;

public interface repositorioProduto{

   
   void inserirProduto(Produto name) throws PJIException, PNEException;
   boolean procurarProduto(Produto name) throws PNEException, EVException;
   void removerProduto(Produto name) throws PNEException;

}

