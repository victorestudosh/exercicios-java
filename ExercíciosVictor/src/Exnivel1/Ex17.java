package Exnivel1;

import javax.swing.JOptionPane;

public class Ex17 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Verificar Palíndromo", "Ex17", JOptionPane.INFORMATION_MESSAGE, null);
		String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
		if (palavra == null || palavra.trim().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nenhuma palavra foi digitada.");
			return;
		}
		String limpa = palavra.replaceAll("\\s+", "").toLowerCase();
		String invertida = new StringBuilder(limpa).reverse().toString();
		if (limpa.equals(invertida)) {
			JOptionPane.showMessageDialog(null, "A palavra " + invertida + " É um palíndromo!");
		} else {
			JOptionPane.showMessageDialog(null, "A palavra " + palavra + " NÃO é um palíndromo.");
		}

	}
}
