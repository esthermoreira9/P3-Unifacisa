package recursividade;

public class Somatorio {
	public int aux;
	public int somatorio(int n) {
		aux += n;
		if(n>0) {
			aux = somatorio(n-1);			
		}
		return aux;
	}
	
	public static void main(String[] args) {
		Somatorio s = new Somatorio();
		System.out.println("O resultado é: " + s.somatorio(5));
	}

}

