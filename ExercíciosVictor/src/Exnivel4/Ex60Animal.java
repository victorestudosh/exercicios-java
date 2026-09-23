package Exnivel4;

import javax.swing.JOptionPane;

public class Ex60Animal {
	private String nome;
	private String especie;

	public Ex60Animal(String nome, String especie) {
		super();
		this.nome = nome;
		this.especie = especie;
	}

	public void comer() {
		JOptionPane.showMessageDialog(null, "O animal está comendo", "", JOptionPane.INFORMATION_MESSAGE, null);
	}

	public void beber() {
		JOptionPane.showMessageDialog(null, "O animal está bebendo", "", JOptionPane.INFORMATION_MESSAGE, null);
	}

	public void fazerSom() {
		JOptionPane.showMessageDialog(null, "O animal está fazendo barulho", "", JOptionPane.INFORMATION_MESSAGE, null);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
}
