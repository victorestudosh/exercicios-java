package Exnivel1;

import javax.swing.JOptionPane;

public class Ex08 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Verificar maior entre três números.", "Ex08", JOptionPane.INFORMATION_MESSAGE, null);
		
		String numero1 = JOptionPane.showInputDialog(null, "Digite o 1º número", "1º Número", JOptionPane.PLAIN_MESSAGE);
		String numero2 = JOptionPane.showInputDialog(null, "Digite o 2º número", "2º Número", JOptionPane.PLAIN_MESSAGE);
		String numero3 = JOptionPane.showInputDialog(null, "Digite o 3º número", "3º Número", JOptionPane.PLAIN_MESSAGE);
		
		Integer numero4 = Integer.parseInt(numero1);
		Integer numero5 = Integer.parseInt(numero2);
		Integer numero6 = Integer.parseInt(numero3);
		
		if (numero4 >= numero5 && numero4 >= numero6) {
			JOptionPane.showMessageDialog(null, "O Primeiro Número é Maior Ele é: " + numero4, "1º Número Maior 🥳", JOptionPane.INFORMATION_MESSAGE, null);
		} else if (numero5 >= numero4 && numero5 >= numero6) {
			JOptionPane.showMessageDialog(null, "O Segundo Número é Maior Ele é: " + numero5, "2º Número Maior 🥳", JOptionPane.INFORMATION_MESSAGE, null);
		} else {
			JOptionPane.showMessageDialog(null, "O Terceiro Número E Maior Ele é: "+ numero6, "3º Número Maior 🥳", JOptionPane.INFORMATION_MESSAGE, null);
		}
	}
}
