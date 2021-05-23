package dequeEncadeado;

import pilhas.Conta;

public class DequeEncadeado {

	private Conta cabeca;
	
	private Conta rabo;
	
	private int inseridos;
	
	public void insertFirst(Conta elemento) {
		if(cabeca == null) {
			cabeca = elemento;
			rabo = elemento;
		} else {
			Conta temp = null;
			
			temp = cabeca;
			cabeca = elemento;
			cabeca.proximo = temp;
		}
		inseridos++;
	}

	public void insertLast(Conta elemento) {
		if(cabeca == null) {
			cabeca = elemento;
			rabo = elemento;
		} else {
			rabo.proximo = elemento;
		}
		inseridos++;
	}
	
	public void removeFirst() {
		if(inseridos == 1) {
			cabeca = rabo;
			rabo = null;
		}
		if(inseridos > 0) {
			Conta ret = cabeca;
			cabeca = cabeca.proximo;
		}
		inseridos--;
	}

	public void removeLast() {
		if(inseridos == 1){
			cabeca = rabo;
			rabo = null;
		}
		if(inseridos > 1) {
			Conta temp = cabeca;
			while(temp.proximo != null) {
				if(temp.proximo.equals(rabo)) {
					temp.proximo = null;
					rabo = temp;
				}
			}
			temp = temp.proximo;
			inseridos--;
		}
	}
	
	public int tamanho() {
		return inseridos;
	}
}
