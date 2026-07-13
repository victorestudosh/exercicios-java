package Exnivel1;

import javax.swing.JOptionPane;

public class Ex07 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Verificar maior entre dois números.", "Ex07", JOptionPane.INFORMATION_MESSAGE, null);
		String numero = JOptionPane.showInputDialog(null, "Digite o primeiro número", "", JOptionPane.INFORMATION_MESSAGE);
		String numero1 = JOptionPane.showInputDialog(null, "Digite o segundo número", "", JOptionPane.INFORMATION_MESSAGE);
		
		Integer numero2 = Integer.parseInt(numero);
		Integer numero3 = Integer.parseInt(numero1);
		
		if (numero2 > numero3 ) {
			JOptionPane.showMessageDialog(null, "O Primeiro é Maior: " + numero2, "1º é Maior", JOptionPane.INFORMATION_MESSAGE, null);
		} else {
			JOptionPane.showMessageDialog(null, "O Segundo é Maior: " + numero3, "2º é Maior", JOptionPane.INFORMATION_MESSAGE, null);
		}
	}
}
