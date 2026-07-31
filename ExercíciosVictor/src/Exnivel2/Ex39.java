package Exnivel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class Ex39 {
	
	public static List<Produto> listProdutos = Arrays.asList(new Produto("Filé de Frango ", 30.00), new Produto("Macarrão", 5.00), new Produto("Kit de limpeza", 42.00),
			new Produto("Arroz", 20.00 ), new Produto("Feijão", 12.00), new Produto("Óleo", 8.00));
	public static List<Produto> listProdutosAdicionados = new ArrayList<>();
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Simular Caixa Eletrônico (notas)", "Ex39", JOptionPane.INFORMATION_MESSAGE, null);

		do {
			StringBuilder sb = new StringBuilder("Selecione a Opção:\n\n ");
			
			sb.append("1 - Escolher Produtos\n").append(" 2 - Cancelar Tentativa de Compra");
			
			String input = JOptionPane.showInputDialog(null, sb.toString(), null, JOptionPane.INFORMATION_MESSAGE);
			
			if (input.equals("1")) {
				StringBuilder produtos = new StringBuilder("Produtos: \n\n");
				
				for (Produto produto: listProdutos) {
					produtos.append(produto.getNome() + " | " + produto.getPreco() + "\n");
				}

				JOptionPane.showInputDialog(null, produtos.toString(), "", JOptionPane.PLAIN_MESSAGE);
			}
			
		} while (true);
	}
}
