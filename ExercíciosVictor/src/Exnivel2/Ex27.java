package Exnivel2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.JOptionPane;

public class Ex27 {
    public static void main(String[] args) {
        String[] nomesArray = {"Ana", "Bruno", "Carlos", "Ana", "Diana", "Bruno"};
        JOptionPane.showMessageDialog(null, "Nomes com duplicatas" + Arrays.toString(nomesArray), "", JOptionPane.INFORMATION_MESSAGE, null);
        Set<String> nomesSemDuplicatas = new LinkedHashSet<>(Arrays.asList(nomesArray));
        String[] arrayFinal = nomesSemDuplicatas.toArray(new String[0]);
        String mensagem = "nomes sem duplicatas:\n" + String.join(", ", arrayFinal);
        JOptionPane.showMessageDialog(null, mensagem, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
