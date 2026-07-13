package Exnivel1;

import javax.swing.JOptionPane;

public class Ex11 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Tabuada de um número", "Ex11", JOptionPane.INFORMATION_MESSAGE, null);
		String numero = JOptionPane.showInputDialog(null, "Digite um número Da Tabuada", "Tabuada", JOptionPane.PLAIN_MESSAGE);

		Integer numero1 = Integer.parseInt(numero);

		StringBuilder resultado1 = new StringBuilder();

		for (int i = 1; i < 11; i++) {
			int resultado = numero1 * i;
			resultado1.append(numero1 + " x " + i + "= ").append(resultado).append("\n");
		}
		JOptionPane.showMessageDialog(null, resultado1.toString());
	}
}
