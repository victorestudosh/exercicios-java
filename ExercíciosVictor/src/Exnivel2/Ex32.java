package Exnivel2;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ex32 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		JOptionPane.showMessageDialog(null, "Gerar número Aleatório", "Ex32", JOptionPane.INFORMATION_MESSAGE, null);
		
		JOptionPane.showMessageDialog(null, "(" + aleatorio.nextInt(11) + "), esse número foi gerado aleatóriamente com a Classe Random", "Classe Random", JOptionPane.INFORMATION_MESSAGE, null);
	} 
}
