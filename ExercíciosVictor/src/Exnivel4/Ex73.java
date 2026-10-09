package Exnivel4;

import java.util.Scanner;

class MenorDeIdade extends Exception {

	private static final long serialVersionUID = 1L;

	public MenorDeIdade(String mensagem) {
		super(mensagem);
	}
	
}

public class Ex73 {
	public static void main(String[] args) throws MenorDeIdade {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if (idade < 18) {
			sc.close();
			throw new MenorDeIdade("Não é possível entrar com menor de 18 anos");
		}
		
		sc.close();
	}
}
