package Exnivel1;

import javax.swing.JOptionPane;

/**
 * Calculadora java
 *desenvolvida por Victor Sampaio Palharin
 * <p>
 * 
 */

public class Ex20 {
	public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "Simular calculadora simples (+ - * /).", "Ex20", JOptionPane.INFORMATION_MESSAGE, null);
		
		StringBuilder sb = new StringBuilder("Selecione sua opção:\n\n");
		
		sb
		.append("1 - Adição")
		.append("\n2 - Subtração")
		.append("\n3 - Multiplicação")
		.append("\n4 - Divisão")
		.append("\n\n5 - Sair");
		
		
		sb.toString();
		
		String input = JOptionPane.showInputDialog(null, sb, null, JOptionPane.INFORMATION_MESSAGE);
		 if (input.equals("1")) {
			 
			 String inputnumero1 = JOptionPane.showInputDialog(null, "Digite o 1º número: ", "1º número", JOptionPane.PLAIN_MESSAGE);
			 String inputnumero2 = JOptionPane.showInputDialog(null, "Digite o 2º número: ", "2º número", JOptionPane.PLAIN_MESSAGE);
			 Double numero1 = Double.parseDouble(inputnumero1);
			 Double numero2 = Double.parseDouble(inputnumero2);
			 Double resultado = numero1 + numero2;
			 JOptionPane.showMessageDialog(null, "O resultado dessa adição é: "+ resultado, "Resultado Final: ", JOptionPane.PLAIN_MESSAGE, null);
			 
		 } else if (input.equals("2")) {
			 
			 String inputnumero1 = JOptionPane.showInputDialog(null, "Digite o 1º número: ", "1º número", JOptionPane.PLAIN_MESSAGE);
			 String inputnumero2 = JOptionPane.showInputDialog(null, "Digite o 2º número: ", "2º número", JOptionPane.PLAIN_MESSAGE);
			 Double numero1 = Double.parseDouble(inputnumero1);
			 Double numero2 = Double.parseDouble(inputnumero2);
			 Double resultado = numero1 - numero2;
			 JOptionPane.showMessageDialog(null, "O resultado dessa subtração é: "+ resultado, "Resultado Final: ", JOptionPane.PLAIN_MESSAGE, null);
			 
		 } else if (input.equals("3")) {
			 
			 String inputnumero1 = JOptionPane.showInputDialog(null, "Digite o 1º número: ", "1º número", JOptionPane.PLAIN_MESSAGE);
			 String inputnumero2 = JOptionPane.showInputDialog(null, "Digite o 2º número: ", "2º número", JOptionPane.PLAIN_MESSAGE);
			 Double numero1 = Double.parseDouble(inputnumero1);
			 Double numero2 = Double.parseDouble(inputnumero2);
			 Double resultado = numero1 * numero2;
			 JOptionPane.showMessageDialog(null, "O resultado dessa multiplicação é: "+ resultado, "Resultado Final: ", JOptionPane.PLAIN_MESSAGE, null);
			 
		 } else if (input.equals("4")) {
			 String inputnumero1 = JOptionPane.showInputDialog(null, "Digite o 1º número: ", "1º número", JOptionPane.PLAIN_MESSAGE);
			 String inputnumero2 = JOptionPane.showInputDialog(null, "Digite o 2º número: ", "2º número", JOptionPane.PLAIN_MESSAGE);
			 Double numero1 = Double.parseDouble(inputnumero1);
			 Double numero2 = Double.parseDouble(inputnumero2);
			 if (numero1 == 0.0 || numero2 == 0.0) {
				JOptionPane.showMessageDialog(null, "0 foi digitado, não terá como proseguir digite outro número que não seja 0");
			 } else {
				 
				 Double resultado = numero1 / numero2;
				 JOptionPane.showMessageDialog(null, "O resultado dessa Divisão é: "+ resultado, "Resultado Final: ", JOptionPane.PLAIN_MESSAGE, null);
			 }
			 
		 } else if (input.equals("5")) {
			JOptionPane.showMessageDialog(null, "Saindo...", "5-Sair", JOptionPane.PLAIN_MESSAGE, null);
			
			}
			
		 }
		 	
		 }
		 