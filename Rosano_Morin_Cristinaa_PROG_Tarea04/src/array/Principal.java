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

		int NUM_PUNTOS_TRIANGULO = 3; /*Constante pq un triangulo 3 puntos*/
		int puntosTotales = numTriangulosSolicitado
				* NUM_PUNTOS_TRIANGULO; /*
										 * Variable que calcula puntos total
										 * (ntriangulos*puntos
										 */
		double xAleatorio1 = 0;
		double yAleatorio1 = 0;
		double xAleatorio2 = 0;
		double yAleatorio2 = 0;
		double xAleatorio3 = 0;
		double yAleatorio3 = 0;

		// declaramos e incializamos el array de puntos

		Punto miArrayPuntos[] = new Punto[puntosTotales];

		/*
		 * rellenamos array con objetos punto de la Clase Punto, aleatorios
		 * haciendo uso de random, se calculan valores para x, y )
		 */



		for (   int i= 0; i < miArrayPuntos.length; i++) {
			miArrayPuntos[i] = new Punto((double) (Math.random() * 10), (double) (Math.random() * 10));
			
			System.out.println("Mi Array de Puntos  en la posicion " + i + " guarda " + miArrayPuntos[i]);;// imprime array de puntos
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

		// Imprime por pantalla la informacion del perimetro medio
		System.out.println("El perimetro medio de todos los triangulos es: " + perimetroMedio);

		/*
		 * Cantidad de perimetros mayores y menores, para ello se vuelve a usar
		 * mi arrayTriangulos para recorrerla y quedarme con los perimetros
		 * mayores y mayores
		 */
		int perimetrosMayores = 0;
		int perimetrosMenores = 0;

		for (int i = 0; i < miArrayTriangulos.length; i++) {

			if (miArrayTriangulos[i].perimetro() >= perimetroMedio) {
				perimetrosMayores++;
			} else {
				perimetrosMenores++;
			}
		}

		//
		System.out.println("La cantidad de triangulos de perimetro mayor a la media son: " + perimetrosMayores);
		System.out.println("La cantidad de triangulos de perimetro menor a la media son: " + perimetrosMenores);

		System.out.println("El triangulo con un perimetro de mayor perimetro es " + miArrayTriangulos[j].perimetro());

	}// f main
}// f class
