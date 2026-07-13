package Exnivel2;

import javax.swing.JOptionPane;

public class Ex23 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int contadorPares = 0;
        StringBuilder numerosDigitados = new StringBuilder("Array: ");
        for (int i = 0; i < numeros.length; i++) {
            String entrada = JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número:");
            numeros[i] = Integer.parseInt(entrada);
            numerosDigitados.append(numeros[i]).append(" ");
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }
        String mensagem = numerosDigitados.toString() + "\nQuantidade de números pares: " + contadorPares;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}