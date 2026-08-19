package Exnivel3;

import java.security.SecureRandom;

import javax.swing.JOptionPane;

public class Ex48 {
	private static final SecureRandom senhaForte = new SecureRandom();
	private static final String caracteresSenha = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%¨&*()_-+={[}]?/\\\\|^~:;><.,ªº°'";

	public static String geradorSenha(int tamanhoSenha) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < tamanhoSenha; i++) {
			int recebe = senhaForte.nextInt(caracteresSenha.length());
			sb.append(caracteresSenha.charAt(recebe));

		}
		return sb.toString();
	}
	public static void main(String[] args) {
		String resultado = geradorSenha(22);
		JOptionPane.showMessageDialog(null, "Criar Gerador de Senha", "Ex48", JOptionPane.INFORMATION_MESSAGE, null);
		JOptionPane.showMessageDialog(null, "Sua senha gerada aleatória: " + resultado, "Senha Aleatória", JOptionPane.PLAIN_MESSAGE, null);
	}
}
