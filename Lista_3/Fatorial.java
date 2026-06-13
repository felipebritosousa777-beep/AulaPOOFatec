package felipe_brito_lista3;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
		 
		 System.out.println("Digite um número inteiro positivo: ");
		 int numero = sc.nextInt();
		 
		 
		 int fatorial = 1;
		 
		 for (int i = numero; i >= 1; i--) {
			 fatorial *= i;
		 }
		 
		 System.out.println(numero + "! = " + fatorial);
		 
		 sc.close();
		 
	}

}
