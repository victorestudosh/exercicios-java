package Exnivel2;

import javax.swing.JOptionPane;

public class Ex24 {
    public static void main(String[] args) {
    	JOptionPane.showMessageDialog(null, "Ordenar array (Bubble Sort manual)", "Ex24", JOptionPane.INFORMATION_MESSAGE, null);
        String inputTamanho = JOptionPane.showInputDialog("Digite o tamanho do array:");
        int tamanho = Integer.parseInt(inputTamanho);
        int[] numeros = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            String inputValor = JOptionPane.showInputDialog("Digite o valor para a posição " + i + ":");
            numeros[i] = Integer.parseInt(inputValor);
        }
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }
        StringBuilder resultado = new StringBuilder("Array Ordenado:\n");
        for (int num : numeros) {
            resultado.append(num).append("");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}