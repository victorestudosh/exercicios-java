package Exnivel4;

public class Ex64 {
	public static void main(String[] args) {
		
		Ex62produto produto1 = new Ex62produto("Salsicha", 10.00, 10);
		Ex62produto produto2 = new Ex62produto("Salsicha", 10.00, 10);
		
		System.out.println("Hash do objeto produto1:");
		System.out.println(produto1.hashCode());
		System.out.println();
		
		System.out.println("Comparando objetos produto1 e produto2:");
		System.out.println("É igual: " + produto1.equals(produto2));
	}
}
