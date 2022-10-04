/* 2.	Construa um programa para determinar se o indiv�duo esta com um peso favor�vel. 
 Essa situa��o � determinada atrav�s do IMC (�ndice de Massa Corp�rea), que � definida como sendo a rela��o entre o peso (PESO) e o quadrado da Altura (ALTURA) do indiv�duo. 
 Ou seja, e, a situa��o do peso � determinada pela formula: imc = peso/altura2 .  J� a tabela de refer�ncia de pesos � dada conforme abaixo: 
 IMC abaixo de 20 = Abaixo do Peso
 IMC de 20 at� 25 = Peso Normal
 IMC de 25 at� 30 = Sobre Peso
 IMC de 30 at� 40 = Obeso
 IMC de 40 e acima = Obeso M�rbido
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
		
		System.out.println("O seu IMC � = " + df.format(imc));
		
	
		if (imc > 40)
			System.out.println("Obesidade m�rbida");
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
