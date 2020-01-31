package main.java;

public class Cadena {
	public static String tipo(String texto) {
		String tipo;
		tipo = "El nombre en minúscula es: "+texto.toLowerCase()+
			   "\nEl nombre en mayúsculas es: "+texto.toUpperCase();
		return tipo;
	}
	public static String LongitudNumero(String texto) {
		String longitud;
		longitud = "La longitud del "+texto+" es "+texto.length();
		return longitud;
	}
	public static void main(java.lang.String[] args) {
		String nombre = "programacion";
		System.out.println(LongitudNumero(nombre));
		System.out.println(tipo(nombre));
	}

}
