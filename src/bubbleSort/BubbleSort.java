package bubbleSort;

import java.util.Arrays;

public class BubbleSort {
	public static int[] ordenar(int[] array) {
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] < array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
			System.out.println("Iteracao " + (i + 1) + " \n Resultado: " + Arrays.toString(array));
		}
		return array;
	}

	public static void main(String[] args) throws java.lang.Exception {

		int[] array = { 3, 5, 7, 9, 1, 8 };
		int[] arrayOrdenado = ordenar(array);

		//String arrayOrdenadoString = Arrays.toString(arrayOrdenado);

		//System.out.println(arrayOrdenadoString);
	}
}
