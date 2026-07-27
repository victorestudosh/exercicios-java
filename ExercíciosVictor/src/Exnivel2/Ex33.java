package Exnivel2;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.Font;
import java.util.Random;

public class Ex33 {
	public static void main(String[] args) {
		Random aleatorio = new Random();
		StringBuilder dadoL = new StringBuilder();
		int[] frequencia = new int[7];
		
		dadoL.append("HISTÓRICO DOS 100 LANÇAMENTOS \n\n");
		
		for (int i = 1; i <= 100; i++) {
			int resultado = aleatorio.nextInt(6) + 1;
			frequencia[resultado]++;
			dadoL.append(String.format("Lançamento%3d: Dado: %d\n", i, resultado));
		}
		
		StringBuilder resumoFinal = new StringBuilder();
		resumoFinal.append("\n ESTATÍSTICAS FINAIS \n");
		for (int i = 1; i <= 6; i++) {
			resumoFinal.append("Dado ").append(i).append(": ").append(frequencia[i]).append(" vezes\n");
		}
		
		String textoCompleto = dadoL.toString() + resumoFinal.toString();

		JTextArea textArea = new JTextArea(textoCompleto);
		textArea.setEditable(false); 
		textArea.setFont(new Font("Yellowtail", Font.ITALIC, 14));

		JScrollPane scrollPane = new JScrollPane(textArea);

		JFrame frame = new JFrame("Resultados dos Lançamentos");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(scrollPane);
		frame.setSize(350, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
