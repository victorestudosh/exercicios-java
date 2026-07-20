package Exnivel2;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ex25 {
    public static void main(String[] args) {
    	Random aleatorio = new Random();
    	int[] array = new int[10];
    	
    	for (int i = 0; i < array.length; i++) {
			array[i] = aleatorio.nextInt(11);
		}
    	
        String input = JOptionPane.showInputDialog(null, "Digite o número que você quer buscar:");
        if (input != null && !input.isEmpty()) {
            int numeroBuscado = Integer.parseInt(input);
            boolean encontrado = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == numeroBuscado) {
                    JOptionPane.showMessageDialog(null, "Número encontrado na posição: " + i);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "Número não encontrado no array.");
            }
        }
    }
}
