
package array;

import utilidades.Entrada;

/**
 * @author crosanom
 *
 */
public class Principal {

	public static void main(String[] args) {

		// solicitamos por teclado del número de triangulos

		System.out.println("Introduce el número de triangulos que necesitas:");
		int numTriangulosSolicitado = Entrada.entero();

		/* Calcular el num total de puntos a usar */
		int NUM_PUNTOS_TRIANGULO = 3; /* Constante pq un triangulo 3 puntos */
		int puntosTotales = numTriangulosSolicitado * NUM_PUNTOS_TRIANGULO; // variable
		int y = 0; // num
		// total
		// puntos

		/* declaramos e incializamos el array de puntos */

		Punto miArrayPuntos[] = new Punto[puntosTotales];

		/*
		 * Rellenamos array con objetos punto de la Clase Punto, haciendo uso de
		 * random, se calculan valores para los atributos (x, y).
		 */

		for (int i = 0; i < miArrayPuntos.length; i++) {
			miArrayPuntos[i] = new Punto((double) (Math.random() * 10), (double) (Math.random() * 10));

		}
		/* Primero se declara e inicializa un array de Triangulos */

		Triangulo miArrayTriangulos[] = new Triangulo[numTriangulosSolicitado];

		/*
		 * Se recorre con un for hasta el numero de triangulos solicitados
		 * rellenando a cada vuelta las posiciones del array de Triangulos con
		 * objetos de la Triangulo.
		 * 
		 * Se rellenan cada una de las posiciones del array Triangulos con los
		 * objetos de la clase Triangulo que alberga información del array de
		 * puntos, desde la posicion 0 a n posicion saltando de tres en tres,
		 * para ello aumentamos en 3 el contador
		 */

		for (int i = 0; i < numTriangulosSolicitado; i++) {
			for (int z = 0; z < miArrayTriangulos.length; z++) {
				miArrayTriangulos[z] = new Triangulo(miArrayPuntos[i], miArrayPuntos[i + 1], miArrayPuntos[i + 2]);
				i = i + 3;// Contador de posiciones para el array de puntos.
			}

			/* Calcular el perimetro de cada triangulo */
			double sumPerimetro = 0;// calcular sum de todos los perimetros
			double perimetroMedio = 0;

			/*
			 * Recorrer el array Triangulos con un for y rellenar cada posicion
			 * con la suma de perimetros, para ello se invoca al metodo
			 * perimetro de la clase Triangulo
			 */

			for (int z = 0; z < miArrayTriangulos.length; z++) {
				sumPerimetro += miArrayTriangulos[z].perimetro();
			}

			/* Calcular el perimetro medio */
			perimetroMedio = sumPerimetro / miArrayTriangulos.length;

			/*
			 * Se imprime por pantalla el valor del perimetro medio de todos los
			 * triangulos
			 */
			System.out.println("El perimetro medio de todos los triangulos es: " + perimetroMedio);

			/*
			 * Comprobar que triangulos tienen perimetros mayores y menores a la
			 * media, para ello se vuelve a usar mi arrayTriangulos para
			 * recorrerla y quedarme con los perimetros mayores y mayores. Se
			 * declaran dos variables inicializadas a cero que se comparan con
			 * perimetro medio
			 */
			int perimetrosMayores = 0;
			int perimetrosMenores = 0;

			/* Se recorre con un for la longitud del array */
			for (int z = 0; z < miArrayTriangulos.length; z++) {

				/*
				 * En cada vuelta de comprueba el perimetro que alberga cada una
				 * de las posiciones del array y si lee un perimetro albergado
				 * en la posicion z mayor que el perimetroMedio, aumenta en 1 el
				 * contador y los mismo ocurre con perimetros menores que
				 * promedio, aumentan el contador menor.
				 * 
				 * Muestra los triangulos de perimetro mayor y menor que la
				 * media
				 */

				if (miArrayTriangulos[z].perimetro() >= perimetroMedio) {
					perimetrosMayores++;
					System.out.println("El triangulo de mayorPerimetro" + miArrayTriangulos[z].getVerticeA()
							+ miArrayTriangulos[z].getVerticeB() + miArrayTriangulos[z].getVerticeC());
				} else {
					perimetrosMenores++;
					System.out.println("El triangulo de menorPerimetro" + miArrayTriangulos[z].getVerticeA()
							+ miArrayTriangulos[z].getVerticeB() + miArrayTriangulos[z].getVerticeC());
				}
			}

			/*
			 * Muestra la cantidad de triangulos que tiene un perimetro mayor a
			 * la media
			 */
			System.out.println("La cantidad de triangulos de perimetro mayor a la media: " + perimetrosMayores);
			/*
			 * Muestra la cantidad de triangulos que tiene un perimetro menor a
			 * la media
			 */
			System.out.println("La cantidad de triangulos de perimetro menor a la media: " + perimetrosMenores);
		}

	}// f main
}// f class
