package Exnivel5;

public class Ex80 {
	static class No {
        int valor;
        No esquerda, direita;
        No(int valor) {
            this.valor = valor;
        }
    }
    static void preOrdem(No no) {
        if (no == null)
            return;
        System.out.print(no.valor + " ");
        preOrdem(no.esquerda);
        preOrdem(no.direita);
    }
    static void emOrdem(No no) {
        if (no == null)
            return;
        emOrdem(no.esquerda);
        System.out.print(no.valor + " ");
        emOrdem(no.direita);
    }
    static void posOrdem(No no) {
        if (no == null)
            return;
        posOrdem(no.esquerda);
        posOrdem(no.direita);
        System.out.print(no.valor + " ");
    }
    public static void main(String[] args) {
        No raiz = new No(10);
        raiz.esquerda = new No(5);
        raiz.direita = new No(15);
        System.out.print("Pre-ordem: ");
        preOrdem(raiz);
        System.out.print("\n\nEm ordem: ");
        emOrdem(raiz);
        System.out.print("\n\nPos-ordem: ");
        posOrdem(raiz);
    }
}
