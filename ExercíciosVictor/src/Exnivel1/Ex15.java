package Exnivel1;

import javax.swing.JOptionPane;

public class Ex15 {
    public static void main(String[] args) {
    	JOptionPane.showMessageDialog(null, "Contar vogais em uma string", "Ex15", JOptionPane.INFORMATION_MESSAGE, null);
        String palavra = JOptionPane.showInputDialog(null, "Digite uma palavra:", "Contador de Vogais", JOptionPane.INFORMATION_MESSAGE);

        if (palavra == null || palavra.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhuma palavra foi digitada.");
            return;
        }

        String vogaisDefinicao = "aeiouAEIOU";
        int totalVogais = 0;
        
        StringBuilder vogaisEncontradas = new StringBuilder();

        for (int i = 0; i < palavra.length(); i++) {
            char caractereAtual = palavra.charAt(i);
            
            if (vogaisDefinicao.indexOf(caractereAtual) != -1) {
                totalVogais++;
                vogaisEncontradas.append(caractereAtual).append(" ");
            }
        }

        StringBuilder resultadoFinal = new StringBuilder();
        resultadoFinal.append("Palavra digitada: ").append(palavra).append("\n");
        resultadoFinal.append("Total de vogais: ").append(totalVogais).append("\n");
        
        if (totalVogais > 0) {
            resultadoFinal.append("Vogais encontradas: ").append(vogaisEncontradas.toString().trim());
        } else {
            resultadoFinal.append("Nenhuma vogal encontrada.");
        }

        JOptionPane.showMessageDialog(null, resultadoFinal.toString(), "Resultado do Cálculo", JOptionPane.INFORMATION_MESSAGE);
    }
}
