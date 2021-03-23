package exercicio1;

public abstract class Conta {
	
	private int agencia;
	private int conta;
	private String titular;
	private double limite;
	private double saldo;
	private double valorLimite;
	
	
	
	public Conta(int agencia, int conta, String titular, double limite, double saldo, double valorLimite) {
		super();
		this.agencia = agencia;
		this.setConta(conta);
		this.setTitular(titular);
		this.limite = limite;
		this.saldo = saldo;
		this.valorLimite = valorLimite;
	}

	public abstract void sacar(double valor);
	
	public abstract void depositar(double valor);

	public abstract void setValorLimite(float valor);

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getLimite() {
		return limite;
	}

	public double getValorLimite() {
		return valorLimite;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	

}
