package Exnivel1;

import javax.swing.JOptionPane;

public class Ex03 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Somar dois números.", "Ex03", JOptionPane.INFORMATION_MESSAGE, null);
		String numero1 = JOptionPane.showInputDialog(null, "Digite o 1º número", "Digitar 1º Número", JOptionPane.PLAIN_MESSAGE);
		String numero2 = JOptionPane.showInputDialog(null, "Digite o 2º número", "Digitar 2º Número", JOptionPane.PLAIN_MESSAGE);
		
		Integer numero3 = Integer.parseInt(numero1);
		Integer numero4 = Integer.parseInt(numero2);
		
		int resultado = numero3 + numero4;
		
		JOptionPane.showMessageDialog(null, "A soma entre " + numero3 + " e " + numero4 + " é = " + resultado, "Resultado", JOptionPane.PLAIN_MESSAGE, null);
	}
}
