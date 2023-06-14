public class Operacao {
	public static void main(String[] args) {
		Cliente tiago = new Cliente();
		tiago.setNome("Tiago");
		Conta cc = new ContaCorrente(tiago);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(tiago);
		cc.transferir(25, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}
}

