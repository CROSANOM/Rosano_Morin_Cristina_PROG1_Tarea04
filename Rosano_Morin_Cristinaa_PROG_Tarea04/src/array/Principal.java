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
		int numTriangulosSolicitado = Entrada.entero();

		// se calculan los puntos totales que vamos a necesitar, para ello
		// tenemos en cuenta que un triangulo siempre tiene 3 puntos
		// para saber el numero total se multiplica numTriangulos * 3

		int NUM_PUNTOS_TRIANGULO = 3; // es una constante porque siempre es 3
		int puntosTotales = numTriangulosSolicitado * NUM_PUNTOS_TRIANGULO;

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

			// rellenamos array con objetos punto aleatorios haciendo uso de
			// random //

			xAleatorio1 = Math.random() * 100;
			yAleatorio1 = Math.random() * 100;

			xAleatorio2 = Math.random() * 100;
			yAleatorio2 = Math.random() * 100;

			xAleatorio3 = Math.random() * 100;
			yAleatorio3 = Math.random() * 100;

			// se instancian tres objetos de la clase Punto que generan los
			// puntos de manera aleatoria

			Punto miPuntoAleatorio1 = new Punto(xAleatorio1, yAleatorio1);
			Punto miPuntoAleatorio2 = new Punto(xAleatorio2, yAleatorio2);
			Punto miPuntoAleatorio3 = new Punto(xAleatorio3, yAleatorio3);

		}

		// declara e incializa un array de triangulos

		Triangulo miArrayTriangulos[] = new Triangulo[numTriangulosSolicitado];

		int j = 0;// declara de manera global y se inicializa a cero

		// Leer los vertices para ir generando triangulos y calcular perimetros
		for (int i = 0; i < numTriangulosSolicitado; i++) {

			// Rellenamos el array triangulos moviendome en puntos para los
			// valores de vertices.
			miArrayTriangulos[i] = new Triangulo(miArrayPuntos[j], miArrayPuntos[j + 1], miArrayPuntos[j + 2]);
			// Contador de posiciones para el array de puntos.
			j = j + 3;

		}

		// calcular el perimetro usando metodo de Triangulo

		double perimetroMedio = 0;

		// Recorrer array de triangulos para calcular la suma de los perimetros.
		for (int i = 0; i < miArrayTriangulos.length; i++) {
			perimetroMedio = perimetroMedio + miArrayTriangulos[i].perimetro();
		}
		// Calcular perimetro medio.
		perimetroMedio = perimetroMedio / miArrayTriangulos.length;

		System.out.println("El perimetro medio de todos los triangulos es: " + perimetroMedio);

	}
}

// f main

// TODO Auto-generated method stub
