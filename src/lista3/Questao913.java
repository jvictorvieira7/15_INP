package lista3;

import java.util.Scanner;

public class Questao913 {
	
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
	
		int popA = 5000000;
		int popB = 7000000;
		int cont = 0;
		
		
		while (popA <= popB) {
			popA += popA*0.03;
			popB += popB*0.02;
			
			cont++;
		}
	
	System.out.println("Levará " + cont + " anos para a população do país A, superar a população do país B.");
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		s.close();
}

}
