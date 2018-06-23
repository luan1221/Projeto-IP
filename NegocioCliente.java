package Pessoa;

import Outros.EVException;
import Outros.PNEException;

public class NegocioCliente {
	private InterfaceCliente cliente;
		public NegocioCliente(InterfaceCliente rep) {
			this.cliente = rep;
		}
		 public void inserirCliente(Cliente name) {
			 cliente.inserirCliente(name);
		 }
		  public boolean procurarCliente(Cliente name) throws PNEException, EVException {
			  return cliente.procurarCliente(name);
		  }
		  public void removerCliente(Cliente name) throws PNEException{
			 cliente.removerCliente(name);
		  }
	}
