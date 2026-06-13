package felipe_brito_lista2;

import java.util.Scanner;

public class MaiorIdade {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Digite uma idade: ");
         int idade = sc.nextInt();
         
         if (idade >= 18) {
        	 System.out.println("Maior de idade");
         } else {
        	 System.out.println("Menor de idade");
         }
         
       sc.close();
       
	}

}
