package Exnivel5;

public class Ex79 {
	static class No {
        int numero;
        No esquerda, direita;
        No(int numero) {
            this.numero = numero;
        }
    }
    public static void main(String[] args) {
        No raiz = new No(10);
        raiz.esquerda = new No(5);
        raiz.direita = new No(15);
        raiz.esquerda.esquerda = new No(3);
        raiz.esquerda.direita = new No(7);
        raiz.direita.esquerda = new No(12);
        raiz.direita.direita = new No(20);
        System.out.println("        10");
        System.out.println("      /   \\");
        System.out.println("     5     15");
        System.out.println("    / \\   / \\");
        System.out.println("   3   7 12 20");
    }
}
