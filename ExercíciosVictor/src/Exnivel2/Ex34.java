package Exnivel2;

import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;

public class Ex34 {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Digite algo", "", JOptionPane.QUESTION_MESSAGE);

        if (texto == null || texto.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum texto foi digitado. Programa encerrado.");
            return;
        }

        Map<Character, Integer> frequencia = new HashMap<>();
        for (char c : texto.toCharArray()) {
            frequencia.put(c, frequencia.getOrDefault(c, 0) + 1);
        }

        StringBuilder resultado = new StringBuilder("Frequência dos caracteres:\n\n");
        for (Map.Entry<Character, Integer> entrada : frequencia.entrySet()) {
            if (entrada.getKey() == ' ') {
                resultado.append("[Espaço]: ").append(entrada.getValue()).append(" vez(es)\n");
            } else {
                resultado.append("'").append(entrada.getKey()).append("': ").append(entrada.getValue()).append(" vez(es)\n");
            }
        }

        JOptionPane.showMessageDialog(null,resultado.toString(), "Resultado da Contagem", JOptionPane.INFORMATION_MESSAGE
        );
    }
}
