package Fachada;

import Outros.EVException;
import Outros.PJIException;
import Outros.PNEException;
import Pessoa.Cliente;
import Pessoa.Fornecedor;
import Pessoa.InterfaceCliente;
import Pessoa.NegocioCliente;
import Pessoa.NegocioFornecedor;
import Produto.Negocio;
import Produto.Produto;
import Venda.Venda;

public class Fachada {
	public void inserirCliente(Cliente nome, NegocioCliente negocioCliente) throws PNEException, EVException{
		boolean b = negocioCliente.procurarCliente(nome);
		if(!b) {
		negocioCliente.inserirCliente(nome);
		}
	}
	public void removerCliente(Cliente nome, NegocioCliente negocioCliente) throws PNEException {
		negocioCliente.removerCliente(nome);
	}
	//negocioCliente -> repositorio
	public void procurarCliente(Cliente nome, NegocioCliente negocioCliente) throws PNEException, EVException {
		negocioCliente.procurarCliente(nome);
		//Cliente n�o encontrado
	}
	public void inserirProduto(Produto nome, Negocio negocioProduto) throws PJIException, PNEException, EVException {
		boolean a = negocioProduto.procurarProduto(nome);
		if (!a) {
			negocioProduto.inserirProduto(nome);
		} else {
			//ERRO
		}
	}
	public void removerProduto(Produto nome, Negocio negocioProduto) throws PNEException, EVException, PJIException {
		boolean a = negocioProduto.procurarProduto(nome);
		if (!a) {
			negocioProduto.inserirProduto(nome);
		} else {
			//ERRO
		}
	}
	//PROCURAR????
	public void inserirFornecedor(Fornecedor nome, NegocioFornecedor negocioFornecedor) throws PNEException, EVException{
		boolean b = negocioFornecedor.procurarFornecedor(nome);
		if(!b) {
		negocioFornecedor.inserirFornecedor(nome);
		}
	}
	public void removerFornecedor(Fornecedor nome, NegocioFornecedor negocioFornecedor) throws PNEException, EVException {
		boolean b = negocioFornecedor.procurarFornecedor(nome);
		if(!b) {
		negocioFornecedor.removerFornecedor(nome);
		}
	}
	//negocioCliente -> repositorio
	public void procurarFornecedor(Fornecedor nome, NegocioFornecedor negocioFornecedor) throws PNEException, EVException {
		negocioFornecedor.procurarFornecedor(nome);
		//Fornecedor n�o encontrado
	}
	//Metodos de venda
	public void inserirItem(Produto prod, int quantidade, Venda vendaCliente) {
		
	}

}
