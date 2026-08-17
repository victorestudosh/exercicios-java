package Exnivel3;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Ex47 {
	public static void ordenarMsort(int[] array, int inicio, int fim) {
		if (inicio >= fim) {
			return;
		}
		int meio = inicio + (fim - inicio) / 2;
		ordenarMsort(array, inicio, meio);
		ordenarMsort(array, meio + 1, fim);
		mesclarMsort(array, inicio, meio, fim);
	}

	private static void mesclarMsort(int[] array, int esquerda, int meio, int direita) {
		int[] auxiliar = Arrays.copyOfRange(array, esquerda, direita + 1);

		int i = 0;
		int auxiliar1 = meio - esquerda;
		int j = auxiliar1 + 1;
		int k = esquerda;

		while (i <= auxiliar1 && j < auxiliar.length) {
			if (auxiliar[i] <= auxiliar[j]) {
				array[k++] = auxiliar[i++];
			} else {
				array[k++] = auxiliar[j++];
			}
		}

		while (i <= auxiliar1) {
			array[k++] = auxiliar[i++];
		}
	}

	public static void main(String[] args) {
		Random aleatorio = new Random();
		int[] array = new int[15];

		for (int i = 0; i < array.length; i++) {
			array[i] = aleatorio.nextInt(100);
		}
		String antes = Arrays.toString(array);

		ordenarMsort(array, 0, array.length - 1);

		String depois = Arrays.toString(array);

		JOptionPane.showMessageDialog(null, "Implementar MergeSort", "Ex47", JOptionPane.INFORMATION_MESSAGE, null);

		JOptionPane.showMessageDialog(null, "Antes: " + antes, "Sem MergeSort ", JOptionPane.PLAIN_MESSAGE, null);
		JOptionPane.showMessageDialog(null, "Depois: " + depois, "Com MergeSort ", JOptionPane.PLAIN_MESSAGE, null);
	}
}
