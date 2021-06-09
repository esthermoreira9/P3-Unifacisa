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
		Conta temp = cabeca;

        boolean validada = validaIndex(index);
        if(validada) {
            if(inseridos == 0 && index == 0) {
                addCabeca(novoItem);
            } else if(index == inseridos) {
                addCalda(novoItem);
            } else {
                for (int i = 0; i < inseridos-1; i++) {
                    temp = temp.proximo;
                } 
                Conta anterior = temp;
                temp = novoItem;
                novoItem.proximo = anterior;
            }
            inseridos++;

        } else {
            System.out.println("Posição inválida");
            return;
        }
	}
	
	public boolean validaIndex(int index) {
        if(index >= 0 && index <= inseridos) {
            return true;
        }
        return false;
    }
	
	public void removeCabeca(Conta novoItem) {
		if(inseridos == 1) {
			cabeca = null;
		}
		else if(inseridos == 0){
			System.out.println("Não existem elementos a serem removidos");
		}
		else {
			cabeca = null;
			cabeca = cabeca.proximo;
		}
		inseridos--;
	}
	
	public int tamanho() {
		return inseridos;
	}
	
}
