package Exnivel1;

import javax.swing.JOptionPane;

public class Ex06 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Verificar se número é par ou ímpar.", "Ex06", JOptionPane.INFORMATION_MESSAGE, null);
		String numero = JOptionPane.showInputDialog(null, "Digite um número", "", JOptionPane.PLAIN_MESSAGE);
		
		Integer numero1 = Integer.parseInt(numero);
		
		if (numero1 % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + numero1 + " é par!", "Número Par 😁", JOptionPane.INFORMATION_MESSAGE, null);
		} else {
			JOptionPane.showMessageDialog(null, "O número " + numero1 + " é impar!", "Número Impar ☹️", JOptionPane.INFORMATION_MESSAGE, null);
		}
	}
}