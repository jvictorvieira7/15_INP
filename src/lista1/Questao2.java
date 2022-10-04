/* 2.	Construa um programa para determinar se o indivíduo esta com um peso favorável. 
 Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida como sendo a relação entre o peso (PESO) e o quadrado da Altura (ALTURA) do indivíduo. 
 Ou seja, e, a situação do peso é determinada pela formula: imc = peso/altura2 .  Já a tabela de referência de pesos é dada conforme abaixo: 
 IMC abaixo de 20 = Abaixo do Peso
 IMC de 20 até 25 = Peso Normal
 IMC de 25 até 30 = Sobre Peso
 IMC de 30 até 40 = Obeso
 IMC de 40 e acima = Obeso Mórbido
  */


package lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao2 {

	public static void main (String [] args) {
		Scanner s = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("##0.0");
		
		System.out.println("Informe o seu peso.");
		double peso = s.nextDouble();
		
		System.out.println("Informe a sua altura.");
		double altura = s.nextDouble();
		
		double imc = peso / (Math.pow(altura, 2));
		
		System.out.println("O seu IMC é = " + df.format(imc));
		
	
		if (imc > 40)
			System.out.println("Obesidade mórbida");
		else
			if (imc >= 31)
				System.out.println("Obesidade.");
			else
				if (imc >= 26)
					System.out.println("Sobrepeso.");
				else
					if (imc >= 21)
						System.out.println("Peso normal.");
					else
						System.out.println("Abaixo do peso.");
		
		System.out.println("FIM");	
		s.close();
	}	
}
