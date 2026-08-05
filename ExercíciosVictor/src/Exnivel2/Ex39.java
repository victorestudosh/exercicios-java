package Exnivel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex39 {

	public static List<Produto> listProdutos = Arrays.asList(new Produto("Filé de Frango ", 30.00),
			new Produto("Macarrão", 5.00), new Produto("Kit de limpeza", 42.00), new Produto("Arroz", 20.00),
			new Produto("Feijão", 12.00), new Produto("Óleo", 6.00), new Produto("Garrafa de Água", 2.00),
			new Produto("Picanha", 70.00), new Produto("Salgadinho", 4.00), new Produto("Chocolate", 8.00),
			new Produto("Chiclete", 5.00));
	public static List<Produto> listProdutosAdicionados = new ArrayList<>();

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Simular Caixa Eletrônico (notas)", "Ex39", JOptionPane.INFORMATION_MESSAGE, null);

		do {
			StringBuilder sb = new StringBuilder("Selecione a Opção:\n\n ");

			sb.append("1 - Escolher Produtos\n").append(" 2 - Pagar Compra \n")
					.append(" 3 - Cancelar Tentativa de Compra");

			String input = JOptionPane.showInputDialog(null, sb.toString(), null, JOptionPane.INFORMATION_MESSAGE);

			if (input.equals("1")) {
				StringBuilder produtos = new StringBuilder("Produtos: \n\n");
				for (int i = 0; i < listProdutos.size(); i++) {

					produtos.append("ID: " + i + " | " + listProdutos.get(i).getNome() + " | " + listProdutos.get(i).getPreco() + "\n");

				}

				String inputId = JOptionPane.showInputDialog(null, produtos.toString() + "\nDigite o ID do produto", "Produtos", JOptionPane.PLAIN_MESSAGE);

				Integer idProduto;
				idProduto = Integer.parseInt(inputId);

				listProdutosAdicionados.add(listProdutos.get(idProduto));

				JOptionPane.showMessageDialog(null, "Produto Adicionado!");

			} else if (input.equals("2")) {

				Double valorTotal = 0.0;
				StringBuilder valoresResultado = new StringBuilder("Produtos Adicionados: \n\n");

				for (Produto produto : listProdutosAdicionados) {

					valorTotal += produto.getPreco();

					valoresResultado.append(produto.getNome() + " | " + produto.getPreco() + "\n");
				}

				valoresResultado.append("\n R$" + valorTotal);

				JOptionPane.showMessageDialog(null, valoresResultado.toString(), "", JOptionPane.PLAIN_MESSAGE, null);
				String saldo = JOptionPane.showInputDialog(null, "Qual é seu saldo para essa compra? (notas)", "", JOptionPane.QUESTION_MESSAGE);

				Double saldoCompra = Double.parseDouble(saldo);

				Double troco = saldoCompra - valorTotal;

				int valorTrocoNotas = troco.intValue();
				StringBuilder sbTroco = new StringBuilder(" TROCO DO CLIENTE \n\n");

				int[] notas = { 200, 100, 50, 20, 10, 5, 2 };

				for (int nota : notas) {
					int qtdNotas = valorTrocoNotas / nota;
					if (qtdNotas > 0) {
						sbTroco.append(qtdNotas).append(" nota(s) de R$ ").append(nota).append("\n");
					}
					valorTrocoNotas = valorTrocoNotas % nota;
				}

				if (valorTrocoNotas > 0) {
					sbTroco.append("\nMoedas: R$ ").append(valorTrocoNotas);
				}

				JOptionPane.showMessageDialog(null, sbTroco.toString(), "Troco", JOptionPane.INFORMATION_MESSAGE);

				continue;

			} else if (input.equals("3")) {
				JOptionPane.showMessageDialog(null, "Compra Cancelada", "", JOptionPane.PLAIN_MESSAGE, null);
				break;
			}

		} while (true);
	}
}
