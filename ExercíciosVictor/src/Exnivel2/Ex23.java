package Exnivel2;

import javax.swing.JOptionPane;

public class Ex23 {
    public static void main(String[] args) {
    	JOptionPane.showMessageDialog(null, "Contar números pares em um array", "Ex23",  JOptionPane.INFORMATION_MESSAGE, null);
        int[] array = new int[10];
        int contadorPares = 0;
        StringBuilder numerosDigitados = new StringBuilder("Array: ");
        for (int i = 0; i < array.length; i++) {
            String entrada = JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número:");
            array[i] = Integer.parseInt(entrada);
            numerosDigitados.append(array[i]).append(" ");
            if (array[i] % 2 == 0) {
                contadorPares++;
            }
        }
        String mensagem = numerosDigitados.toString() + "\nQuantidade de números pares: " + contadorPares;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}