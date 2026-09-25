package Exnivel4;

import javax.swing.JOptionPane;

public class Ex65 {
	public static void main(String[] args) {
		Ex65Funcionario funcionario = new Ex65Funcionario("Jubiscreudio", "Dotum", "02/02/2026", "2.000", 7);
		
		StringBuilder sb = new StringBuilder("Informações Do Funcionário: \n\n");
		
		sb
		.append("Nome do Funcionário(a): " + funcionario.getNome() + "\n")
		.append("Empresa: " + funcionario.getEmpresa() + "\n")
		.append("Data de Contratação: " + funcionario.getDataContratacao() + "\n")
		.append("Salário: " + funcionario.getSalario() + "\n")
		.append("Carga Horária: " + funcionario.getCargaHoraria() + " Horas");
		
		JOptionPane.showMessageDialog(null, "Criar Classe Funcionario", "Ex65", JOptionPane.INFORMATION_MESSAGE, null);
		JOptionPane.showMessageDialog(null, sb, null, JOptionPane.PLAIN_MESSAGE, null);
	}
}