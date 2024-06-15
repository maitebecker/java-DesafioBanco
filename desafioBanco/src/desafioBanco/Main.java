package desafioBanco;

import java.util.ArrayList;
import java.util.List;

import model.Banco;
import model.Cliente;
import model.Conta;
import service.ContaCorrente;
import service.ContaPoupanca;

public class Main {
	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<Conta>();
		Banco banco = new Banco();
		
		Cliente maite = new Cliente();
		maite.setNome("Maite");
		maite.setCpf("053.896.360-31");
		Conta cc = new ContaCorrente(maite);
		
		Cliente joao = new Cliente();
		joao.setNome("joao");
		joao.setCpf("059.614.670-15");
		Conta poupanca = new ContaPoupanca(joao);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		contas.add(cc);
		contas.add(poupanca);
		banco.setContas(contas);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		banco.listarClientes();
	}
}
