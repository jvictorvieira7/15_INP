/* 8.	Faça um programa que leia quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado,
 caso o valor da média escolar seja maior ou igual a 7.0. Se o valor da média for menor que 7.0, solicitar a nota de exame, 
 somar com o valor da média e obter nova média. Se a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o aluno foi aprovado em exame. 
 Se o aluno não foi aprovado, indicar uma mensagem informando esta condição. Apresentar junto com as mensagens o valor da média do aluno, para qualquer condição. */


package lista1;

import java.util.Scanner;
public class Questao8 {
	
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		System.out.println("Informe a nota 1: ");
		double nota1 = s.nextDouble();
		
		System.out.println("Informe a nota 2: ");
		double nota2 = s.nextDouble();
		
		System.out.println("Informe a nota 3: ");
		double nota3 = s.nextDouble();
		
		System.out.println("Informe a nota 4: ");
		double nota4 = s.nextDouble();
		
		double media = ((nota1 + nota2 + nota3 + nota4) / 4);
	
		if (media >= 7) {
			System.out.println("Média final do aluno: " + media);
			System.out.println("Aprovado!");
		}
				else {
					System.out.println("Média final do aluno: " + media + " Necessita fazer exame.");
					System.out.println("Necessita fazer exame.");
					System.out.println("Informe a nota do exame: ");
					double notaExame = s.nextDouble();
					media += notaExame;
					media = media / 2;
				}
						if (media >= 5) {
							System.out.println("Média final do aluno com exame: " + media);
							System.out.println("Aprovado com exame!");
						}
								else {
									System.out.println("Média final do aluno com exame: " + media);
									System.out.println("Reprovado!");
								}	
		s.close();
	}
}
