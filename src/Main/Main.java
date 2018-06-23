package Main;

import java.util.Scanner;

import Fachada.Fachada;
import Outros.EVException;
import Outros.PNEException;
import Pessoa.Cliente;
import Pessoa.ClienteRepositorioArray;
import Pessoa.ClienteRepositorioLista;
import Pessoa.NegocioCliente;

public class Main {
	public static void main(String[] args) throws PNEException, EVException {
		Fachada fachada = new Fachada();
		ClienteRepositorioLista repositorio = new ClienteRepositorioLista();
		Cliente Pedro = new Cliente("Pedro", "710871");
		NegocioCliente negocioCliente = new NegocioCliente(repositorio);
		fachada.inserirCliente(Pedro, repositorio, negocioCliente);
	}
}
