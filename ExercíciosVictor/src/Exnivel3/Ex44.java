package Exnivel3;

import javax.swing.JOptionPane;

public class Ex44 {
    
    public static int funcaoFibonacci(int posicao) {
        if (posicao == 0) {
            return 0;
        }
        if (posicao == 1) {
            return 1;
        }
        
        return funcaoFibonacci(posicao - 1) + funcaoFibonacci(posicao - 2);
    }

    public static void main(String[] args) {
        String resultadoFinal = "Sequência de Fibonacci (10 termos):\n\n";
        
        for (int i = 0; i < 10; i++) {
            int termo = funcaoFibonacci(i);
            resultadoFinal += termo + " "; 
        
        }
        StringBuilder sb = new StringBuilder(resultadoFinal);
        JOptionPane.showMessageDialog(null, "Criar método recursivo Fibonacci", "Ex44", JOptionPane.INFORMATION_MESSAGE, null);
        JOptionPane.showMessageDialog(null, sb, "", JOptionPane.PLAIN_MESSAGE);
    }
}
