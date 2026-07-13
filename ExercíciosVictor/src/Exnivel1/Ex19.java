package Exnivel1;

import javax.swing.JOptionPane;

public class Ex19 {
    public static void main(String[] args) {
    	JOptionPane.showMessageDialog(null, "Gerar sequência Fibonacci", "Ex19", JOptionPane.INFORMATION_MESSAGE, null);
        String termos = JOptionPane.showInputDialog("Quantos termos da sequência de Fibonacci você quer ver?");
        if (termos == null) {
            System.exit(0);
        }
        try {
            int termos1 = Integer.parseInt(termos);

            if (termos1 <= 0) {
                JOptionPane.showMessageDialog(null, "Por favor, digite um número maior que zero.");
                System.exit(0);
            }
            int primeiro = 0;
            int segundo = 1;
            StringBuilder sequencia = new StringBuilder();
            for (int i = 1; i <= termos1; i++) {
                sequencia.append(primeiro).append(" ");
                int proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
            JOptionPane.showMessageDialog(null, "Sequência de Fibonacci (" + termos1 + " termos):\n" + sequencia.toString());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Erro: Você precisa digitar um número inteiro válido.");
        }
    }
}