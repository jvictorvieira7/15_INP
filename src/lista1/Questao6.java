/* 6.	Criar um programa que leia o um n�mero inteiro entre 1 e 7 e escreva o dia da semana correspondente. 
 Caso o usu�rio digite um n�mero fora desse intervalo, dever� aparecer uma mensagem informando que n�o existe dia da semana com esse n�mero. */



package lista1;

import java.util.Scanner;   
public class Questao6 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Informe um n�mero de 1 a 7.");
		int num = s.nextInt();
		
		switch(num) {
		case 1: System.out.println("[1] � Domingo.");
				break;
		case 2: System.out.println("[2] � Segunda-feira.");
				break;
		case 3: System.out.println("[3] � Ter�a-feira.");
				break;
		case 4: System.out.println("[4] � Quarta-feira.");
				break;
		case 5: System.out.println("[5] � Quinta-feira.");
		 		break;
		case 6: System.out.println("[6] � Sexta-feira.");
				break;
		case 7: System.out.println("[7] � S�bado.");
				break;
		default: System.out.println("[" + num + "]" + " " + "N�o � um N�mero e/ou Dia v�lido.");
				}
	
		s.close();
	}
}