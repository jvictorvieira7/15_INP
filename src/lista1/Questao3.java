/* 3.	A CEF concederá um crédito especial com juros de 2% aos seus clientes de acordo com o saldo médio no último ano. 
  Fazer um programa que leia o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela a seguir. 
  Imprimir uma mensagem informando o saldo médio e o valor de crédito.
  De 0 a 500 = Nenhum crédito
  De 501 a 1000 = 30% do valor do saldo médio
  De 1001 a 3000 = 40% do valor do saldo médio
  Acima de 3001 = 50% do valor do saldo médio
 */


package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao3 {

	public static void main (String[] args) {
				
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("R$ ###,###,##0.00");
		
		System.out.println("Informe seu saldo médio para análise de crédito.");
		double saldo = s.nextDouble();
		double cred = 0;
		
		System.out.println("Seu saldo médio é: " + df.format(saldo));
		
		if (saldo >= 3001) {
			cred = saldo * 0.5;
			System.out.println("Seu crédito é de 50% do seu saldo médio: " + df.format(cred));
		}
			else
				if (saldo >= 1001) {
					cred = saldo * 0.4;
					System.out.println("Seu crédito é de 40% do seu saldo médio: " + df.format(cred));
				}
					else
						if (saldo >= 501) {
							cred = saldo * 0.3;
							System.out.println("Seu crédito é de 30% do seu saldo médio: " + df.format(cred));
						}
							else
							System.out.println("Sem direito de crédito");	
		
		System.out.println("FIM");
		s.close();
	}
}
