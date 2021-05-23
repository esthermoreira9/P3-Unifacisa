package ExercicioCollections01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Questao3 {
	
	/*3) Implemente um programa que receba um
	conjunto de números na linha de comando,
	coloque-os em uma List. Em seguida, utilize
	a classe Collections para ordenar a lista de
	forma decrescente através de um
	Comparator.*/
	
	public static void main(String[] args) {
		
		List<String> lista = Arrays.asList(args);
		Collections.sort(lista);
		
		
		for (String elemento : lista) {
			System.out.println(elemento);
		}
		
	}
	

}
