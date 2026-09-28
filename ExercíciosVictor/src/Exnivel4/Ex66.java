package Exnivel4;

import javax.swing.JOptionPane;

public class Ex66 {
	public static void main(String[] args) {
		Ex65Funcionario funcionario = new Ex65Funcionario("Victor", "Dotum", "02/02/2026", 1621.00, 8);
		
		JOptionPane.showMessageDialog(null, "Criar Sistema Simples De Folha Salárial", "Ex66", JOptionPane.INFORMATION_MESSAGE, null);
		String inputHorasExtras = JOptionPane.showInputDialog(null, "Quantas horas extras o funcionário trabalhou", "", JOptionPane.QUESTION_MESSAGE);
		String inputDesconto = JOptionPane.showInputDialog(null, "Descontos:", "", JOptionPane.QUESTION_MESSAGE);
		
		Integer horasExtras = Integer.parseInt(inputHorasExtras);
		Double desconto = Double.parseDouble(inputDesconto);
		
		Double salarioLiquido = funcionario.getSalario();
		
		salarioLiquido += 7.37 * horasExtras;
		
		salarioLiquido -= desconto;
		
		StringBuilder sb = new StringBuilder("Informações da folha Salárial do Funcionário: \n\n");
		
		sb
		.append("Nome do do funcionário: " + funcionario.getNome() + "\n")
		.append("Empresa: " + funcionario.getEmpresa() + "\n")
		.append("Salário Fixo " + funcionario.getSalario() + "\n")
		.append("Horas Extras: " + horasExtras + "\n")
		.append("Desconto: " + desconto + "\n\n")
		.append("Salário Liquido: " + salarioLiquido + "\n");
		
		JOptionPane.showMessageDialog(null, sb, null, JOptionPane.PLAIN_MESSAGE, null);
	}
}