package dequeSequencial;

public class DequeSequencial {

	private static final int ALOCACAO_INICIAL = 3;

	private Conta[] arrayInterno = new Conta[ALOCACAO_INICIAL];

	private int inseridos;

	public void insertFirst(Conta elemento) {

		if (isFull()) {
			Object[] listaDobrada = new Object[inseridos + 3];
			for (int i = 0; i < arrayInterno.length; i++) {
				listaDobrada[i] = arrayInterno[i];
			}
			listaDobrada = arrayInterno;
		}
		if (arrayInterno[0] == null) {
			arrayInterno[0] = elemento;

		}else {
			for (int i = 1; i > arrayInterno.length - 1; i++) {
				arrayInterno[i] = arrayInterno[i + 1];
			}

		}
		arrayInterno[0] = elemento;
		inseridos++;

	}

	private boolean isFull() {
		return inseridos == arrayInterno.length;
	}

	public void insertLast(Conta elemento) {
		if(isFull()) {
			Object[] listaDobrada = new Object[inseridos + 3];
			for (int i = 0; i < arrayInterno.length; i++) {
				listaDobrada[i] = arrayInterno[i];
			}
			listaDobrada = arrayInterno;
		}

	}

	public Conta removeFirst() {
		return null;
	}

	public Conta removeLast() {
		return null;
	}

	public int tamanho() {
		return inseridos;
	}

	public boolean isEmpty() {
		return inseridos == 0;
	}
}
