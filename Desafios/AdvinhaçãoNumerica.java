package desafios;

import java.util.Scanner;
import java.util.Random;

public class AdvinhaçãoNumerica {

	public class Main {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        Random random = new Random();

	        int numeroSorteado = random.nextInt(100) + 1;
	        int tentativa = 0;
	        int contador = 0;

	        System.out.println("=== JOGO DA ADIVINHAÇÃO ===");
	        System.out.println("Tente descobrir o número de 1 a 100");

	        while (tentativa != numeroSorteado) {

	            System.out.print("Digite um número: ");
	            tentativa = sc.nextInt();

	            contador++;

	            if (tentativa > numeroSorteado) {

	                System.out.println("O número é MENOR!");

	            } else if (tentativa < numeroSorteado) {

	                System.out.println("O número é MAIOR!");

	            } else {

	                System.out.println("Parabéns! Você acertou!");
	                System.out.println("Tentativas: " + contador);
	            }
	        }

	        sc.close();
	    }
	}
	}

