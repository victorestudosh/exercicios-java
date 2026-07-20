package Exnivel2;

import java.util.Arrays;

public class Ex29 {
	public static void main(String[] args) {
		int[][] matrizA = { { 1, 2 }, { 3, 4 } };

		int[][] matrizB = { { 5, 6 }, { 7, 8 } };

		int[][] matrizC = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 2; k++) {
					matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
				}
			}
		}
		System.out.println("Resultado:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(matrizC[i][j] + " ");
			}
			System.out.println();
		}
	}
}
