package Exnivel1;

import javax.swing.JOptionPane;

public class Ex18 {
	public static void main(String[] args) {
		int resultado = 1;
		JOptionPane.showMessageDialog(null, "Calcular potência sem usar Math.pow", "Ex18", JOptionPane.INFORMATION_MESSAGE, null);
		String base = JOptionPane.showInputDialog(null, "Digite o Valor da Base", "", JOptionPane.PLAIN_MESSAGE);
		String Expoente = JOptionPane.showInputDialog(null, "Digite o Valor do Expoente", "", JOptionPane.PLAIN_MESSAGE);
		
		Integer base1 = Integer.parseInt(base);
		Integer expoente1 = Integer.parseInt(Expoente);
		
		for (int i = 0; i < expoente1; i++) {
			resultado *= base1;
		}
		JOptionPane.showMessageDialog(null, "O Resultado Da Potênciação é = " + resultado, "Resultado", JOptionPane.PLAIN_MESSAGE, null);
	}
}
