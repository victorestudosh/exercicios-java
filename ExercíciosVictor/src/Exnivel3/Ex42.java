package Exnivel3;

import javax.swing.JOptionPane;
import java.util.InputMismatchException;

public class Ex42 {
	 public static void main(String[] args) {
		 JOptionPane.showMessageDialog(null, "Criar método para validar CPF (simplificado)", "Ex42", JOptionPane.INFORMATION_MESSAGE, null);
		 ejecutarSistema();
		     }

		     private static void ejecutarSistema() {
		         boolean continuar = true;

		         while (continuar) {
		             String cpfDigitado = obterCpfUsuario();

		             if (cpfDigitado == null) {
		                 break;
		             }

		             processarValidacao(cpfDigitado);
		             continuar = perguntarSeDesejaContinuar();
		         }
		     }

		     private static String obterCpfUsuario() {
		         return JOptionPane.showInputDialog(null, "Digite o CPF que deseja validar:\n(Pode conter pontos e traço)", "Validador de CPF Oficial", JOptionPane.QUESTION_MESSAGE);
		     }

		     private static void processarValidacao(String cpfRaw) {
		         String cpfLimpo = cpfRaw.replaceAll("[^\\d]", "");

		         if (isCPF(cpfLimpo)) {
		             String cpfFormatado = formatarCPF(cpfLimpo);
		             JOptionPane.showMessageDialog(null,"\n\nO CPF " + cpfFormatado + "é VÁLIDO!", "Resultado: Válido", JOptionPane.INFORMATION_MESSAGE);
		         } else {
		             JOptionPane.showMessageDialog(null, "\n\nO CPF digitado é INVÁLIDO.\nVerifique os números e tente novamente.", "Resultado: Inválido", JOptionPane.ERROR_MESSAGE
		             );
		         }
		     }
		     private static boolean perguntarSeDesejaContinuar() {
		         int resposta = JOptionPane.showConfirmDialog(
		                 null, "Deseja validar outro CPF?", "Continuar?",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE
		         );
		         return resposta == JOptionPane.YES_OPTION;
		     }

		     private static boolean isCPF(String cpf) {
		         if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
		             return false;
		         }

		         char dig10, dig11;
		         int sm, i, r, num, peso;

		         try {
		             sm = 0;
		             peso = 10;
		             for (i = 0; i < 9; i++) {
		                 num = (int) (cpf.charAt(i) - 48);
		                 sm = sm + (num * peso);
		                 peso = peso - 1;
		             }

		             r = 11 - (sm % 11);
		             dig10 = ((r == 10) || (r == 11)) ? '0' : (char) (r + 48);

		             sm = 0;
		             peso = 11;
		             for (i = 0; i < 10; i++) {
		                 num = (int) (cpf.charAt(i) - 48);
		                 sm = sm + (num * peso);
		                 peso = peso - 1;
		             }

		             r = 11 - (sm % 11);
		             dig11 = ((r == 10) || (r == 11)) ? '0' : (char) (r + 48);

		             return (dig10 == cpf.charAt(9)) && (dig11 == cpf.charAt(10));

		         } catch (InputMismatchException erro) {
		             return false;
		         }
		     }

		     private static String formatarCPF(String cpfLimpo) {
		         return (cpfLimpo.substring(0, 3) + "." +
		        		 cpfLimpo.substring(3, 6) + "." + 
		                 cpfLimpo.substring(6, 9) + "-" + 
		                 cpfLimpo.substring(9, 11));
		 
	}
}
