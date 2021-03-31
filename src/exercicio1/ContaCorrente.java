package exercicio1;

public final class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int conta, String titular, double limite, double saldo, double valorLimite) {
		super(agencia, conta, titular, limite, saldo, valorLimite);
	}

	@Override
	public void sacar(double valor) throws IllegalArgumentException, SaldoInsuficienteException{
		if(getSaldo() >= valor && valor > 0) {
			double total = getSaldo() - valor;
			setSaldo(total);
		}else if(getSaldo() < valor){
			throw new SaldoInsuficienteException("Saldo Insuficiente", getSaldo());
		}else if(valor < 0){
			throw new IllegalArgumentException("Valor inv�lido");
		}
	}


	@Override
	public void depositar(double valor) throws IllegalArgumentException {
		if(valor < 0) {
			throw new IllegalArgumentException("Saque inv�lido");
		}else {
			double total = getSaldo() + valor;
			setSaldo(total);
		}
	}

	

}
