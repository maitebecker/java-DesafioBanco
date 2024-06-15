package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome;
	List<Conta> contas = new ArrayList<Conta>(); 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}
	
	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void listarClientes() {
		List<String> nomes = new ArrayList<String>();
		for(Conta conta : contas) {
			nomes.add(conta.cliente.getNome());
		}
		System.out.println("=== Clientes ==");
		System.out.println(nomes);
	}
}
