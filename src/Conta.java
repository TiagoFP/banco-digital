public class Conta {

	private static final int AGENCIA_PADRAO = 0001;

	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public void sacar(double valor) {
		this.saldo -= valor;
	}

	public void depositar(double valor) {
		this.saldo = +valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public void imprimirExtrato() {
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

	protected void imprimirInfo() {
		System.out.println(String.format("Titular: " + cliente,	this.cliente.getNome()));
		System.out.println(String.format("Agencia: " + agencia, this.agencia));
		System.out.println(String.format("Numero: " + numero, this.numero));
		System.out.println(String.format("Saldo: " + saldo, this.saldo));
	}
	
}
