package Exnivel4;

public class Ex62produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Ex62produto() {
    }
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
}

