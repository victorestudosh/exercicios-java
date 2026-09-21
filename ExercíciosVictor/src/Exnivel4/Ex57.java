package Exnivel4;

import javax.swing.JOptionPane;

public class Ex57 {
	public static void main(String[] args) {
		Ex56Pessoa pessoa = new Ex56Pessoa("Victor Sampaio", "13", "01/03/2013", "Masculino", "1.60", "branco");
		Ex57ContaBancaria conta = new Ex57ContaBancaria(pessoa, 1000.00, 02022026, "149.283.475-01");

		StringBuilder sb = new StringBuilder("Escolha opções na simulação de uma Conta Bancária: \n\n");

		sb
		.append("1 - Depositar \n")
		.append("2 - Sacar \n")
		.append("3 - Sair \n");
		
		String input = JOptionPane.showInputDialog(null, sb, null, JOptionPane.INFORMATION_MESSAGE);

		if (input.equals("1")) {
			String inputvalor = JOptionPane.showInputDialog(null, "Qual o valor que você deseja depositar", null, JOptionPane.QUESTION_MESSAGE);

			Double valor = Double.parseDouble(inputvalor);

			conta.depositor(valor);

			if (valor > 1000.00) {
				JOptionPane.showMessageDialog(null, "Você não tem esse dinheiro para ser transferido!", "Depósito Recusado", JOptionPane.ERROR_MESSAGE, null);
			} else {
				JOptionPane.showMessageDialog(null, "Seu depósito foi efetudado com Sucesso!", "Depósito Aprovado", JOptionPane.INFORMATION_MESSAGE, null);
			}

		}
		if (input.equals("2")) {
			String inputSacar = JOptionPane.showInputDialog(null, "Qual o valor que você deseja Sacar", null, JOptionPane.QUESTION_MESSAGE);

			Double sacar = Double.parseDouble(inputSacar);

			conta.sacar(sacar);

			if (sacar > 1000.00) {
				JOptionPane.showMessageDialog(null, "Você não tem o dinheiro para esse saque!", "Saque Recusado", 0, null);
			} else {
				JOptionPane.showMessageDialog(null, "Seu saque foi efetuado com Sucesso!", "Saque aprovado", JOptionPane.INFORMATION_MESSAGE, null);
			}
		}
	}
}
