 package Exnivel3;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Ex51 {
	public static void main(String[] args) {
		String senha;
		String classificacao;
		
		JOptionPane.showMessageDialog(null, "Validar Senha Forte", "Ex51", JOptionPane.INFORMATION_MESSAGE, null);
		while (true) {
			senha = JOptionPane.showInputDialog(null, "Digite uma senha:\n(Mínimo de 6 caracteres)", "Cadastro de Senha", JOptionPane.PLAIN_MESSAGE);

			classificacao = validadorSenha(senha);

			if (classificacao.equals("FORTE")) {
				JOptionPane.showMessageDialog(null, "Senha forte cadastrada.", "", JOptionPane.INFORMATION_MESSAGE);
				break;
			} else {

				String msgerro = "Resultado: A senha digitada é " + classificacao + "\n\n"
						+ "Dica: Para ser FORTE, use letras maiúsculas, minúsculas,\n"
						+ "números, caracteres especiais e pelo menos 10 caracteres.";

				JOptionPane.showMessageDialog(null, msgerro, "", JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	public static String validadorSenha(String senha) {
		if (senha == null || senha.length() < 6) {
			return "FRACA (Muito curta)";
		}

		int pontuacao = 0;
		if (Pattern.compile("[a-z]").matcher(senha).find())
			pontuacao++;
		if (Pattern.compile("[A-Z]").matcher(senha).find())
			pontuacao++;
		if (Pattern.compile("[0-9]").matcher(senha).find())
			pontuacao++;
		if (Pattern.compile("[!@#$%^&*(),.?\":{}|<>]").matcher(senha).find())
			pontuacao++;
		if (senha.length() >= 10)
			pontuacao++;

		if (pontuacao >= 4) {
			return "FORTE";
		} else if (pontuacao >= 3) {
			return "MÉDIA";
		} else {
			return "FRACA";
		}
	}
}

