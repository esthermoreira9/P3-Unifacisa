package exercicio1;

/**
 * 
 * @version 1.0
 * @since 04/2021
 * @author esther.moreira
 *
 */

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
