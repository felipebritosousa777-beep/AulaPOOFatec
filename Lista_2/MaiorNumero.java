package felipe_brito_lista2;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite o primeiro numero: ");
    int a = sc.nextInt();
    
    System.out.println("Digite o segundo numero: ");
    int b = sc.nextInt();
    
    if (a > b) {
    	System.out.println("O maior numero é: " + a);
    } else if (b > a){
    	System.out.println("O maior numero é: " + b);
    } else {
    	System.out.println("Os numeros são iguais.");
    }
    
    sc.close();
		
	}

}
