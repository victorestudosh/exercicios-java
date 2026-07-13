package Exnivel1;

import javax.swing.JOptionPane;

public class Ex14 {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Verificar número primo", "Ex14", JOptionPane.INFORMATION_MESSAGE, null);
		String numero = JOptionPane.showInputDialog(null, "Digite um número", "", JOptionPane.PLAIN_MESSAGE);
		
		Integer numero1 = Integer.parseInt(numero);
		
		boolean primo = true;

        if (numero1 <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= numero1 / 2; i++) {
                if (numero1 % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
			JOptionPane.showMessageDialog(null, "Ele é Primo", "Número Primo", JOptionPane.INFORMATION_MESSAGE, null);
		} else {
			JOptionPane.showMessageDialog(null, "Ele Não é Primo", "Número não Primo", JOptionPane.INFORMATION_MESSAGE, null);
		}
	}
}
