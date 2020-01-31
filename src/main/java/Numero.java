
package main.java;



public class Numero {

	public static void main(String[] args) {
		int numero = 8;
		
		numeroPrimo(numero);

	}//MAIN
	
	public static void numeroPrimo(int num) {	        
	 
	        int contador = 0;
	 
	        for(int I = 1; I <= num; I++)
	        {
	            if((num % I) == 0)
	            {
	                contador++;
	            }
	        }
	 
	        if(contador <= 2)
	        {
	            System.out.println("El numero " + num + " es primo");
	        }else{
	            System.out.println("El numero "+ num + " no es primo");
	        }
	}
		
}//CLASS