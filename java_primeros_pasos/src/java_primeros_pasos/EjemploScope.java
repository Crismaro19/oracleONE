package java_primeros_pasos;

public class EjemploScope {

	public static void main(String[] args) {
		System.out.println("Hola mundo");

		int edad = 21;
		int cantidadPersonas = 2;// esta variable hace referencia a la cantidad de personas

		boolean esPareja = false; 
		if (cantidadPersonas > 1) {
			esPareja= true;
		}
		boolean puedeEntrar = edad >= 18 && esPareja;

		System.out.println("el valor de la condición es " + esPareja);
		if (puedeEntrar) {
			System.out.println("usted puede entrar");
		}

		else
			System.out.println("Usted no tiene permiso de entrar");
	}

}
