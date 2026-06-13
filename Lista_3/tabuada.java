package felipe_brito_lista3;

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		
		for (int i = 1; i <=100; i++) {
			System.out.println(numero + "x" + i + " = " + (numero * i));
		}
		
		sc.close();
	}

}
