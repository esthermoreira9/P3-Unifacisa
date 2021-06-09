package pilhas;

public class PilhaEncadeada {
	
	private int inseridos;
	
	private Conta cabeca;

	public void push(Conta novoElemento) {
		if(cabeca == null) {
			cabeca = novoElemento;
		} else {
			Conta temp = null;
			
			temp = cabeca;
			cabeca = novoElemento;
			cabeca.proximo = temp;
		}
		inseridos++;
	}

	public Conta pop() {
		Conta topElement = null;
		
		if(inseridos > 0) {
			topElement = cabeca;
			cabeca = cabeca.proximo;
		}
		
		return topElement;
		
	}
	
	public Conta peek() {
		return cabeca;
	}
	
	public int tamanho() {
		return inseridos;
	}

}
