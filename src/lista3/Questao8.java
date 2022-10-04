package lista3;

import java.util.Scanner;

public class Questao8 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o termo para mostrar na série de FIBONACCI.");
		
		int ultimo = s.nextInt();
		int ant = 1;
		int antAnt = 0;
		int termo = 0;
		System.out.print("1 ");
		
		
		while (termo < ultimo) {
			
			termo = ant + antAnt;
			System.out.print(termo + " ");
			antAnt = ant;
			ant = termo;
		}
	
	s.close();
	}
}
