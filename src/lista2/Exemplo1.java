package lista2;

import java.util.Scanner;

public class Exemplo1 {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		int soma = 0;
		System.out.println("Informe quantos números deseja informar para cálculo da média: ");
		int quant = s.nextInt();
		int maiorValor = Integer.MIN_VALUE;
		int menorValor = Integer.MAX_VALUE;
		
		for (int i = 1; i <= quant; i++) {
			System.out.println("Informe um valor para cálculo de média.");
			int valor = s.nextInt();			
			soma = soma + valor;
			if (valor > maiorValor)
				maiorValor = valor;
			if (valor < menorValor)
				menorValor = valor;	
      }
		System.out.println("A média é: " + (soma / quant));	
		System.out.println("O menor valor informado foi: " + menorValor);
		System.out.println("O maior valor informado foi: " + maiorValor);
		s.close();
	}
}
