package Exnivel1;

import javax.swing.JOptionPane;

public class Ex04 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Calcular média de 3 números.", "Ex04", JOptionPane.INFORMATION_MESSAGE, null);
		String numero1 = JOptionPane.showInputDialog(null, "Digite o 1º Número", "1º Número", JOptionPane.PLAIN_MESSAGE);
		String numero2 = JOptionPane.showInputDialog(null, "Digite o 2º Número", "2º Número", JOptionPane.PLAIN_MESSAGE);
		String numero3 = JOptionPane.showInputDialog(null, "Digite o 3º Número", "3º Número", JOptionPane.PLAIN_MESSAGE);
		
		Integer media1 = Integer.parseInt(numero1);
		Integer media2 = Integer.parseInt(numero2);
		Integer media3 = Integer.parseInt(numero3);
		
		int resultado = (media1 + media2 + media3) / 3;
		
		JOptionPane.showMessageDialog(null, "A média = " + resultado, "Média", JOptionPane.PLAIN_MESSAGE, null);
 	}
}
