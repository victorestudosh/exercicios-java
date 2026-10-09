package Exnivel4;

import javax.swing.JOptionPane;

public class Ex72 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Implementar tratamento de abordagens", "Ex72", JOptionPane.INFORMATION_MESSAGE, null);
		try {
			String numeros = JOptionPane.showInputDialog(null, "Digite números: ", "", JOptionPane.PLAIN_MESSAGE);
			
			Integer input = Integer.parseInt(numeros);
			JOptionPane.showMessageDialog(null, "O número Digitado foi: " + input, "", JOptionPane.INFORMATION_MESSAGE, null); 
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Não é possível converter essa String, Por que ela aceita somente números ", "Aviso Do Parser", JOptionPane.WARNING_MESSAGE, null);
		}
	}
}