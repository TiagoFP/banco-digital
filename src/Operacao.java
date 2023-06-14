public class Operacao {
	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca();
		cc.transferir(25, poupanca);
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}
}

