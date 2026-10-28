package Exnivel5;

public class Ex81 {
	static class No {
	        int valor;
	        No esquerda, direita;
	        No(int valor) {
	            this.valor = valor;
	        }
	    }
	    static boolean buscar(No no, int numero) {
	        if (no == null) {
	            return false;
	        }
	        if (no.valor == numero) {
	            return true;
	        }
	        if (numero < no.valor) {
	            return buscar(no.esquerda, numero);
	        } else {
	            return buscar(no.direita, numero);
	        }
	    }
	    public static void main(String[] args) {
	        No raiz = new No(10);
	        raiz.esquerda = new No(5);
	        raiz.direita = new No(15);
	        System.out.println("Buscando o numero 5...");
	        System.out.println(buscar(raiz, 5));
	        System.out.println("________________________");
	        
	        System.out.println("Buscando o numero 20...");
	        System.out.println(buscar(raiz, 20));
	    }
}
