package exercicio1;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new ContaPoupanca(1,1,"Esther",1000,200,2000);
		
		System.out.println("\n----Tentando sacar R$250.00 quando o saldo é R$200 em uma conta poupança----\n");
		try {
			c1.sacar(250);
		} catch (IllegalArgumentException e2) {
			e2.printStackTrace();
		} catch (SaldoInsuficienteException e2) {
			e2.printStackTrace();
			System.out.println("O valor lançado pela exceção é: "+ e2.getValor());
		}
		
		System.out.println("\n----Tentando sacar R$100.00 quando o saldo é R$200 em uma conta poupança----\n");
		try {
			c1.sacar(100);
		} catch (IllegalArgumentException e2) {
			e2.printStackTrace();
		} catch (SaldoInsuficienteException e2) {
			e2.printStackTrace();
		}
		System.out.println(c1.getSaldo());
		
		System.out.println("\n----Depositando R$50 na conta poupança----\n");
		try {
			c1.depositar(50);
		} catch (IllegalArgumentException e1) {
			e1.printStackTrace();
		}
		System.out.println(c1.getSaldo());
		
		Conta c2 = new ContaCorrente(1,1,"Esther",1500,300,2600);
		
		System.out.println("\n----Tentando sacar R$350.00 quando o saldo é R$300 em uma conta corrente----\n");
		try {
			c2.sacar(350);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
			System.out.println("O valor lançado pela exceção é: "+ e.getValor());
		}
		
		System.out.println("\n----Tentando sacar R$200.00 quando o saldo é R$300 em uma conta corrente----\n");
		try {
			c2.sacar(200);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SaldoInsuficienteException e) {
			e.printStackTrace();
			System.out.println("O valor lançado pela exceção é: "+ e.getValor());
		}
		System.out.println(c2.getSaldo());
		
		System.out.println("\n----Depositando R$50 na conta corrente\n----");
		try {
			c2.depositar(50);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println(c2.getSaldo());
	}

	}
	
