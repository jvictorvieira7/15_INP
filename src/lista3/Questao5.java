package lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Questao5 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("R$ ####0.00");
		
	int cont = 0;
	
	int maiorCons = Integer.MIN_VALUE;
	int menorCons = Integer.MAX_VALUE;
	int totalResid = 0;
	int totalComerc = 0;
	int totalIndust = 0;
	
	System.out.println("Informe o preço do kW/h: ");
	double valorEnergy = s.nextDouble();
	
	
	System.out.println("Informe o numero do consumidor. [X] Terminar.");
	String num = s.next();
	
	while (!num.equalsIgnoreCase("X")) {
		cont++;
		//Aqui vai ser computado mais um consumidor
		System.out.println(" Informe o tipo do consumidor: ");
		System.out.println("[1] Resid,  [2] Comerc,  [3] Indust");
		int tipo = s.nextInt();
		
		System.out.println("Informe a energia consumida em kW: ");
		int consumoEnergy = s.nextInt();
		
		double custoEnergy = valorEnergy * consumoEnergy;
		System.out.println("Total a ser pago: " + df.format(custoEnergy));
		
		switch (tipo) {
		case 1: totalResid += consumoEnergy; break;
		case 2: totalComerc += consumoEnergy; break;
		case 3: totalIndust += consumoEnergy; break;
		}
		
		if (consumoEnergy > maiorCons)
			maiorCons = consumoEnergy;
		if (consumoEnergy < menorCons) 
			menorCons = consumoEnergy;
		
		System.out.println("Informe o numero do consumidor.; [X] Terminar.");
		num = s.next();
	}
		
	//Aqui vamos imprimir os valores totais.
	
	System.out.println("Maior consumo informado: " + maiorCons + " kW.");
	System.out.println("Menor consumo informado: " + menorCons + " kW.");
	System.out.println("Total consumo Residencial: " + totalResid + " kW.");
	System.out.println("Total consumo Comercial: " + totalComerc + " kW.");
	System.out.println("Total consumo Industrial: " + totalIndust + " kW.");
	int mediaGeral = (totalResid + totalComerc + totalIndust) / cont;
	System.out.println("Media geral de consumo: " + mediaGeral + " kW.");
	
	
	s.close();
	
	}
}