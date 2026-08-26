package Exnivel3;

import javax.swing.JOptionPane;

public class Ex49 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Criar método que retorna o número primo.", "Ex49", JOptionPane.INFORMATION_MESSAGE, null);
		String numero = JOptionPane.showInputDialog(null, "Digite um número", "", JOptionPane.PLAIN_MESSAGE);

		Integer numeroPrimo = Integer.parseInt(numero);

		boolean primoOunao = retornarPrimo(numeroPrimo);

		if (primoOunao) {
			JOptionPane.showMessageDialog(null, "O número " + numeroPrimo + " é Primo", "Número Primo", JOptionPane.INFORMATION_MESSAGE, null);
		} else {
			JOptionPane.showMessageDialog(null, "O número " + numeroPrimo + " não é Primo", "Número não Primo", JOptionPane.INFORMATION_MESSAGE, null);
		}
	}

	public static boolean retornarPrimo(int numero1) {

		if (numero1 <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(numero1); i++) {
			if (numero1 % i == 0) {
				return false;
			}
		}
		return true;
	}
}
