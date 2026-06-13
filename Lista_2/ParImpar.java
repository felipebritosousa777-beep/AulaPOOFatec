package felipe_brito_lista2;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           
           System.out.println("Digite um numero inteiro");
           int numero = sc.nextInt();
           
           if (numero % 2 == 0) {
        	   System.out.println("Par");
           } else {
        	   System.out.println("Ímpar");
           }
		
		sc.close();
	}

}
