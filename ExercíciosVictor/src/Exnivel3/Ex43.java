package Exnivel3;

import javax.swing.JOptionPane;

public class Ex43 {
	    public static long calcularFatorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        }
	        return n * calcularFatorial(n - 1);
	    }

	    public static void main(String[] args) {
	    	JOptionPane.showMessageDialog(null, "Criar método recursivo para Fatorial", "Ex43", JOptionPane.INFORMATION_MESSAGE, null);
	        int numero = 5;
	        JOptionPane.showMessageDialog(null, "Fatorial de " + numero + " é: " + calcularFatorial(numero), "", JOptionPane.PLAIN_MESSAGE, null);
	    }
	}