package Exnivel2;

import javax.swing.JOptionPane;

public class Ex22 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Ler 10 números e mostrar média", "Ex22", JOptionPane.INFORMATION_MESSAGE, null);
		double[] array = new double[10];
		double soma = 0;
		for (int i = 0; i < 10; i++) {
			String input = JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número:");
			try {
				array[i] = Double.parseDouble(input);
				soma += array[i];
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Valor inválido! Por favor, digite um número.");
				i--;
			}
		}
		double media = soma / array.length;
		JOptionPane.showMessageDialog(null, "A média dos números digitados é: " + media);
	}
}