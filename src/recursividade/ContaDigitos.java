package recursividade;

public class ContaDigitos {
	public static void main(String[] args) {
		System.out.println(ContaDigitos(500));
	}
	public static int ContaDigitos(double n) {
		int count = 1;
		if(n >= 10) {
			n /= 10;
			count += ContaDigitos(n);
		}
		return count;
	}

}
