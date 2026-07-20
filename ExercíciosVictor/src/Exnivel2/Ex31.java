package Exnivel2;

import java.util.Random;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Ex31 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		
		ArrayList<Integer> palpitesFeitos = new ArrayList<>();
		
		JOptionPane.showMessageDialog(null, "Jogo de Adivinhação", "Ex31", JOptionPane.INFORMATION_MESSAGE, null);

		while (true) {
			Integer valorAleatorio = aleatorio.nextInt(10) + 1; 
			
			String palpite = JOptionPane.showInputDialog(null, "Digite o Seu Palpite (1 à 10)", "Paltite", JOptionPane.PLAIN_MESSAGE);
			
			Integer numeroDigitado = Integer.parseInt(palpite);
			
			if (numeroDigitado.equals(valorAleatorio)) {
				
				JOptionPane.showMessageDialog(null, "Parabéns, você acertou!", "", JOptionPane.INFORMATION_MESSAGE, null);
				
				StringBuilder valoresNaList = new StringBuilder();
				
				for (Integer p: palpitesFeitos) {
					
					valoresNaList.append(p + ",\n");
					
				}
				
				JOptionPane.showMessageDialog(null, "Palpites feitos:\n" + valoresNaList.toString(), "", JOptionPane.PLAIN_MESSAGE, null);
				
				break;
				
			} else {
				
				palpitesFeitos.add(numeroDigitado);
				
				JOptionPane.showMessageDialog(null, "Você não acertou! Tente novamente!", "Errou!", JOptionPane.WARNING_MESSAGE, null);
				
				continue;
			}
		}
	}
}
