package felipe_brito_lista3;

import java.util.Scanner;

public class maiorNumero {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	
    int maior = Integer.MIN_VALUE;
    
    for (int i = 1; i <= 5; i++) {
    	System.out.println("Digite o " + i + "º número: ");
    	int numero = sc.nextInt();
    	
    	
    	if (numero > maior) {
    		maior = numero;
    	}
    }
    
    System.out.println("Maior número é: " + maior);
    
    sc.close();
    
    
	}

}
