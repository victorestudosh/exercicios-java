package Exnivel2;

import java.util.Scanner;

public class Ex40 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("=== Ex 40 - Criar menu interativo via console ===");
		StringBuilder sb = new StringBuilder("\nSelecione a Operação Matemática");

		sb
		.append("\n\n1 - Adição")
		.append("\n2 - Subtração")
		.append("\n3 - Multiplicação")
		.append("\n4 - Divisão\n------------")
		.append("\n5 - Sair\n");

		System.out.println(sb);
		String opcaoSb = teclado.nextLine();

		if (opcaoSb.equals("1")) {

			System.out.println("\nDigite o Primeiro número da Adição");

			int adicao1 = teclado.nextInt();

			System.out.println("\nDigite o Segundo número da Adição");

			int adicao2 = teclado.nextInt();

			double resultadoAdicao = adicao1 + adicao2;

			System.out.println("O resultado da adição é = " + resultadoAdicao);
			
			} else if (opcaoSb.equals("2")) {

			System.out.println("Digite o Primeiro número da Subtração");
			
			int subtracao1 = teclado.nextInt();
			
			System.out.println("Digite o Segundo número da Subtração");
			
			int subtracao2 = teclado.nextInt();
			
			double resultadoSubtracao = subtracao1 - subtracao2;
			
			System.out.println("O resultado da subtração é = " + resultadoSubtracao);
			
		} else if (opcaoSb.equals("3")) {
		
			System.out.println("Digite o Primeiro número da multiplicação");
			
			int multiplicacao1 = teclado.nextInt();
			
			System.out.println("Digite o Segundo número da multiplicação");
			
			int multiplicacao2 = teclado.nextInt();
			
			double resultadoMultiplicacao = multiplicacao1 * multiplicacao2;
			
			System.out.println("O resultado da multiplicação é = " + resultadoMultiplicacao);
		} else if (opcaoSb.equals("4")) {
			
			System.out.println("Digite o Primeiro número da Divisão");
			
			int divisao1 = teclado.nextInt();
			
			System.out.println("Digite o Segundo número da Divisão");
			
			int divisao2 = teclado.nextInt();
			
			double resultadoDivisao = divisao1 / divisao2;
			
			System.out.println("O resultado da Divisão é = " + resultadoDivisao);
		} else if (opcaoSb.equals("5")) {
			
			System.out.println("\nSaindo...");
		}
	}
}
