package fila;

import java.util.LinkedList;

public class Queue {
	private LinkedList<Pessoa> filaNormal = new LinkedList<Pessoa>();
	private LinkedList<Pessoa> filaPrioritaria = new LinkedList<Pessoa>();
	
	public void enqueue(Pessoa p1, boolean prioritaria) throws filaCheiaException {
		if(filaNormal.size() + filaPrioritaria.size() == 100) {
			throw new filaCheiaException("A fila atingiu seu limite");
		}
		if(prioritaria) {
			filaPrioritaria.addLast(p1);
		}else {
			filaNormal.addLast(p1);
		}
	}
	
	public void dequeue() {
		filaNormal.removeFirst();
		filaNormal.removeFirst();
		filaPrioritaria.removeFirst();
	}
	
	public int tamanho() {
		return filaNormal.size() + filaPrioritaria.size();
	}
	
 public static void main(String[] args) {
	Queue fila = new Queue();
	Pessoa p1 = new Pessoa("Esther");
	Pessoa p2 = new Pessoa("Cainã");
	Pessoa p3 = new Pessoa("Raquel");
	Pessoa p4 = new Pessoa("Anne");
	Pessoa p5 = new Pessoa("Dani");
	Pessoa p6 = new Pessoa("José");
	Pessoa p7 = new Pessoa("Pedro");
	Pessoa p8 = new Pessoa("Abella");
	Pessoa p9 = new Pessoa("Vitor");
	
	try {
		fila.enqueue(p1, false);
	} catch (filaCheiaException e) {
		e.printStackTrace();
	}
	try {
		fila.enqueue(p2, false);
	} catch (filaCheiaException e) {
		e.printStackTrace();
	}
	try {
		fila.enqueue(p3, true);
	} catch (filaCheiaException e) {
		e.printStackTrace();
	}
	try {
		fila.enqueue(p4, true);
	} catch (filaCheiaException e) {
		e.printStackTrace();
	}
	try {
		fila.enqueue(p5, false);
	} catch (filaCheiaException e1) {
		e1.printStackTrace();
	}
	try {
		fila.enqueue(p6, false);
	} catch (filaCheiaException e) {
		e.printStackTrace();
	}
	try {
		fila.enqueue(p7, true);
	} catch (filaCheiaException e) {
		e.printStackTrace();
	}
	try {
		fila.enqueue(p8, false);
	} catch (filaCheiaException e) {
		e.printStackTrace();
	}
	try {
		fila.enqueue(p9, false);
	} catch (filaCheiaException e) {
		e.printStackTrace();
	}
	
	fila.dequeue();
	
}
 
 
}
