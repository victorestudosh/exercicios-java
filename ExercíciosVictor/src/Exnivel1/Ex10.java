package Exnivel1;

import javax.swing.JOptionPane;

public class Ex10 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Verificar se número é positivo, negativo ou zero", "Ex10", JOptionPane.INFORMATION_MESSAGE, null);
		String numero = JOptionPane.showInputDialog(null, "Digite um número", "", JOptionPane.PLAIN_MESSAGE);
		
		Integer numero1 = Integer.parseInt(numero);
		
		if (numero1 > 0) {
			JOptionPane.showMessageDialog(null, "O número é Positivo", "", JOptionPane.INFORMATION_MESSAGE, null);
		} else if (numero1 < 0) {
			JOptionPane.showMessageDialog(null, "O número é Negativo", "", JOptionPane.INFORMATION_MESSAGE, null);
		} else {
			JOptionPane.showMessageDialog(null, "O número é Zero", "", JOptionPane.INFORMATION_MESSAGE, null);
		}
	}
}
