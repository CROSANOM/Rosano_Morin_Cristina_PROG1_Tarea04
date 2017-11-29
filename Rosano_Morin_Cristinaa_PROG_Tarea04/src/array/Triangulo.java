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

	/*
	 * (non-Javadoc) Usando atajo del IDE - source/ generate. Hacemos uso del
	 * metodo de get para devolver el valor de xy de cada vertice
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Triangulo [verticeA=" + verticeA + " " + verticeA.getX() + verticeA.getY() + "  " + ", verticeB="
				+ verticeB + verticeB.getX() + verticeB.getY() + ", verticeC=" + verticeC + verticeC.getX()
				+ verticeC.getY() + "]";
	}

	// crea un metodo perimetro que devuelve perimetro doibel

	public double perimetro() {

		double resultadoPerimetro = 0;

		double distanciaAB = Punto.distancia(verticeA, verticeB);
		double distanciaAC = Punto.distancia(verticeA, verticeC);
		double distanciaCB = Punto.distancia(verticeC, verticeB);

		resultadoPerimetro = distanciaAB + distanciaAC + distanciaCB;

		return resultadoPerimetro;

	}

}// f class
