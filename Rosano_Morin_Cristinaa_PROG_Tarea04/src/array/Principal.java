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

		/* Calcular el num total de puntos a usar */
		int NUM_PUNTOS_TRIANGULO = 3; /* Constante pq un triangulo 3 puntos */
		int puntosTotales = numTriangulosSolicitado
				* NUM_PUNTOS_TRIANGULO; /*
										 * Variable que calcula puntos total
										 * (ntriangulos*puntos
										 */

		int y = 0;// declara de manera global y se inicializa a cero se usa

		/* declaramos e incializamos el array de puntos */

		Punto miArrayPuntos[] = new Punto[puntosTotales];

		/*
		 * rellenamos array con objetos punto de la Clase Punto, haciendo uso de
		 * random, se calculan valores para los atributos (x, y). Se incorpora
		 * un sout para comprobar que se esta rellenando el array correctamente
		 */

		for (int i = 0; i < miArrayPuntos.length; i++) {
			miArrayPuntos[i] = new Punto((double) (Math.random() * 10), (double) (Math.random() * 10));

			System.out.println(
					" En la posicion " + i + " de mi array de puntos hay la siguiente info: " + miArrayPuntos[i]);

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
		 * 
		 * Se incluye un sout para comprobar que se imprimen los triangulos
		 */

		for (int i = 0; i < numTriangulosSolicitado; i++) {
			for (int z = 0; z < miArrayTriangulos.length; z++) {
				miArrayTriangulos[z] = new Triangulo(miArrayPuntos[i], miArrayPuntos[i + 1], miArrayPuntos[i + 2]);
				i = i + 3;// Contador de posiciones para el array de puntos.
				System.out.println("ver si imprime mi Triangulos" + miArrayTriangulos[z]);
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
				System.out.println(
						"Este es el perimetro de triangulo posicion " + z + " " + miArrayTriangulos[z].perimetro());
			}
			System.out.println("La suma de los perimetros" + sumPerimetro);

			/* Calcular el perimetro medio */
			perimetroMedio = sumPerimetro / miArrayTriangulos.length;

			/*
			 * Se imprime por pantalla el valor del perimetro medio de todos los
			 * triangulos
			 */

			System.out.println("El perimetro medio de todos los triangulos es: " + perimetroMedio);

//			/*
//			 * Cantidad de perimetros mayores y menores, para ello se vuelve a
//			 * usar mi arrayTriangulos para recorrerla y quedarme con los
//			 * perimetros mayores y mayores. Se declaran dos variables
//			 * inicializadas a cero que se comparan con perimetro medio
//			 */
//			int perimetrosMayores = 0;
//			int perimetrosMenores = 0;
//			/* Se recorre con un for la longitud del array */
//			for (int z = 0; z < miArrayTriangulos.length; z++) {
//				
//				/*
//				 * en cada vuelta de comprueba el perimetro que alberga cada una
//				 * de las posiciones del array
//				 */
//				if (miArrayTriangulos[z].perimetro() >= perimetroMedio) {
//					perimetrosMayores++;
//				} else {
//					perimetrosMenores++;
//				}
//			}
//
//			//
//			System.out.println("La cantidad de triangulos de perimetro mayor a la media son: " + perimetrosMayores);
//			System.out.println("La cantidad de triangulos de perimetro menor a la media son: " + perimetrosMenores);
//		}
//		System.out.println("El triangulo con un perimetro de mayor perimetro es " + miArrayTriangulos[y].perimetro());
		}
	}// f main
}// f class
