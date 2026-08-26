package Exnivel3;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex50 {
	public static List<Integer> listPrimo(int numero) {
		List<Integer> primos = new ArrayList<>();

		if (numero < 2) {
			return primos;
		}
		if (numero > 100000000) {
			throw new IllegalArgumentException("O valor de N é muito grande para esta abordagem.");
		}
		boolean[] primo = new boolean[numero + 1];
		for (int i = 2; i < numero; i++) {
			primo[i] = true;
		}
		for (int p = 2; p * p <= numero; p++) {
			if (primo[p]) {
				for (int i = p * p; i <= numero; i += p) {
					primo[i] = false;
				}
			}
		}

		for (int i = 2; i <= numero; i++) {
			if (primo[i]) {
				primos.add(i);
			}
		}
		return primos;
	}

	public static void main(String[] args) {
		int numero = 100;
		JOptionPane.showMessageDialog(null, "Criar método que retorna lista de primos até N.", "Ex50", JOptionPane.INFORMATION_MESSAGE, null);
		JOptionPane.showMessageDialog(null, "Primos até " + numero + ": " + listPrimo(numero), null, JOptionPane.PLAIN_MESSAGE, null);
	}
}