package Exnivel1;

import javax.swing.JOptionPane;

public class Ex05 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Converter Celsius para Fahrenheit.", "Ex05", JOptionPane.INFORMATION_MESSAGE, null);
		String celsius = JOptionPane.showInputDialog(null, "Digite a Temperatura", "Celsius", JOptionPane.PLAIN_MESSAGE);
		
		Double celsius1 = Double.parseDouble(celsius);
		
		double fahrenheit = (celsius1 * 1.8) + 32;
		
		JOptionPane.showMessageDialog(null, "O Valor de Celsius para Fahrenheit é: " + fahrenheit, "Conversão Fahrenheit", JOptionPane.INFORMATION_MESSAGE, null);
	}
}
