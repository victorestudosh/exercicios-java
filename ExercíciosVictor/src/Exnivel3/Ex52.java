package Exnivel3;

public class Ex52 {
	public static void main(String[] args) {

		String textoFormatado = removerEspacosDuplicados("oi  cute  cute");

		System.out.println(textoFormatado);

	}

	public static String removerEspacosDuplicados(String texto) {

		String newText = "";

		String formatedText = texto.trim();

		newText = formatedText.replaceAll("  ", " ");

		return newText;
	}
}