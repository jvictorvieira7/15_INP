/* 9.	Escreva um programa para ler cinco valores inteiros, calcular a sua média, e escrever na tela os números que são superiores à média calculada. */


package lista1;

import java.util.Scanner;
public class Questao9 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
	
		System.out.println("Informe o valor 1.");
		double v1 = s.nextDouble();
		
		System.out.println("Informe o valor 2.");
		double v2 = s.nextDouble();
		
		System.out.println("Informe o valor 3.");
		double v3 = s.nextDouble();
		
		System.out.println("Informe o valor 4.");
		double v4 = s.nextDouble();
		
		System.out.println("Informe o valor 5.");
		double v5 = s.nextDouble();
		
		double media = ((v1 + v2 + v3 + v4 +v5) / 5);
		String msg = "";
		
		if (v1 > media)
			msg = msg + v1 + "  ";
		
		if (v2 > media)
			msg = msg + v2 + "  ";
			
		if (v3 > media)
			msg = msg + v3 + "  ";	
			
		if (v4 > media)
			msg = msg + v4 + "  ";
		
		if (v5 > media)
		msg = msg + v5 + "  ";
		
		
		System.out.println("A média é: " + media);
		System.out.println("Os números maiores que a média foram: " + msg);	
	
		s.close();
	}
}
