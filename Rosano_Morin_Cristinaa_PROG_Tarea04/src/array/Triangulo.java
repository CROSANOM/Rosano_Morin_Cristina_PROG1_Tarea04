package array;

/**
 * 
 * @author crosanom
 *
 */

public class Triangulo {
	/**
	 * atributos de la clase Triangulo son de tipo Punto
	 */
	private Punto verticeA;
	private Punto verticeB;
	private Punto verticeC;

	// constructor por defecto
	public Triangulo() {

	}

	/**
	 * Forman parte de la clase Punto asi se indica en el diagrama
	 * 
	 * @param verticeA
	 * @param verticeB
	 * @param verticeC
	 */

	public Triangulo(Punto verticeA, Punto verticeB, Punto verticeC) {

		this.verticeA = verticeA;
		this.verticeB = verticeB;
		this.verticeC = verticeC;

	}

	// se crean con ayuda del IDE los get 
	/**
	 * @return the verticeA
	 */
	protected Punto getVerticeA() {
		return verticeA;
	}

	/**
	 * @return the verticeB
	 */
	protected Punto getVerticeB() {
		return verticeB;
	}

	/**
	 * @return the verticeC
	 */
	protected Punto getVerticeC() {
		return verticeC;
	}

}// f class
