package pilhas;

public class PilhaSequencial {
	
	private int inseridos;
	
	private static final int TAMANHO_INICIAL = 3;
	
	private Object[] arrayInterno = new Object[TAMANHO_INICIAL];

	public void push(Object item) {
		
		if(isFull()) {
			Object[] listaDobrada = new Object[inseridos + 3];
			for(int i = 0; i < arrayInterno.length; i++) {
				listaDobrada[i] = arrayInterno[i];
			}
			listaDobrada = arrayInterno;
		}
		arrayInterno[inseridos] = item;
		inseridos++;
	}

	private boolean isFull() {
		return inseridos == arrayInterno.length; 
	}

	public Object pop() {
		
		Object topElement = null;
		
		if(!isEmpty()) {
			topElement = arrayInterno[inseridos -1];
			arrayInterno[inseridos -1] = null;
		}
		
		return topElement;
		
	}
	
	public boolean isEmpty() {
		return inseridos == 0;
	}
	
	public Object peek() {
		
		Object topElement = null;
		
		if(!isEmpty()) {
			topElement = arrayInterno[inseridos -1];
		}
		
		return topElement;

	}
	
	public int tamanho() {
		return inseridos;
	}
}
