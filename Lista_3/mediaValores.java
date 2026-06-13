package felipe_brito_lista3;

import java.util.Scanner;

public class mediaValores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de números: ");
		int quantidade = sc.nextInt();
		
		
		double soma = 0;
		
		for (int i = 1; i <= quantidade; i++) {
			System.out.println("Digite o " + i + "º número: ");
			double numero = sc.nextDouble();
			soma += numero;
		}
		double media = soma / quantidade;
		
		System.out.println("Média dos valores é: " + media);
		sc.close();
	}

}
