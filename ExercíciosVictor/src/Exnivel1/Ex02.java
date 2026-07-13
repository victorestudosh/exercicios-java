package Exnivel1;

import javax.swing.JOptionPane;

public class Ex02 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Ler nome e imprimir saudação.", "Ex02", JOptionPane.INFORMATION_MESSAGE,null);
		String nome = JOptionPane.showInputDialog(null, "Digite Seu Nome", "Digitar Nome", JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Seja bem-vindo(a) " + nome, "Saudações", JOptionPane.PLAIN_MESSAGE, null);
	}
}
