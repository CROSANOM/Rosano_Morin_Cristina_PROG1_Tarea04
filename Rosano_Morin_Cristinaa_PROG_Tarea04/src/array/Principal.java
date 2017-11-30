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

		int NUM_PUNTOS_TRIANGULO = 3; // es una constante porque siempre es 3
		int puntosTotales = numTriangulos * NUM_PUNTOS_TRIANGULO;

		double xAleatorio1 = 0;
		double yAleatorio1 = 0;
		double xAleatorio2 = 0;
		double yAleatorio2 = 0;
		double xAleatorio3 = 0;
		double yAleatorio3 = 0;

		// declaramos e incializamos el array de puntos

		Punto miArrayPuntos[] = new Punto[puntosTotales];

		// generamos los puntos aleatorios

		for (int i = 0; i < miArrayPuntos.length; i++) {

			// rellenamos array con objetos punto aleatorios //

			xAleatorio1 = Math.random() * 100;
			yAleatorio1 = Math.random() * 100;

			xAleatorio2 = Math.random() * 100;
			yAleatorio2 = Math.random() * 100;

			xAleatorio3 = Math.random() * 100;
			yAleatorio3 = Math.random() * 100;
 
			// se instancian tres objetos de la clase Punto que generan los puntos de manera aleatoria
			
			Punto miPuntoAleatorio1 = new Punto(xAleatorio1, yAleatorio1);
			Punto miPuntoAleatorio2 = new Punto(xAleatorio2, yAleatorio2);
			Punto miPuntoAleatorio3 = new Punto(xAleatorio3, yAleatorio3);
			
			// Genera un array de triangulos 
			
			
		}

	}// f main

	// TODO Auto-generated method stub

}
