package Exnivel3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex53 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Crie um analisador simples de expressão matemática.", "Ex53", JOptionPane.INFORMATION_MESSAGE, null);
		String expressao = JOptionPane.showInputDialog(null, "Digite a Expressão Matemática", "", JOptionPane.PLAIN_MESSAGE);

		if (expressao != null && !expressao.trim().isEmpty()) {
			
			String[] valoresExpressao = expressao.split(" ");
			
			Double resultadoExpressao = calcularExpressao(valoresExpressao);
			
			JOptionPane.showMessageDialog(null, "O Resultado Da Expressão Matemática é: " + resultadoExpressao, "Resultado Expressão Matemática", JOptionPane.PLAIN_MESSAGE, null);
		}
	}

	public static Double calcularExpressao(String[] arrayExpressao) {
	    if (arrayExpressao == null || arrayExpressao.length == 0) {
	        return 0.0;
	    }

	    List<String> lista = new ArrayList<>(Arrays.asList(arrayExpressao));

	    for (int i = 1; i < lista.size(); i += 2) {
	        String operador = lista.get(i);
	        
	        if (operador.equals("*") || operador.equals("/")) {
	            Double valorAnterior = Double.parseDouble(lista.get(i - 1));
	            Double proximoValor = Double.parseDouble(lista.get(i + 1));
	            Double resultadoParcial = 0.0;
	            
	            if (operador.equals("*")) {
	                resultadoParcial = valorAnterior * proximoValor;
	            } else if (operador.equals("/")) {
	                resultadoParcial = valorAnterior / proximoValor;
	            }
	            
	            lista.set(i - 1, String.valueOf(resultadoParcial));
	            lista.remove(i);
	            lista.remove(i);
	            
	            i -= 2;
	        }
	    }

	    Double valorTotal = Double.parseDouble(lista.get(0));
	    for (int i = 1; i < lista.size(); i += 2) {
	        String operador = lista.get(i);
	        Double proximoValor = Double.parseDouble(lista.get(i + 1));

	        if (operador.equals("-")) {
	            valorTotal -= proximoValor;
	        } else if (operador.equals("+")) {
	            valorTotal += proximoValor;
	        }
	    }

	    return valorTotal;
	}
 }