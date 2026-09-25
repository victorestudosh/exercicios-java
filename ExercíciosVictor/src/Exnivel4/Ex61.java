package Exnivel4;

import javax.swing.JOptionPane;

public class Ex61 {

	public static void main(String[] args) {
		Ex61Estoque estoque = new Ex61Estoque();
		int opcao = 0;
		while (opcao != 5) {
			StringBuilder sb = new StringBuilder("Opções\n\n");
			sb.append("1 - Adicionar Produtos\n");
			sb.append("2 - Mostrar Produtos\n");
			sb.append("3 - Deletar Produto\n");
			sb.append("4 - Verificar Produto\n");
			sb.append("5 - Sair");
			String entrada = JOptionPane.showInputDialog(null, sb.toString());
			if (entrada == null) {
				break;
			}
			try {
				opcao = Integer.parseInt(entrada.trim());
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Digite uma opção de 1 a 5.");
				continue;
			} 
			switch (opcao) {
			case 1:
				String nome = JOptionPane.showInputDialog(null, "Digite o nome do produto:");
				if (nome == null || nome.trim().isEmpty()) {
					break;
				}
				String precoTexto = JOptionPane.showInputDialog(null, "Digite o preço do produto:");
				if (precoTexto == null) {
					break;
				}
				try {
					Double preco = Double.parseDouble(precoTexto.trim().replace(".", "").replace(",", "."));
					Ex61Produtos produto = new Ex61Produtos(nome.trim(), preco);
					estoque.adicionarProduto(produto);
					JOptionPane.showMessageDialog(null, "Produto adicionado!");
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Preço inválido!");
				}
				break;
			case 2:
				StringBuilder lista = new StringBuilder();
				for (Ex61Produtos p : estoque.listarProdutos()) {
					lista.append("Nome: ").append(p.getNome()).append("\nPreço: R$ ")
							.append(String.format("%,.0f", p.getPreco())).append("\n\n");
				}
				if (lista.length() == 0) {
					lista.append("Estoque vazio!");
				}
				JOptionPane.showMessageDialog(null, lista.toString());
				break;
			case 3:
				String nomeRemover = JOptionPane.showInputDialog(null, "Digite o nome do produto:");
				if (nomeRemover == null) {
					break;
				}
				Ex61Produtos remover = estoque.buscarProduto(nomeRemover.trim());
				if (remover != null) {
					estoque.removerProduto(remover);
					JOptionPane.showMessageDialog(null, "Produto removido!");
				} else {
					JOptionPane.showMessageDialog(null, "Produto não encontrado!");
				}
				break;
			case 4:
				String nomeBuscar = JOptionPane.showInputDialog(null, "Digite o nome do produto:");
				if (nomeBuscar == null) {
					break;
				}
				Ex61Produtos encontrado = estoque.buscarProduto(nomeBuscar.trim());
				if (encontrado != null) {
					JOptionPane.showMessageDialog(null, "Produto encontrado!\n" + "Nome: " + encontrado.getNome()
							+ "\nPreço: R$ " + String.format("%,.0f", encontrado.getPreco()));
				} else {
					JOptionPane.showMessageDialog(null, "Produto não encontrado!");
				}
				break;
			case 5:
				JOptionPane.showMessageDialog(null, "Programa encerrado!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}
	}
}