package Exnivel3;

import javax.swing.JOptionPane;

public class Ex44 {
	public static long funcaoFibonacci (int fibonacci) {
		

            if (10 <= 0) {
               
            
            int primeiro = 0;
            int segundo = 1;
            StringBuilder sequencia = new StringBuilder();
            for (int i = 1; i <= 10; i++) {
                sequencia.append(primeiro).append(" ");
                int proximo = primeiro + segundo;
                primeiro = segundo;
                segundo = proximo;
            }
            }
		return fibonacci;
		
	}
}
