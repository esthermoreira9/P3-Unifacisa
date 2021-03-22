package exercicio1;

public class Main {

	public static void main(String[] args) {
		Conta c1 = new ContaPoupanca(1,1,"Esther",1000,200,2000);
		c1.sacar(100);
		System.out.println(c1.getSaldo());
		c1.depositar(50);
		System.out.println(c1.getSaldo());
		
		Conta c2 = new ContaCorrente(1,1,"Esther",1500,300,2600);
		c2.sacar(100);
		System.out.println(c2.getSaldo());
		c2.depositar(50);
		System.out.println(c2.getSaldo());
	}

}
