/* 7.	Construa um programa que determine (imprima) se um dado n�mero N inteiro (lido atrav�s do teclado) � par ou �mpar. */


package lista1;


import java.util.Scanner;  
public class Questao7 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Informe um n�mero inteiro positivo.");
		int num = s.nextInt();
	
		if (num % 2 == 0)
			System.out.println("O n�mero � Par.");
		else
			System.out.println("O n�mero � Impar.");	
				s.close();
	}
}
