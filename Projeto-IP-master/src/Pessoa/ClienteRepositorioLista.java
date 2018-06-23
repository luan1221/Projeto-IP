package Pessoa;
public class ClienteRepositorioLista implements InterfaceCliente {
  
  private Cliente nome;
  private ClienteRepositorioLista proximo;
  
  public ClienteRepositorioLista() {
    this.nome = null;
    this.proximo = null;
  }
  
  public void inserirCliente(Cliente name){
    if(this.nome == null){
      this.nome = name;
      this.proximo = new ClienteRepositorioLista();
    }else if (this.proximo!=null){
      this.proximo.inserirCliente(name);
    }
  }
  
  public boolean procurarCliente(Cliente name){
    boolean resposta = false;
    if(this.nome!=null) {
	    if(this.nome.equals(name)){
	      resposta = true;
	      return resposta;
	    }else if(this.proximo!= null) {
	      this.proximo.procurarCliente(name);
	    }
    }
    return false;
  }
  
  public void removerCliente(Cliente name){
   if(this.nome.equals(name)){
      this.nome = this.proximo.nome;
      this.proximo = this.proximo.proximo;
    }else if (this.proximo!=null){
      this.proximo.removerCliente(name);
    }
  }

}