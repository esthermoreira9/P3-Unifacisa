package ExercicioCollections01;

import java.util.ArrayList;
import java.util.HashSet;

public class Questao01 {
	
	public static void main(String[] args) {
		
		
		/*1) Escreva um programa que compare o
		desempenho das classes HashSet e
		ArrayList. A comparação deve ser feita
		medindo os tempos de inserção, remoção,
		obtenção e navegação. */
		
		long start = System.currentTimeMillis();
		
		ArrayList<String> listaSequencial = new ArrayList<String>();
		
		for(int i =0; i < 100; i++) {
			listaSequencial.add("elemento " + i);
		}
		
		listaSequencial.remove(99);
		
		String primeiraPosicao = listaSequencial.get(0);
		
		for (String elemento : listaSequencial) {
			System.out.println(elemento);
		}
		
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.println("Tempo do ArrayList: " + timeElapsed);
		
		System.out.println("\n-----------------\n");
		
		start = System.currentTimeMillis();
		HashSet<String> conjunto = new HashSet<String>();
		
		for(int i =0; i < 100; i++) {
			conjunto.add("elemento " + i);
		}
		
		conjunto.remove("elemento 0");
		
		for (String elemento : conjunto) {
			System.out.println(elemento);
		}
		
		finish = System.currentTimeMillis();
		timeElapsed = finish - start;
		System.out.println("Tempo do HashSet: " + timeElapsed);
		
	}
	
}
