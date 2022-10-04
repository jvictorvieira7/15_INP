package lista3;

import java.util.Scanner;

public class Questao7 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe um valor de 4 digitos para verificar: ");
		
		int valor = s.nextInt();
		
		while (valor >= 1000 && valor <= 9999) {
			int valor2 = valor / 100;
			int resto = valor % 100;
			int soma = valor2 + resto;
			double valor3 = Math.pow(soma, 2);
			
			if (valor3 == valor) {
				System.out.println("Valor possui a característica da questão.");
			    System.out.println(valor + " [" + valor2 + "]" + " [" + resto + "]");
			    System.out.println("Soma: " + soma);
			    System.out.println("Soma^2: " + valor3);
			}
			else
				System.out.println("Não possui a característica");
			
		
			valor = s.nextInt();
			
			
		}
	
		
		
		
		
		System.out.println("saiu");
		
		
		
		
		
	
s.close();
}
}