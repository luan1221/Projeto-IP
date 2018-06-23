package Pessoa;
public class FornecedorRepositorioLista implements InterfaceFornecedor {
  
  private Fornecedor nome;
  private FornecedorRepositorioLista proximo;
  
  FornecedorRepositorioLista() {
    this.nome = null;
    this.proximo = null;
  }
  
  public void inserirFornecedor(Fornecedor name){
    if(this.nome == null){
      this.nome = name;
      this.proximo = new FornecedorRepositorioLista();
    }else if (this.proximo!=null){
      this.proximo.inserirFornecedor(name);
    }
  }
  
  public boolean procurarFornecedor(Fornecedor name){
    boolean resposta;
    if(this.nome.equals(name)){
      resposta = true;
      return resposta;
    }else if(this.proximo!= null) {
      this.proximo.procurarFornecedor(name);
    }
    return false;
  }
  
  public void removerFornecedor(Fornecedor name){
   if(this.nome.equals(name)){
      this.nome = this.proximo.nome;
      this.proximo = this.proximo.proximo;
    }else if (this.proximo!=null){
      this.proximo.removerFornecedor(name);
    }
  }



}