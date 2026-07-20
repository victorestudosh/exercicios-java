package Exnivel2;

import java.util.Arrays;
import java.util.Iterator;

public class Ex28 {
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7};
			rotacionar(array, 2);
			System.out.println(Arrays.toString(array));
	}

	private static void rotacionar(int[] array, int k) {
		while(k > 0) {
			deslocarDireita(array);
			k--;
		}
	}

	private static void deslocarDireita(int[] array) {
 		int n = array.length;
 		int auxiliar = array[n - 1];
 		
 		for (int i = n - 1; i > 0 ; i--) {
			array[i] = array[i - 1];	
		}
 		array[0] = auxiliar;
	}
}
