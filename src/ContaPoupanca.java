public class ContaPoupanca extends Conta {

	public void imprimirExtrato() {
		System.out.println(">>> Extrato de Conta Poupanca <<<");
		super.imprimirInfo();
	}

	public void imprimirSaldo() {
		System.out.println(">>> Saldo de Conta Poupanca <<<");
		super.imprimirInfo();
	}
}