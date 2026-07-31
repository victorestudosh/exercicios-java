package Exnivel2;

import javax.swing.JOptionPane;

public class Ex38 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Verificar Matriz Simétrica", "Ex38", JOptionPane.INFORMATION_MESSAGE, null);
		
		int[][] matrizA = {
				{2, 4},
				{4, 5},
		};
		
		if (isSimetrica(matrizA)) {
			System.out.println("É simétrica!");
		} else {
			System.out.println("Não é simétrica!");
		}
		
	}
	
	public static boolean isSimetrica(int[][] matrizA) {
		
		int linhas = matrizA.length;
		int colunas = matrizA[0].length;
		
		if (linhas != colunas) {
			return false;
		}
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (matrizA[i][j] != matrizA[j][i]) {
					return false;
				}
			}
		}
		
		return true;
	}
}
