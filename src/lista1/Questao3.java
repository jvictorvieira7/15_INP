/* 3.	A CEF conceder� um cr�dito especial com juros de 2% aos seus clientes de acordo com o saldo m�dio no �ltimo ano. 
  Fazer um programa que leia o saldo m�dio de um cliente e calcule o valor do cr�dito de acordo com a tabela a seguir. 
  Imprimir uma mensagem informando o saldo m�dio e o valor de cr�dito.
  De 0 a 500 = Nenhum cr�dito
  De 501 a 1000 = 30% do valor do saldo m�dio
  De 1001 a 3000 = 40% do valor do saldo m�dio
  Acima de 3001 = 50% do valor do saldo m�dio
 */


package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao3 {

	public static void main (String[] args) {
				
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("R$ ###,###,##0.00");
		
		System.out.println("Informe seu saldo m�dio para an�lise de cr�dito.");
		double saldo = s.nextDouble();
		double cred = 0;
		
		System.out.println("Seu saldo m�dio �: " + df.format(saldo));
		
		if (saldo >= 3001) {
			cred = saldo * 0.5;
			System.out.println("Seu cr�dito � de 50% do seu saldo m�dio: " + df.format(cred));
		}
			else
				if (saldo >= 1001) {
					cred = saldo * 0.4;
					System.out.println("Seu cr�dito � de 40% do seu saldo m�dio: " + df.format(cred));
				}
					else
						if (saldo >= 501) {
							cred = saldo * 0.3;
							System.out.println("Seu cr�dito � de 30% do seu saldo m�dio: " + df.format(cred));
						}
							else
							System.out.println("Sem direito de cr�dito");	
		
		System.out.println("FIM");
		s.close();
	}
}
