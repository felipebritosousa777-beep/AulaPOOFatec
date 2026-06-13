package felipe_brito_lista2;

import java.util.Scanner;

public class MaiorTresNumeros {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite o primeiro numero: ");
    int a = sc.nextInt();
    
    System.out.println("Digite o segundo numero: ");
    int b = sc.nextInt();
    
    System.out.println("Digite o terceiro numero: ");
    int c = sc.nextInt();
    
    int maior = a;
    
    if (b > maior) {
    	maior = b;
    }
    
    if (c > maior) {
    	maior = c;
    }
    
    System.out.println("O maior Numero é: " + maior);
    
    sc.close();
    
	}

}
