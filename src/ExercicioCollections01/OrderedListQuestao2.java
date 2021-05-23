package ExercicioCollections01;

import java.util.ArrayList;
import java.util.Collections;

public class OrderedListQuestao2 {
		
		/*2) Implementar uma classe chamada
		OrderedList que armazena os objetos em
		uma lista, que deve ser passada no
		construtor. Implemente métodos
		semelhantes aos definidos na interface List.*/
		
		private ArrayList lista;
		
		public OrderedListQuestao2(ArrayList elementos) {
			lista = elementos;
		}
		
		public void add(Object elemento) {
			lista.add(elemento);
			Collections.sort(lista);
		}
		
		public void remove(Object elemento) {
			lista.remove(elemento);
			Collections.sort(lista);
		}
		
		public void removeByIndex(int index) {
			lista.remove(index);
			Collections.sort(lista);
		}
		
		

}
