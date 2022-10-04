/* 10.	Toda vez que um pescador traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de Santa Catarina (500 quilos)
 deve pagar uma multa de R$ 4,00 por quilo excedente.
 Faça um programa que leia o peso dos peixes trazidos por um pescador e verifique se há excesso.
 Se houver, o excesso e o valor da multa que deverá ser pago. Caso contrário mostrar uma mensagem que ele não há multa por excedente de peso. */


package lista1;

import java.util.Scanner;
import java.text.*;

public class Questao910 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("R$ ###,###,##0.00");
		
		System.out.println("Informe o peso do pescado: ");
		double peso = s.nextDouble();
		double multa = 4.00;
		
		if (peso <= 500)
			System.out.println("Não houve multa por excesso de peso.");
		else {
			double excesso = peso - 500;
			multa = multa * excesso;
			System.out.println("Houve excesso de " + excesso + " quilo/s.");
			System.out.println("Valor da multa: " + df.format(multa));
		}
		
		s.close();
	}
}
