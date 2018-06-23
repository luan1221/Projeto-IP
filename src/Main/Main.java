package Main;

import java.util.Scanner;

import Fachada.Fachada;
import Outros.EVException;
import Outros.PJIException;
import Outros.PNEException;
import Pessoa.Cliente;
import Pessoa.ClienteRepositorioArray;
import Pessoa.ClienteRepositorioLista;
import Pessoa.NegocioCliente;
import Produto.Negocio;
import Produto.Produto;
import Produto.RepositorioArrayProduto;
import Venda.NegocioVenda;
import Venda.RepositorioVendasLista;
import Venda.Venda;

public class Main {
	public static void main(String[] args) throws PNEException, EVException, PJIException {
		Fachada fachada = new Fachada();
		ClienteRepositorioLista repositorioCliente = new ClienteRepositorioLista();
		//repositorio vendas guarda os produtos que determina cliente comprará.
		RepositorioVendasLista repositorioVenda = new RepositorioVendasLista();
		RepositorioArrayProduto repositorioProduto = new RepositorioArrayProduto();
		Cliente Pedro = new Cliente("Pedro", "710871");
		NegocioCliente negocioCliente = new NegocioCliente(repositorioCliente);
		Negocio negocioProduto = new Negocio(repositorioProduto);
		Produto Cafe = new Produto("Cafe", 10, 2);
		Venda vendaPedro = new Venda(repositorioVenda);
		fachada.inserirProduto(Cafe, negocioProduto);
		fachada.inserirCliente(Pedro, negocioCliente);
		Pedro.venda(Cafe, 5, vendaPedro);
		//Adicionar à venda atributo de nome do cliente do carrinho
	}
}
