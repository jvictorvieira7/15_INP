/* 4.	Crie um programa que leia a idade de uma pessoa e informe a sua classe eleitoral:  
�	n�o eleitor (abaixo de 16 anos);
�	eleitor obrigat�rio (entre a faixa de 18 e at� 65 anos);
�	eleitor facultativo (de 16 at� 17 anos e maior de 65 anos, inclusive)
*/


package lista1;

import java.util.Scanner;
public class Questao4 {
	 public static void main(String args[]) {
	        Scanner teclado = new Scanner (System.in);
	            
	        System.out.println("Informe a sua idade, para saber sua classe eleitoral.");
	        int idade = teclado.nextInt();
	        
	        if (idade < 16)
	        	System.out.println("N�o � eleitor.");
	        	else
	        		if (idade >= 18 && idade <= 65)
	        			System.out.println("Eleitor obrigat�rio.");
	        			else
	        				System.out.println("� eleitor facultativo.");
	        
	        teclado.close();     	
	
	
	 }
}
