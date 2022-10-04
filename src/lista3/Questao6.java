package lista3;


import java.util.Scanner;

public class Questao6 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe um valor para calcular a raiz quadrada.");
		int valor = s.nextInt();
		int raiz = 0;
	    int subImpar = 1;
	    
		while (valor > 0) {
			raiz++;
			valor = valor - subImpar;
			subImpar += 2;
			}
		
		if (valor == 0)
		System.out.println("Raiz exata: " + raiz);
		else 
			System.out.println("Raiz aproximada: " + raiz);
		
		s.close();	
	}
}