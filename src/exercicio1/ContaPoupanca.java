package exercicio1;

public class ContaPoupanca extends Conta{
	
	private static final double IMPOSTO_POUPANCA = 2;

	public ContaPoupanca(int agencia, int conta, String titular, double limite, double saldo, double valorLimite) {
		super(agencia, conta, titular, limite, saldo, valorLimite);
	}

	@Override
	public void sacar(double valor) {
		valor += IMPOSTO_POUPANCA;
		double total = getSaldo() - valor;
		setSaldo(total);
	}

	@Override
	public void depositar(double valor) {
		double total = getSaldo() + valor;
		setSaldo(total);
	}

}
