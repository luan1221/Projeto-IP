package Pessoa;
public class ClienteRepositorioArray implements InterfaceCliente {
  public Cliente arrayCliente[] = new Cliente[10];
  public Cliente name;
 
  
  public void inserirCliente(Cliente name){
    for(int i = 0; i<10;i++){
      if(arrayCliente[i] == null){
        arrayCliente[i] = name;
        i = i+10;
      }
    }
    }
  
  
  public boolean procurarCliente(Cliente name){
    boolean resposta = false;
    for(int i = 0; i<10;i++){
      if(arrayCliente[i].equals(name)){
        resposta = true;
        i = i+10;
      }
    return resposta;
  }
	return resposta;
	
  }
  
  public void removerCliente(Cliente name){
   for(int i = 0; i<10;i++){
      if(arrayCliente[i].equals(name)){
        arrayCliente[i] = null;
        i = i+10;
      }
  }
}
}



