package main.java;

public class Array {
	
	
	public static void main(String[] args) {
		int[]array = {5,4,8,6,3,2,9};
		
		System.out.println("El valor mínimo es: " + NumeroMin(array));
		
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

	

}
