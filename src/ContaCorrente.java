public class ContaCorrente extends Conta {

	public void imprimirExtrato() {
		System.out.println(">>> Extrato de Conta Corrente <<<");
		super.imprimirInfo();
	}

	public void imprimirSaldo() {
		System.out.println(">>> Saldo de Conta Corrente <<<");
		super.imprimirInfo();
	}
}
