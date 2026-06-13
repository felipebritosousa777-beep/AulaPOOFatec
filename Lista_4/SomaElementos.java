package felipe_brito_lista4;

import java.util.Scanner;

public class SomaElementos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 int soma = 0;
		 for (int i = 0; i < 10; i++) {
		 soma += sc.nextInt();
		 }
		 System.out.println(soma);
		 sc.close();
		
	}

}
