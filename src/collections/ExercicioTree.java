package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;



public class ExercicioTree {
	
	public static void main(String[] args) {
		
		TreeSet<Object> treeSet = new TreeSet<Object>();
		
		for (int i = 0; i <= 1000; i++) {
			treeSet.add(i);
		}
		TreeSet<Object> res = (TreeSet<Object>)treeSet.descendingSet();
		System.out.println(res);
		
		ArrayList<Integer> numeros2 = new ArrayList<Integer>();
		
		for (int i = 0; i <= 1000; i++) {
			numeros2.add(i);
		}
		Collections.reverse(numeros2);
		System.out.println(numeros2);
		
	}

}
