package felipe_brito_lista2;

import java.util.Scanner;

public class PositivoNegativoZero {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		int numero = sc.nextInt();
		
		if (numero > 0) {
			System.out.println("Positivo");
		} else if (numero < 0) {
			System.out.println("Negativo");
		} else {
			System.out.println("Zero");
		}
		
		sc.close();
	}

}
