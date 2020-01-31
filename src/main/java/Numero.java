package main.java;

import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		int numero = 8;
		
		factorial(numero);

	}//MAIN
	
	public static void factorial(int num) {
		
		
		int fact = 1;
		
		
		for (int i=1; i <= num ; i++) {			
			fact = fact * i;	
		}
		System.out.println("El factorial de " + num + " es " + fact);
	}
		
}//CLASS


