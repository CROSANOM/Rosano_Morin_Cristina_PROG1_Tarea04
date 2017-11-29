/**
 * 
 */
package array;

/**
 * @author crosanom version1.1
 */
/*
 * Ejericio 3: Se pretende utilizar el diagrama de clases anterior para crear un
 * programa que nos pida por teclado el n�mero de tri�ngulos a generar. Cree un
 * array de tri�ngulos del tama�o anteriormente introducido y cree cada
 * tri�ngulo con v�rtices generados aleatoriamente entre 0 y 100
 * (Math.random()*100). Una vez relleno el array lo recorrer� para calcular la
 * media de los per�metros de los tri�ngulos e informar� del per�metro medio.
 * Una vez hecho esto, volver� a recorrer el array para contar cu�ntos
 * tri�ngulos tienen un per�metro mayor o igual que el per�metro medio y cu�ntos
 * menor. Tambi�n deber� quedarse con el tri�ngulo de mayor per�metro y de menor
 * per�metro e informar de todo ello al usuario.
 * 
 */
public class Punto {

	/**
	 * atributos de la clase declaran privados
	 */
	private double x;
	private double y;
	

	
	// constructor por defecto
	public Punto() {

	}

	/**
	 * constructor con parametros x y
	 * 
	 * @param x
	 * @param y
	 */
	public Punto(double x, double y) {

		this.x = x;
		this.y = y;

	}

	/*
	 * se crean los m�todos get para poder acceder a los atributos
	 */

	/**
	 * @return the x
	 */
	protected double getX() {
		return x;
	}

	/**
	 * @return the y
	 */
	protected double getY() {
		return y;
	}

	/*
	 * se crea un m�todo toString
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	// crear metodo distancia

	/**
	 * 
	 * @param punto1
	 *            // un objeto de la clase Punto
	 * @param punto2
	 *            // un objeto de la clase Punto
	 * @return
	 */

	public static double distancia(Punto punto1, Punto punto2) {

		double distancia = 0;

		// calcular el cuadrado de la resta  coordenada x del punto 1 y el
		// punto2 //

		double resultadoPotenciaX = Math.pow((punto1.getX()) - (punto2.getX()), 2);
		// calcular el cuadrado de la resta  coordenada y del punto 1 y el
				// punto2 //
		double resultadoPotenciaY = Math.pow((punto1.getY()) - (punto2.getY()), 2);

		// return le pasamos la distancia que es la raiz cuadrada de la suma de
		// las potencias xy
		return distancia = Math.sqrt(resultadoPotenciaY + resultadoPotenciaX);

	}

}// f class
