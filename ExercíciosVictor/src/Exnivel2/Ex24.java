package Exnivel2;

import javax.swing.JOptionPane;

public class Ex24 {
    public static void main(String[] args) {
    	JOptionPane.showMessageDialog(null, "Ordenar array (Bubble Sort manual)", "Ex24", JOptionPane.INFORMATION_MESSAGE, null);
        String inputTamanho = JOptionPane.showInputDialog("Digite o tamanho do array:");
        int tamanho = Integer.parseInt(inputTamanho);
        int[] array = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            String inputValor = JOptionPane.showInputDialog("Digite o valor para a posição " + i + ":");
            array[i] = Integer.parseInt(inputValor);
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        StringBuilder resultado = new StringBuilder("Array Ordenado:\n");
        for (int num : array) {
            resultado.append(num).append("");
        }
        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}