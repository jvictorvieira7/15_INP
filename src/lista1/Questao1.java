/* 1.	Escreva um programa que leia um n�mero e informe se ele � divis�vel por 10, por 5 ou por 2 ou se n�o � divis�vel por nenhum deles. */


package lista1;

import java.util.Scanner;
public class Questao1 {
		    public static void main(String args[]) {
	        Scanner teclado = new Scanner (System.in);
	        String msg = "";
	     System.out.println ("Este programa informa se o n�mero inserido � divisiv�l por 2, 5 ou 10.");
	     System.out.println ("Informe um valor inteiro qualquer.");
	     int valor = teclado.nextInt();
	     int resto = valor % 2;
	     if (resto == 0) {
	         msg = ("Divis�vel por 2.");
	     }
	     resto = valor % 5;
	     if (resto == 0) {
	         msg = msg + (" ") + ("Divis�vel por 5.");
	    }
	    resto = valor % 10;
	    if (resto == 0) {
	        msg = msg + (" ") + ("Divis�vel por 10.");
	    }
	    if (msg.equals ("")) {
	    System.out.println ("N�o � divis�vel por ningu�m");
	    }
	        else {
	    System.out.println (msg);
	    }
	        teclado.close();
	        }
	     
	    }
