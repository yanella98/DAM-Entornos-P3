package main.java;

public class Cadena {
	public static String tipo(String texto) {
		String tipo;
		tipo = "El nombre en min�scula es: "+texto.toLowerCase()+
			   "\nEl nombre en may�sculas es: "+texto.toUpperCase();
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
