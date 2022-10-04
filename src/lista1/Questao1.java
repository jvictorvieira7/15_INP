/* 1.	Escreva um programa que leia um número e informe se ele é divisível por 10, por 5 ou por 2 ou se não é divisível por nenhum deles. */


package lista1;

import java.util.Scanner;
public class Questao1 {
		    public static void main(String args[]) {
	        Scanner teclado = new Scanner (System.in);
	        String msg = "";
	     System.out.println ("Este programa informa se o número inserido é divisivél por 2, 5 ou 10.");
	     System.out.println ("Informe um valor inteiro qualquer.");
	     int valor = teclado.nextInt();
	     int resto = valor % 2;
	     if (resto == 0) {
	         msg = ("Divisível por 2.");
	     }
	     resto = valor % 5;
	     if (resto == 0) {
	         msg = msg + (" ") + ("Divisível por 5.");
	    }
	    resto = valor % 10;
	    if (resto == 0) {
	        msg = msg + (" ") + ("Divisível por 10.");
	    }
	    if (msg.equals ("")) {
	    System.out.println ("Não é divisível por ninguém");
	    }
	        else {
	    System.out.println (msg);
	    }
	        teclado.close();
	        }
	     
	    }
