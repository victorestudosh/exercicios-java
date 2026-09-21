package Exnivel4;

import javax.swing.JOptionPane;

public class Ex56 {
	public static void main(String[] args) {
		Ex56Pessoa cuteCute = new Ex56Pessoa("Victor", "13", "01/03/2013", "Masculino", "1.60", "Branco");
		
		StringBuilder sb = new StringBuilder();
		
		sb
		.append(cuteCute.nome = "Nome: Victor / Cute Cute \n")
		.append(cuteCute.idade = "Idade: 13 \n")
		.append(cuteCute.dataNascimento = "Data de Nascimento: 01/03/2013 \n")
		.append(cuteCute.sexoMF = "Sexo M/F: Masculino \n")
		.append(cuteCute.altura = "Altura: 1.60 \n")
		.append(cuteCute.raca = "Raça: Branca \n");
		
		JOptionPane.showMessageDialog(null, "Criar Classe Pessoa", "Ex56", JOptionPane.INFORMATION_MESSAGE, null);
		JOptionPane.showMessageDialog(null, "Informações sobre Victor Sampaio Palharin:", "Informações", JOptionPane.INFORMATION_MESSAGE, null);
		JOptionPane.showMessageDialog(null, sb , "Informações ---------⬇️", JOptionPane.PLAIN_MESSAGE, null);
	}
}
