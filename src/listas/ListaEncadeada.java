package listas;

import pilhas.Conta;

public class ListaEncadeada {
	
	private int inseridos;
	
	private Conta cabeca;
	
	public void addCabeca(Conta novoElemento) {
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
	
	public void addCalda(Conta novoItem) {
		if(cabeca == null) {
			cabeca = novoItem;
		}else {
			Conta temp = cabeca;
			
			while(temp.proximo != null) {
				temp = temp.proximo;
			}
			temp.proximo = novoItem;
		}
	}
	
	public void addIndex(int index, Conta novoItem) {
		
	}
	
	public int tamanho() {
		return inseridos;
	}
	
}
