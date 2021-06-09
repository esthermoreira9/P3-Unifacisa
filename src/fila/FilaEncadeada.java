package fila;

public class FilaEncadeada {
	private No cabeca = null;
	private No rabo = null;
	
	public boolean isEmpty() {
		return cabeca == null;
	}
	
	public void enqueue(No item) {
		No novoNo = new No(item, null);
		if(isEmpty()) {
			cabeca = novoNo;
		}else {
			rabo.proximo = novoNo;
		}
		rabo = novoNo;
	}
	
	public No dequeue() {
		No item = cabeca;
		if(rabo == cabeca) {
			rabo = null;
		}
		cabeca = cabeca.proximo;
		return item;
	}
	
	public No peek() {
		return cabeca;
	}
	
	public int tamanho() {
		int contador = 0;
		for(No no = cabeca; no != null; no = no.proximo) {
			contador++;
		}
		return contador;
	}
}
