package Exnivel4;

public class Ex62 {
	public static void main(String[] args) {
	    System.out.println("--- Testando Criação com Dados Válidos ---");
	    try {
	        Ex62produto p1 = new Ex62produto("Notebook", 3500.00, 10);
	        System.out.println("Produto criado com sucesso!");
	        System.out.println("Nome: " + p1.getNome());
	        System.out.println("Preço: R$ " + p1.getPreco());
	        System.out.println("Estoque: " + p1.getQuantidade());
	    } catch (IllegalArgumentException e) {
	        System.out.println("Erro inesperado: " + e.getMessage());
	    }

	    System.out.println("\n--- Testando Validação de Nome Vazio ---");
	    try {
	        Ex62produto p2 = new Ex62produto("   ", 1500.00, 5);
	    } catch (IllegalArgumentException e) {
	        System.out.println("Sucesso no teste de erro! Mensagem: " + e.getMessage());
	    }

	    System.out.println("\n--- Testando Validação de Preço Inválido ---");
	    try {
	        Ex62produto p3 = new Ex62produto("Celular", 1200.00, 2);
	        p3.setPreco(-50.0); 
	    } catch (IllegalArgumentException e) {
	        System.out.println("Sucesso no teste de erro! Mensagem: " + e.getMessage());
	    }
	}

}
