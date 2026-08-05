package Exnivel3;

import javax.swing.JOptionPane;

public class Ex41 {
		
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Refatorar calculadora usando métodos", "Ex41", JOptionPane.INFORMATION_MESSAGE, null);
		StringBuilder sb = new StringBuilder("Selecione o tipo de operação");
		
		sb
		.append("\n1 - Adição\n")
		.append("2 - Subtração")
		.append("\n3 - Multiplicação")
		.append("\n4 - Divisão")
		.append("\n\n5 - Sair");
		
		String opcao = JOptionPane.showInputDialog(null, sb.toString(), "Ex41", JOptionPane.PLAIN_MESSAGE);
		
		if (opcao != null) {
			if (opcao.equals("1")) chamarSoma();
			if (opcao.equals("2")) chamarSubtracao();
			if (opcao.equals("3")) chamarMultiplicacao();
			if (opcao.equals("4")) chamarDivisao();
		}
	}
		public static void chamarSoma() {
			long numero1 = 0;
			long numero2 = 0;
			soma(numero1, numero2);
		}
		public static void chamarSubtracao() {
			long numero1 = 0;
			long numero2 = 0;
			subtracao(numero1, numero2);
		}
		public static void chamarMultiplicacao() {
			long numero1 = 0;
			long numero2 = 0;
			multiplicacao(numero1, numero2);
		}
		public static void chamarDivisao() {
			float numero1 = 0;
			float numero2 = 0;
			divisao(numero1, numero2);
		}
		public static void soma(long numero1, long numero2) {
			String inputNumero1 = JOptionPane.showInputDialog(null, "Digite o Primeiro número da Adição:", null, JOptionPane.INFORMATION_MESSAGE);
			numero1 = Integer.parseInt(inputNumero1);
			String inputNumero2 = JOptionPane.showInputDialog(null, "Digite o Segundo número da Adição:", null, JOptionPane.INFORMATION_MESSAGE);
			numero2 = Integer.parseInt(inputNumero2);
			JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 + numero2), "", JOptionPane.INFORMATION_MESSAGE, null);
		}
		public static void subtracao(long numero1, long numero2) {
			String inputNumero1 = JOptionPane.showInputDialog(null, "Digite o Primeiro número da Subtração:", null, JOptionPane.INFORMATION_MESSAGE);
			numero1 = Integer.parseInt(inputNumero1);
			String inputNumero2 = JOptionPane.showInputDialog(null, "Digite o Segundo número da Subtração:", null, JOptionPane.INFORMATION_MESSAGE);
			numero2 = Integer.parseInt(inputNumero2);
			JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 - numero2), "", JOptionPane.INFORMATION_MESSAGE, null);
		}
		public static void multiplicacao(long numero1, long numero2) {
			String multi1 = JOptionPane.showInputDialog(null, "Digite o Primeiro número da Multiplicação:", null, JOptionPane.INFORMATION_MESSAGE);
			numero1 = Integer.parseInt(multi1);
			String multi2 = JOptionPane.showInputDialog(null, "Digite o Segundo número da Multiplicação:", null, JOptionPane.INFORMATION_MESSAGE);
			numero2 = Integer.parseInt(multi2);
			JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 * numero2), "", JOptionPane.INFORMATION_MESSAGE, null);
		}
		public static void divisao(float numero1, float numero2) {
			String divisao1 = JOptionPane.showInputDialog(null, "Digite o Primeiro número da Divisão:", null, JOptionPane.INFORMATION_MESSAGE);
			numero1 = Integer.parseInt(divisao1);
			String divisao2 = JOptionPane.showInputDialog(null, "Digite o Segundo número da Divisão:", null, JOptionPane.INFORMATION_MESSAGE);
			numero2 = Integer.parseInt(divisao2);
			if (numero1 == 0 || numero2 == 0) {
				JOptionPane.showMessageDialog(null, "Não é possível dividir por 0!", null, JOptionPane.WARNING_MESSAGE, null);
			} else {
				JOptionPane.showMessageDialog(null, "Resultado: " + (numero1 / numero2), null, JOptionPane.INFORMATION_MESSAGE, null);
				
			}
		}
	}