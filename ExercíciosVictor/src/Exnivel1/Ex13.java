package Exnivel1;

import javax.swing.JOptionPane;

public class Ex13 {
	public static void main(String[] args) {
		int resultado = 1;
		JOptionPane.showMessageDialog(null, "Fatorial", "Ex13", JOptionPane.INFORMATION_MESSAGE, null);
		String numero = JOptionPane.showInputDialog(null, "Digite o número do Fatorial", "", JOptionPane.PLAIN_MESSAGE);
		
		Integer numero1 = Integer.parseInt(numero);
		
		for (int i = 1; i <= numero1; i++) {
            resultado *= i;
        }

		
		JOptionPane.showMessageDialog(null, "O valor do fatorial é = " + resultado, "Valor do Fatorial", JOptionPane.PLAIN_MESSAGE, null);
	}
}
