package Exnivel2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ex36 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Converter binário para decimal", "Ex36", JOptionPane.INFORMATION_MESSAGE, null);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um valor binário: ");
		String inputBinario = sc.next();
		
		char[] valoresFormatoChar = inputBinario.toCharArray();
		
		List<Integer> valoresFormatoInt = new ArrayList<>();
		
		List<Double> resultadosPotencia = new ArrayList<>();
		
		Double valorDecimal = 0.0;
		
		for (int i = 0; i <= valoresFormatoChar.length - 1; i++) {
			
			char valorChar = valoresFormatoChar[i];
			
			String valorString = "";
			
			valorString += valorChar;
			
			Integer valorFormatado = Integer.parseInt(valorString);
			
			valoresFormatoInt.add(valorFormatado);
		}
		
		Collections.reverse(valoresFormatoInt);
		
		int expoente = 0;
		
		for (int i = 0; i <= valoresFormatoInt.size() - 1; i++) {
			
			Double resultado = valoresFormatoInt.get(i) * (Math.pow(2, expoente));
			
			resultadosPotencia.add(resultado);
			
			expoente++;
		}
		
		for (int i = 0; i <= resultadosPotencia.size() - 1; i++) {
			
			valorDecimal += resultadosPotencia.get(i);
			
		}
		
		System.out.println(valorDecimal);
		
		sc.close();
	}
}
