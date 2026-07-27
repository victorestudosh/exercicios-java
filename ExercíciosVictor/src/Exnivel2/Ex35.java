package Exnivel2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex35 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Converter decimal para binário", "Ex35", JOptionPane.INFORMATION_MESSAGE, null);
		String inputDecimal = JOptionPane.showInputDialog(null, "Digite um número para a conversão", "Input Decimal", JOptionPane.PLAIN_MESSAGE);
		
		Integer decimal = Integer.parseInt(inputDecimal);
		
		ArrayList<Integer> restos = new ArrayList<>();
		
		while (decimal >= 2) {
			
			Integer valorDivisao = decimal / 2;
			
			Integer restoDivisao = decimal % 2;
			
			restos.add(restoDivisao);
			
			if (valorDivisao < 2) {
				restos.add(valorDivisao);
			}
			
			decimal = valorDivisao;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (Integer i = restos.size() - 1; i >= 0; i--) {
			sb.append(restos.get(i));
		}
		
		JOptionPane.showMessageDialog(null, sb.toString(), "Resultado da conversão", JOptionPane.PLAIN_MESSAGE);
	}
}