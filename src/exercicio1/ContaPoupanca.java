package exercicio1;

public final class ContaPoupanca extends Conta{
	
	private static final double IMPOSTO_POUPANCA = 2;

	public ContaPoupanca(int agencia, int conta, String titular, double limite, double saldo, double valorLimite) {
		super(agencia, conta, titular, limite, saldo, valorLimite);
	}

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException, IllegalArgumentException {
		valor += IMPOSTO_POUPANCA;
		if(getSaldo() >= valor && valor > 0) {
			double total = getSaldo() - valor;
			setSaldo(total);
		}else if(getSaldo() < valor){
			throw new SaldoInsuficienteException("Saldo Insuficiente", getSaldo());
		}else if(valor < 0){
			throw new IllegalArgumentException("Valor inválido");
		}
	}


	@Override
	public void depositar(double valor) throws IllegalArgumentException {
		if(valor < 0) {
			throw new IllegalArgumentException("Saque inválido");
		}else {
			double total = getSaldo() + valor;
			setSaldo(total);
		}
	}

	

}
