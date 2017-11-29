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

}// f class
