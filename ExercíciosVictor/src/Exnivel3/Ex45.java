package Exnivel3;

import javax.swing.JOptionPane;

public class Ex45 {
		public static Integer pesquisar(int[] array, int alvo) {
			int inicio = 0;
			int fim = array.length - 1;

			while (inicio <= fim) {
				int meio = inicio + (fim - inicio) / 2;

				if (array[meio] == alvo) {
					return meio;
				}
				if (array[meio] < alvo) {
					inicio = meio + 1;
				} else {
					fim = meio - 1;
				}
			}
			return null;
		}

		public static void main(String[] args) {
			int[] numeros = new int[100];
			
			
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = i;
			}
			
			int alvo = 23;
			int resultado = pesquisar(numeros, alvo);
			JOptionPane.showMessageDialog(null, "Índice: " + resultado, "", JOptionPane.INFORMATION_MESSAGE, null);
		}
	}