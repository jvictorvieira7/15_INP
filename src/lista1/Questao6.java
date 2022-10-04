/* 6.	Criar um programa que leia o um número inteiro entre 1 e 7 e escreva o dia da semana correspondente. 
 Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe dia da semana com esse número. */



package lista1;

import java.util.Scanner;   
public class Questao6 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Informe um número de 1 a 7.");
		int num = s.nextInt();
		
		switch(num) {
		case 1: System.out.println("[1] É Domingo.");
				break;
		case 2: System.out.println("[2] É Segunda-feira.");
				break;
		case 3: System.out.println("[3] É Terça-feira.");
				break;
		case 4: System.out.println("[4] É Quarta-feira.");
				break;
		case 5: System.out.println("[5] É Quinta-feira.");
		 		break;
		case 6: System.out.println("[6] É Sexta-feira.");
				break;
		case 7: System.out.println("[7] É Sábado.");
				break;
		default: System.out.println("[" + num + "]" + " " + "Não é um Número e/ou Dia válido.");
				}
	
		s.close();
	}
}