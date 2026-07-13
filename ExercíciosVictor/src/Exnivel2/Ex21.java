package Exnivel2;

import javax.swing.JOptionPane;

public class Ex21 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Ler 10 números e mostrar maior.", "Ex21", JOptionPane.INFORMATION_MESSAGE, null);
		int maior = 0;
		for (int i = 1; i <= 10; i++) {
			String input = JOptionPane.showInputDialog("Digite o " + i + "º número:");
			if (input != null) {
				try {
					int numero = Integer.parseInt(input);
					if (i == 1) {
						maior = numero;
					} else if (numero > maior) {
						maior = numero;
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Por favor, digite um número válido!");
					i--;
				}
			} else {
				break;
			}
		}
		JOptionPane.showMessageDialog(null, "O maior número digitado foi: " + maior);
	}
}