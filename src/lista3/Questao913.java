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
	
	System.out.println("Levar� " + cont + " anos para a popula��o do pa�s A, superar a popula��o do pa�s B.");
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		s.close();
}

}
