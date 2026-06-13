package felipe_brito_lista4;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 double soma = 0;
		 for (int i = 0; i < 6; i++) {
		 soma += sc.nextDouble();
		 }
		 System.out.println(soma / 6);
		 sc.close();

		
	}

}
