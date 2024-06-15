package model;

public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 0001;
	private static int SEQUENCIAL = 1;
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		if(saldo > 0) {
			saldo -= valor; 
		}else {
			System.out.println("Saldo insuficiente para saque!");
		}	
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s - CPF: %s", this.cliente.getNome(), this.cliente.getCpf()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
