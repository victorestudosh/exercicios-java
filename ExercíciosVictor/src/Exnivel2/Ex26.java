package Exnivel2;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ex26 {
    public static void main(String[] args) {
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            while (true) {
            	JOptionPane.showMessageDialog(null, "Encontrar segundo maior número", null, JOptionPane.INFORMATION_MESSAGE, null);
                String input = JOptionPane.showInputDialog(null, "Digite o " + (i + 1) + "º número:");
                if (input == null) {
                    int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair do programa?", "Sair", JOptionPane.YES_NO_OPTION);
                    if (resposta == JOptionPane.YES_OPTION) {
                        System.exit(0);
                    } else {
                        continue; 
                    }
                }
                input = input.trim().replace(",", ".");
                try {
                    array[i] = Double.parseDouble(input);
                    break; 
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null,"Digite apenas números válidos. Use ponto ou vírgula para decimais.", "Entrada Inválida", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        Arrays.sort(array);
        double maior = -Double.MAX_VALUE;
        double segundoMaior = -Double.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                segundoMaior = maior; 
                maior = array[i];     
            } else if (array[i] > segundoMaior && array[i] != maior) {
                segundoMaior = array[i]; 
            }
        }
        StringBuilder listaNumeros = new StringBuilder("[ ");
        for (int i = 0; i < array.length; i++) {
            listaNumeros.append(array[i]);
            if (i < array.length - 1) {
                listaNumeros.append(" | ");
            }
        }
        listaNumeros.append(" ]");
        if (segundoMaior == -Double.MAX_VALUE) {
            JOptionPane.showMessageDialog(null, "Todos os números digitados são iguais.\n\n" + "Valores digitados: " + listaNumeros.toString(),"Resultado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Array: " + listaNumeros.toString() + "\n\n" +"Maior número: " + maior + "\n" +"Segundo maior número: " + segundoMaior,"Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        System.exit(0);
    }
}
