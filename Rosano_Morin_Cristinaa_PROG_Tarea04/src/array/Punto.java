/**
 * 
 */
package array;

/**
 * @author crosanom version1.1
 */
/*
 * Ejericio 3: Se pretende utilizar el diagrama de clases anterior para crear un
 * programa que nos pida por teclado el número de triángulos a generar. Cree un
 * array de triángulos del tamaño anteriormente introducido y cree cada
 * triángulo con vértices generados aleatoriamente entre 0 y 100
 * (Math.random()*100). Una vez relleno el array lo recorrerá para calcular la
 * media de los perímetros de los triángulos e informará del perímetro medio.
 * Una vez hecho esto, volverá a recorrer el array para contar cuántos
 * triángulos tienen un perímetro mayor o igual que el perímetro medio y cuántos
 * menor. También deberá quedarse con el triángulo de mayor perímetro y de menor
 * perímetro e informar de todo ello al usuario.
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
	 * se crean los métodos get para poder acceder a los atributos
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
	 * se crea un método toString
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
