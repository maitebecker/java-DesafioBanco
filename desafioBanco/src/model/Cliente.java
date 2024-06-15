package model;

import util.validacaoCPF;

public class Cliente {
	private String nome;
	private String cpf;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		validacaoCPF validacaoCPF = new validacaoCPF();
		try {
			if(validacaoCPF.isCPF(cpf)) {
				this.cpf = cpf;
			}else {
				throw new IllegalArgumentException("CPF Inválido");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
}
