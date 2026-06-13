package felipe_brito_lista2;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite a primeira nota: ");
    double nota1 = sc.nextDouble();
    
    System.out.println("Digite a segunda nota: ");
    double nota2 = sc.nextDouble();
    
    double media = (nota1 + nota2) / 2;
		
    System.out.println("Media final: " + media);

    if (media >= 6) {
    	System.out.println("Aprovado");
    } else if (media >= 4) {
    	System.out.println("Recuperação");
    } else {
    	System.out.println("Reprovado");
    }
    
    sc.close();
    
	}

}
