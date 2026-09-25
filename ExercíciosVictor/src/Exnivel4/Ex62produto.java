package Exnivel4;

import java.util.Objects;

public class Ex62produto {
	private String nome;
	private double preco;
	private int quantidade;

	public Ex62produto(String nome, double preco, int quantidade) {
		setNome(nome);
		setPreco(preco);
		setQuantidade(quantidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty()) {
			throw new IllegalArgumentException("O nome do produto não pode ser vazio.");
		}
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco <= 0) {
			throw new IllegalArgumentException("O preço deve ser maior que zero.");
		}
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade < 0) {
			throw new IllegalArgumentException("A quantidade não pode ser negativa.");
		}
		this.quantidade = quantidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, preco, quantidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex62produto other = (Ex62produto) obj;
		return Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco)
				&& quantidade == other.quantidade;
	}

}
