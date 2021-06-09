package selectionSort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {

		int[] array = new int[] { 18, 10, 15, 3, 5 };
		int ordenados = 0;

		for (int j = 0; j < array.length; j++) {
			int indexMaior = 0;

			for (int i = 1; i < array.length - ordenados; i++) {
				if (array[i] > array[indexMaior]) {
					indexMaior = i;
				}
			}
			// trocar
			int temp = array[array.length - 1 - ordenados]; // guardou a temporária 15
			array[array.length - 1 - ordenados] = array[indexMaior]; // ajustou a última
			array[indexMaior] = temp; // ajustou a primeira posição

			ordenados++;
			System.out.println(Arrays.toString(array));
		}
	}
}
