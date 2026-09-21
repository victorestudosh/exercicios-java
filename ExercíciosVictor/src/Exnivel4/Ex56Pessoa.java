package Exnivel4;

public class Ex56Pessoa {
	String nome;
	String idade;
	String dataNascimento;
	String sexoMF;
	String altura;
	String raca;

	public Ex56Pessoa(String nome, String idade, String dataNascimento, String sexoMF, String altura, String raca) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.sexoMF = sexoMF;
		this.altura = altura;
		this.raca = raca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexoMF() {
		return sexoMF;
	}

	public void setSexoMF(String sexoMF) {
		this.sexoMF = sexoMF;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

}