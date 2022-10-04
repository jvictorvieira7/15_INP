/* 5.	Criar um programa que informe a quantidade total de calorias de uma refeição 
 a partir do usuário que deverá informar o prato, a sobremesa e a bebida. Veja a tabela a seguir:
 
   Prato     | Calorias
 Vegetariano | 180 cal
   Peixe     | 230 cal
  Frango     | 250 cal
   Carne     | 350 cal
 
    Sobremesa    | Calorias
    Abacaxi      | 75 cal
  Sorvete diet   | 110 cal
   Mouse diet    | 170 cal
 Mouse chocolate | 200 cal
 
       Bebida      | Calorias
        Chá        | 20 cal
   Suco de laranja | 70 cal
   Suco de melão   | 100 cal
 Refrigerante diet | 65 cal
 
 */


package lista1;

import java.util.Scanner;                                                                                                                                                                                                                                                                                                           

public class Questao5 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		
		int totalCal = 0;
		
		System.out.println("Escolha o prato principal.");
		System.out.println("[1]Vegetariano  [2]Peixe  [3]Frango  [4]Carne  [5]Não obrigado.");
		
		int opt = s.nextInt();
	
		if (opt == 1)
			totalCal = 180;
		else
			if (opt == 2)
				totalCal += 230;
			else
				if (opt == 3)
					totalCal += 250;
				else
					if (opt == 4)
						totalCal += 350;
		
		
		System.out.println("Escolha a Sobremesa.");
		System.out.println("[1]Abacaxi  [2]Sorvete diet  [3]Mouse diet  [4]Mouse chocolate   [5]Não obrigado.");
		
		opt = s.nextInt();
		
		if (opt == 1)
			totalCal += 75;
		else
			if (opt == 2)
				totalCal += 110;
			else
				if (opt == 3)
					totalCal += 170;
				else
					if (opt == 4)
						totalCal += 200;
		
		
		System.out.println("Escolha a Bebida.");
		System.out.println("[1]Chá  [2]Suco de laranja  [3]Suco de melão  [4]Refrigerante diet  [5]Não obrigado.");
		
		opt = s.nextInt();
		
		if (opt == 1)
			totalCal += 20;
		else
			if (opt == 2)
				totalCal += 70;
			else
				if (opt == 3)
					totalCal += 100;
				else
					if (opt == 4)
						totalCal += 65;
		
		
		System.out.println("Sua refeição terá: " + totalCal + " cal");
		s.close();
				
	}
}


//switch(opt) {
//case 1: totalCal = 180;
//		break;
//case 2: totalCal += 230;
//		break;
//case 3: totalCal += 250;
//		break;
//case 4: totalCal += 350;
//		break;
//}
//
//




