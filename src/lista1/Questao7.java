/* 7.	Construa um programa que determine (imprima) se um dado número N inteiro (lido através do teclado) é par ou ímpar. */


package lista1;


import java.util.Scanner;  
public class Questao7 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Informe um número inteiro positivo.");
		int num = s.nextInt();
	
		if (num % 2 == 0)
			System.out.println("O número é Par.");
		else
			System.out.println("O número é Impar.");	
				s.close();
	}
}
