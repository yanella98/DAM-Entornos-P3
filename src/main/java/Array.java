package main.java;

public class Array {
	
	public static String NumeroMax(int []array) {
		int mayor = array[0];
		String max;
		for(int i = 0; i < array.length; i++){
			if(mayor < array[i])
			{
				mayor = array[i];
			}
		}
		max = "El valor máximo es " + mayor;
		return max;
	}

	public static void main(String[] args) {
		int[]array = {5,4,8,6,3,2,9};
		System.out.println(NumeroMax(array));
		
	}

}
