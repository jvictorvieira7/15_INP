package lista3;

import java.util.Scanner;

public class Questao9 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o primeiro termo para mostrar a série de FETUCCINE.");
		int termo1 = s.nextInt();
		
		
		System.out.println ("Informe o segundo termo para mostrar a série de FETUCCINE.");
		int termo2 = s.nextInt();
		int cont = 2;
		int indice = 3;
		int num = 0;
		
		System.out.print(termo1 + "; ");
		System.out.print(termo2 + "; ");
		
		while (cont < 20) {
	        
	     if (indice % 2 == 0) {
	    	num = termo1 - termo2;
	     System.out.print(num + "; ");
	     }
	     else {
	    	 num = termo1 + termo2;
	     System.out.print(num + "; ");
	     }	
	     
	     termo1 = termo2;
	     termo2 = num;
	     
	     	indice++;
			cont++;
		}
	
			
		s.close();
	}
}
