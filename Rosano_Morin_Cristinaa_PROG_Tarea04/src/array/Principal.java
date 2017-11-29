/**
 * 
 */
package array;

import utilidades.Entrada;

/**
 * @author crosanom
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// solicitamos por teclado del número de triangulos
		System.out.println("Introduce el número de triangulos que necesitas:");
		int numTriangulos = Entrada.entero();

		// se calculan los puntos totales que vamos a necesitar, para ello
		// tenemos en cuenta que un triangulo siempre tiene 3 puntos
		// para saber el numero total se multiplica numTriangulos * 3

		int NUMPUNTOS_TRIANGULO = 3; // es una constante porque siempre es 3
		int puntosTotales = numTriangulos * NUMPUNTOS_TRIANGULO;

		// declaramos e incializamos el array de puntos

		Punto miArrayPuntos[] = new Punto[puntosTotales];

	}// f main

	// TODO Auto-generated method stub

}
