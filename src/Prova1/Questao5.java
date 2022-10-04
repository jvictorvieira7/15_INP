//Aluno: João Victor de Abreu Vieira

package Prova1;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bem-vindo. Insira os dados da sua receita de bala de banana.");
		
		int receita = 1;
		int bananaKg = 0;
		int sucoLimao = 0;
		int sugar = 0;
		int manteiga = 0;
				
		 while (receita == 1){
			 //Banana
			 System.out.println("Informe a quantidade de banana (branca ou caturra) utilizada em quilos: ");
	            bananaKg = s.nextInt();
			    if (bananaKg != 1) {
	                System.out.println("Receita incorreta!");
	                System.out.println("Deseja informar uma nova receitas?");
	                System.out.println("[1] Sim.   [2] Não.");
	                receita = s.nextInt();
	                continue; }
			 //Colheres de Suco de Limão
	         System.out.println("Informe a quantidade de colheres de suco de limão: ");
	            sucoLimao = s.nextInt();
	            if (sucoLimao < 2 || sucoLimao > 4) {
	                System.out.println("Receita incorreta!");
	                System.out.println("Deseja informar uma nova receitas?");
	                System.out.println("[1] Sim.   [2] Não.");
	                receita = s.nextInt();
	                continue; }
			 //Açucar
			 System.out.println("Informe a quantidade de açucar em gramas: ");
			 sugar = s.nextInt();
			 	if (sugar < 800 || sugar > 900) {
			 		System.out.println("Receita incorreta!");
	                System.out.println("Deseja informar uma nova receitas?");
	                System.out.println("[1] Sim.   [2] Não.");
	                receita = s.nextInt();
	                continue; }
			 //Manteiga
			 System.out.println("Informe a quantidade de manteiga para untar a forma, em gramas: ");
			 manteiga = s.nextInt();
			 	if (manteiga < 100 || manteiga > 120) {
			 		System.out.println("Receita incorreta!");
	                System.out.println("Deseja informar uma nova receitas?");
	                System.out.println("[1] Sim.   [2] Não.");
	                receita = s.nextInt();
	                continue; }
			 	
			 	System.out.println("Parabéns, receita correta!");
			 	System.out.println("Deseja informar uma nova receitas?");
                System.out.println("[1] Sim.   [2] Não.");
                receita = s.nextInt();
			 	
			 	}	
		 System.out.println("Programa encerrado.");
		 s.close();		 
		 }
		}
