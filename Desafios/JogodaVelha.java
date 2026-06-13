package desafios;

import java.util.Scanner;

public class JogodaVelha {

	public class main {

		    static char[][] tabuleiro = {
		            {' ', ' ', ' '},
		            {' ', ' ', ' '},
		            {' ', ' ', ' '}
		    };

		    static Scanner sc = new Scanner(System.in);

		        char jogador = 'X';
		        boolean jogoRodando = true;
		        int jogadas = 0; {

		        while (jogoRodando) {

		            imprimirTabuleiro();

		            System.out.println("Jogador " + jogador);

		            System.out.print("Linha (1-3): ");
		            int linha = sc.nextInt() - 1;

		            System.out.print("Coluna (1-3): ");
		            int coluna = sc.nextInt() - 1;

		            // validação
		            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
		                System.out.println("Posição inválida!");
		                continue;
		            }

		            if (tabuleiro[linha][coluna] != ' ') {
		                System.out.println("Casa ocupada!");
		                continue;
		            }

		            tabuleiro[linha][coluna] = jogador;
		            jogadas++;

		            // verificar vitória
		            if (verificarVitoria(jogador)) {
		                imprimirTabuleiro();
		                System.out.println("Jogador " + jogador + " venceu!");
		                jogoRodando = false;
		            }

		            // verificar empate
		            else if (jogadas == 9) {
		                imprimirTabuleiro();
		                System.out.println("Empate!");
		                jogoRodando = false;
		            }

		            // troca jogador
		            else {
		                if (jogador == 'X') {
		                    jogador = 'O';
		                } else {
		                    jogador = 'X';
		                }
		            }
		        }

		        sc.close();
		    }

		    // imprimir tabuleiro
		    public static void imprimirTabuleiro() {

		        System.out.println();

		        for (int i = 0; i < 3; i++) {

		            for (int j = 0; j < 3; j++) {

		                System.out.print(" " + tabuleiro[i][j] + " ");

		                if (j < 2) {
		                    System.out.print("|");
		                }
		            }

		            System.out.println();

		            if (i < 2) {
		                System.out.println("---+---+---");
		            }
		        }

		        System.out.println();
		    }

		    // verificar vitória
		    public static boolean verificarVitoria(char jogador) {

		        // linhas
		        for (int i = 0; i < 3; i++) {
		            if (tabuleiro[i][0] == jogador &&
		                tabuleiro[i][1] == jogador &&
		                tabuleiro[i][2] == jogador) {
		                return true;
		            }
		        }

		        // colunas
		        for (int i = 0; i < 3; i++) {
		            if (tabuleiro[0][i] == jogador &&
		                tabuleiro[1][i] == jogador &&
		                tabuleiro[2][i] == jogador) {
		                return true;
		            }
		        }

		        // diagonal principal
		        if (tabuleiro[0][0] == jogador &&
		            tabuleiro[1][1] == jogador &&
		            tabuleiro[2][2] == jogador) {
		            return true;
		        }

		        // diagonal secundária
		        if (tabuleiro[0][2] == jogador &&
		            tabuleiro[1][1] == jogador &&
		            tabuleiro[2][0] == jogador) {
		            return true;
		        }

		        return false;
		    }
		}
		
	}


