package Exnivel4;

public class Ex61Produtos {
	
	private String nome;
	private Double preco;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Ex61Produtos(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
}
