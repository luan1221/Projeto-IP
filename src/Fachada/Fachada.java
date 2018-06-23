package Fachada;

import Outros.EVException;
import Outros.PNEException;
import Pessoa.Cliente;
import Pessoa.InterfaceCliente;
import Pessoa.NegocioCliente;

public class Fachada {
	public void inserirCliente(Cliente nome, InterfaceCliente rep, NegocioCliente negocioCliente) throws PNEException, EVException{
		boolean b = negocioCliente.procurarCliente(nome);
		if(!b) {
		negocioCliente.inserirCliente(nome);
		}
	}
	public void removerCliente(Cliente nome, NegocioCliente negocioCliente) throws PNEException {
		negocioCliente.removerCliente(nome);
	}
	
}
