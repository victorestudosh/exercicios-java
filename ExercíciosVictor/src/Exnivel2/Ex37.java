package Exnivel2;

public class Ex37 {
	
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        System.out.println("Elementos da Diagonal Principal:");
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|" + matriz[i][i] + "| ");
        }
    }
}