package Exnivel1;

import javax.swing.JOptionPane;

public class Ex12 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Soma de 1 até N", "Ex12", JOptionPane.INFORMATION_MESSAGE, null);
		String numero = JOptionPane.showInputDialog(null, "Digite um número", "", JOptionPane.PLAIN_MESSAGE);
		
		Integer numero1 = Integer.parseInt(numero);
		
		int resultado = (numero1 * (numero1 + 1)) / 2;
		
		JOptionPane.showMessageDialog(null, "A soma é = " + resultado, "", JOptionPane.PLAIN_MESSAGE, null);
		
	}
}