package felipe_brito_lista4;

import java.util.Scanner;

public class BuscaElemento {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 int[] v = new int[10];
		 
		 boolean achou = false;
		 for (int i = 0; i < v.length; i++) {
		 v[i] = sc.nextInt();
		 }
		 int x = sc.nextInt();
		 for (int i = 0; i < v.length; i++) {
		 if (v[i] == x) {
		 achou = true;
		 }
		 }
		 System.out.println(achou);
		 sc.close();
		
	}

}
