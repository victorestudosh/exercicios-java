package Exnivel3;

import java.awt.Color;
import java.util.Scanner;

public class Ex55 {
	
	public static char[] tabuleiro = {'0', '1', '2', '3', '4', '5', '6', '7', '8'};
	public static char jogador = 'X'; 
	
    public static void imprimirTabuleiro() {
    	System.out.println(corJogodavelha(tabuleiro[0]) + "  " + corJogodavelha(tabuleiro[1]) + "  " + corJogodavelha(tabuleiro[2]));
    	System.out.println();
    	System.out.println(corJogodavelha(tabuleiro[3]) + "  " + corJogodavelha(tabuleiro[4]) + "  " + corJogodavelha(tabuleiro[5]));
    	System.out.println();
    	System.out.println(corJogodavelha(tabuleiro[6]) + "  " + corJogodavelha(tabuleiro[7]) + "  " + corJogodavelha(tabuleiro[8]));
    }
	public static String corJogodavelha (char simbolo) {
		if (simbolo == 'X') {
			return Cores.corX + simbolo + Cores.reset;
		}
		if (simbolo == 'O') {
			return Cores.corO + simbolo + Cores.reset;
		}
		return String.valueOf(simbolo);
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int jogadas = 0;
		
		while (jogadas < 9) {
			
			imprimirTabuleiro(); 
			
			System.out.println("\nJogador " + corJogodavelha(jogador) + ", escolha sua posição no tabuleiro: \n");
			int posicao = teclado.nextInt();
			
			System.out.println();
			
			tabuleiro[posicao] = jogador;
			jogadas++;
			
			if ((tabuleiro[0] == jogador && tabuleiro[1] == jogador && tabuleiro[2] == jogador) 
			||	(tabuleiro[3] == jogador && tabuleiro[4] == jogador && tabuleiro[5] == jogador) 
			||	(tabuleiro[6] == jogador && tabuleiro[7] == jogador && tabuleiro[8] == jogador) 
			||	(tabuleiro[0] == jogador && tabuleiro[3] == jogador && tabuleiro[6] == jogador) 
			||	(tabuleiro[1] == jogador && tabuleiro[4] == jogador && tabuleiro[7] == jogador) 
			||	(tabuleiro[2] == jogador && tabuleiro[5] == jogador && tabuleiro[8] == jogador) 
			||	(tabuleiro[0] == jogador && tabuleiro[4] == jogador && tabuleiro[8] == jogador) 
			||	(tabuleiro[2] == jogador && tabuleiro[4] == jogador && tabuleiro[6] == jogador)) {
				
				imprimirTabuleiro();
				System.out.println("\nJogador " + corJogodavelha(jogador) + " venceu!");
				break;
			}
				
			System.out.println("_________");
			System.out.println();
			
			if(jogador == 'X') {
				jogador = 'O';
			} else {
				jogador = 'X';
			}
			
		}
	}
}