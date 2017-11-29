package cadenas;

import utilidades.Entrada;

/**
 * 
 * @author crosanom
 * 
 *         Ejercicio 1 Realiza un programa que lea una palabra por teclado y
 *         determine si es una palabra panvocálica o no. Una palabra es
 *         panvocálica si contiene al menos las cinco vocales.
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {

		/*
		 * declaro e inicializo variables que se llaman Encontrada por cada una
		 * de las vocales
		 */

		boolean aEncontrada = false, eEncontrada = false, iEncontrada = false, oEncontrada = false, uEncontrada = false;

		boolean siCondicion = false;

		// inciamos el do while que itera hasta que se cumpla la condicion

		do {

			// primero solicitar la palabra por telclado

			System.out.println("Introduzca una palabra:");

			String palabra = Entrada.cadena();

			for (int i = 0; i < palabra.length(); i++) {

				// utilizar metodo charAt que devuelve el valor que toma la
				// posicion i y comprobamos que sea a, e, i, o, u

				switch (palabra.charAt(i)) {

				case 'a':
					aEncontrada = true;
					break;
				case 'e':
					eEncontrada = true;
					break;
				case 'i':
					iEncontrada = true;
					break;
				case 'o':
					oEncontrada = true;
					break;
				case 'u':
					uEncontrada = true;
					break;

				} // f switch

			} // f for

			// imprimimos mensaje que comprueba que ha encontrado la vocal

			System.out.println("¿Se ha encontrado la vocal a? " + aEncontrada);
			System.out.println("¿Se ha encontrado la vocal e? " + eEncontrada);
			System.out.println("¿Se ha encontrado la vocal i? " + iEncontrada);
			System.out.println("¿Se ha encontrado la vocal o? " + oEncontrada);
			System.out.println("¿Se ha encontrado la vocal u? " + uEncontrada);

			// se establece la condicion de palabra panvocalica 
			
			if (aEncontrada & eEncontrada & iEncontrada & oEncontrada & uEncontrada == true) {

				System.out.println("La palabra" + palabra + "es panvocalica");
				System.out.println("8-D");
				siCondicion = true; // modificar el valo de siCondicion para poder salir del bucle 

			} else {

				System.out.println("La palabra " + palabra
						+ "no es panvocalica, por favor introduzca una palabra que contenga todas las vocales, gracias");

			}

		} while (!siCondicion);

	}

}
