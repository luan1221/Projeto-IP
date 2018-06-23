package Produto;

import Outros.PJIException;
import Outros.PNEException;

public class RepositorioArrayProduto implements repositorioProduto {
  public static Produto arrayProduto[] = new Produto[10];
  public Produto name;
 
  
  public void inserirProduto(Produto name) throws PJIException, PNEException {
      for (int i = 0; i < 10; i++) {
        if (arrayProduto[i] == null) {
           arrayProduto[i] =  name;
        }
      }
    }
  //Chechar se ja inseriu na fachada
  public boolean procurarProduto (Produto name) {
    boolean nAchou = false;
    for (int i = 0; i < 10 && nAchou; i++) {
      if (arrayProduto[i].equals(name)) {
        nAchou = true;
        
        return nAchou;
      }
  }
	return nAchou;
  }
  
  public void removerProduto (Produto name) throws PNEException {
   boolean nAchou = false;
    for (int i = 0; i < 10 && nAchou; i++) {
      if (arrayProduto[i].equals(name)) {
        nAchou = true;
        arrayProduto[i] = null;
      }
      if (nAchou) {
         throw new PNEException();
      }
  }
}
}