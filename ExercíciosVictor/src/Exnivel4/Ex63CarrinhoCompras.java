package Exnivel4;

import java.util.ArrayList;
import java.util.List;

public class Ex63CarrinhoCompras {
	private List<Ex61Produtos> produtos;
	private List<Integer> quantidades;

	public Ex63CarrinhoCompras() {
		this.produtos = new ArrayList<>();
		this.quantidades = new ArrayList<>();
	}

	public void adicionarProduto(Ex61Produtos produto, int quantidade) {
		if (produto == null) {
			System.out.println("Erro: Não é possível adicionar um produto nulo.");
			return;
		}
		if (quantidade <= 0) {
			System.out.println("Erro: A quantidade deve ser maior que zero.");
			return;
		}

		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getNome().equalsIgnoreCase(produto.getNome())) {
				quantidades.set(i, quantidades.get(i) + quantidade);
				System.out.println("Adicionado mais " + quantidade + " un. de " + produto.getNome());
				return;
			}
		}

		this.produtos.add(produto);
		this.quantidades.add(quantidade);
		System.out.println(produto.getNome() + " adicionado ao carrinho.");
	}

	public boolean removerProdutoPorNome(String nome) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getNome().equalsIgnoreCase(nome)) {
				System.out.println(produtos.get(i).getNome() + " foi removido do carrinho.");
				produtos.remove(i);
				quantidades.remove(i);
				return true;
			}
		}
		System.out.println("Produto '" + nome + "' não encontrado no carrinho.");
		return false;
	}

	public double calcularTotal() {
		double total = 0;
		for (int i = 0; i < produtos.size(); i++) {
			total += produtos.get(i).getPreco() * quantidades.get(i);
		}
		return total;
	}

	public void exibirCarrinho() {
		if (produtos.isEmpty()) {
			System.out.println("\nO carrinho está vazio.");
			return;
		}
		System.out.println("\n--- ITENS NO CARRINHO ---");
		for (int i = 0; i < produtos.size(); i++) {
			Ex61Produtos p = produtos.get(i);
			int qtd = quantidades.get(i);
			double subtotal = p.getPreco() * qtd;

			System.out.printf("- %s | Qtd: %d | Preço Un: R$ %.2f | Subtotal: R$ %.2f%n", p.getNome(), qtd,
					p.getPreco(), subtotal);
		}
		System.out.printf("TOTAL DO CARRINHO: R$ %.2f%n", calcularTotal());
	}
}