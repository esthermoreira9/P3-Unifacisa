package exercicio1;

public class SaldoInsuficienteException extends Exception{
	
	private double valor = 0;

	public SaldoInsuficienteException(String message) {
		super(message);
	}
	
	public SaldoInsuficienteException(String message, double valor) {
		super(message);
		this.valor = valor;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	

}
