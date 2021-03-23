package exercicio1;

public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int conta, String titular, double limite, double saldo, double valorLimite) {
		super(agencia, conta, titular, limite, saldo, valorLimite);
	}

	@Override
	public void sacar(double valor) {
		double total = getSaldo() - valor;
		setSaldo(total);
	}

	@Override
	public void depositar(double valor) {
		double total = getSaldo() + valor;
		setSaldo(total);
	}

	@Override
	public void setValorLimite(float valor) {
		setValorLimite(valor);
	}

}
