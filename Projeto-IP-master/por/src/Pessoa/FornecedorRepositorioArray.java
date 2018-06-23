package Pessoa;
public class FornecedorRepositorioArray implements InterfaceFornecedor {
	  public Fornecedor arrayFornecedor[] = new Fornecedor[10];
	  public Fornecedor name;
	 
	  
	  public void inserirFornecedor(Fornecedor name){
		for(int i = 0; i<10;i++){
	      if(arrayFornecedor[i] == null)
	        arrayFornecedor[i] = name;
	        i = i+10;
	    }
	    }
	  
	  
	  public boolean procurarFornecedor(Fornecedor name){
	    boolean resposta = false;
	    for(int i = 0; i<10;i++){
	      if(arrayFornecedor[i].equals(name)){
	        resposta = true;
	        i = i+10;
	      }
	    return resposta;
	  }
		return resposta;
		
	  }
	  
	  public void removerFornecedor(Fornecedor name){
	   for(int i = 0; i<10;i++){
	      if(arrayFornecedor[i].equals(name)){
	        arrayFornecedor[i] = null;
	        i = i+10;
	      }
	  }
	}
	}



