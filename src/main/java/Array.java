package main.java;

import java.util.Arrays;

public class Array {
	
	
	public static void main(String[] args) {
		int[]array = {5,4,8,6,3,2,9};
		
		System.out.println("El valor mínimo es: " + NumeroMin(array));
		mediana(array);
	}
	
	
	public static int NumeroMin(int []num){
		
		int min;
		min=num[0];
		for(int i = 0; i < num.length; i++){
			if(min>num[i]){
				min=num[i];
			}
		}
	
		return min;
	}
	
	public static void mediana(int []array) {
		 int mediana = array.length/2;
		 int total;
		 int total2;
		 Arrays.sort(array);
		 if(array.length %2 == 1) {
			 total = array[mediana];
			 System.out.println("La mediana es: "+total);
		 }else {
			 total2 = (array[mediana-1] + array[mediana])/2;
			 System.out.println("La mediana es:" +total2);
		 }
	}
	

}
