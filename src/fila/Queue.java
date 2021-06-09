package fila;

import java.util.LinkedList;

public class Queue {
	private LinkedList<Object> conteudo = new LinkedList<Object>();
	
	public void enqueue(Object item) {
		conteudo.addLast(item);
	}
	public void dequeue() {
		conteudo.removeFirst();
	}
	public Object peek() {
		return conteudo.getFirst();
	}
	public int tamanho() {
		return conteudo.size();
	}
}
