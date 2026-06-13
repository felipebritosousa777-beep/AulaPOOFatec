package jogos;

import java.util.Scanner;

public class CofreMisterioso {

	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	        System.out.println(" Bem-vindo ao Cofre Misterioso!");

	        int pontuacao = 0;
	        boolean continuar = true;

	        // WHILE - mantém o jogo ativo
	        while (continuar) {

	            // Escolha de dificuldade
	            int max = escolherDificuldade();
	            int secreto = 1 + new java.util.Random().nextInt(max);
	            boolean acertou = false;

	            // FOR - controla as tentativas
	            for (int tent = 5; tent > 0; tent--) {

	                System.out.print("\nTentativa " + (6 - tent) + "/5 - Seu palpite: ");

	                // Validação de entrada não numérica
	                while (!sc.hasNextInt()) {
	                    System.out.print("Entrada inválida! Digite um número: ");
	                    sc.next();
	                }

	                int palpite = sc.nextInt();

	                if (palpite == secreto) {
	                    System.out.println("🔓 Acertou! Cofre aberto. Código: " + secreto);
	                    int ganho = 10 - (2 * (5 - tent)); // +10 base, -2 por erro
	                    pontuacao += Math.max(ganho, 0);
	                    acertou = true;
	                    break;
	                } else if (palpite < secreto) {
	                    System.out.println("📈 O código é MAIOR. Restam " + (tent - 1) + " tentativas.");
	                } else {
	                    System.out.println("📉 O código é MENOR. Restam " + (tent - 1) + " tentativas.");
	                }
	            }

	            if (!acertou) {
	                System.out.println("❌ Tentativas esgotadas! O código era: " + secreto);
	            }

	            System.out.println("Pontuação atual: " + pontuacao);

	            // DO-WHILE - valida resposta jogar novamente
	            String resposta;
	            do {
	                System.out.print("\nDeseja jogar novamente? (s/n): ");
	                resposta = sc.next().toLowerCase();
	                if (!resposta.equals("s") && !resposta.equals("n")) {
	                    System.out.println("Resposta inválida! Digite s ou n.");
	                }
	            } while (!resposta.equals("s") && !resposta.equals("n"));

	            continuar = resposta.equals("s");
	        }

	        System.out.println("\nPontuação final: " + pontuacao);
	        System.out.println("Fim.");
	        sc.close();
	    }

	    // Função auxiliar - escolher dificuldade
	    static int escolherDificuldade() {
	        int max = 0;
	        while (max == 0) {
	            System.out.print("Escolha a dificuldade [1-Fácil | 2-Médio | 3-Difícil]: ");
	            if (sc.hasNextInt()) {
	                int op = sc.nextInt();
	                if (op == 1) max = 20;
	                else if (op == 2) max = 50;
	                else if (op == 3) max = 100;
	                else System.out.println("Opção inválida!");
	            } else {
	                System.out.println("Digite apenas números!");
	                sc.next();
	            }
	        }
	        return max;
	    }
}
