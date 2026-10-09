package Exnivel4;

	public class Ex75 {

	    public static void main(String[] args) {

	        Ex75Dadostxt.salvarDados("iPhone 17, valor:6000.0\n");
	        Ex75Dadostxt.salvarDados("Samsung Galaxy, valor: 3500.0\n");
	        Ex75Dadostxt.salvarDados("Notebook, valor: 4500.0\n");

	        System.out.println("Dados salvos!\n");

	        System.out.println("Lendo dados do arquivo:");

	        Ex75Dadostxt.lerDados();
	    }
	}