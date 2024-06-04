package clases;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Minimos {

	/**
	 * Metodo para devorlver el valor maximos de 2 valores
	 * @param a
	 * @param b
	 * @return el valor maximo entre 2 valores
	 */
	
	public static float MinimoDe2EnterosPositivos(int a, int b) {
		if(a<0 || b<0) {
			throw new IllegalArgumentException("Todas las notas deben ser mayor que 0.");
		}
		if(a<b) {
			return a;
		}
		else {
			return b;
		}
    }
	
	/**
	 * Metodo para devorlver el valor maximos de 3 valores
	 * @param a
	 * @param b
	 * @param c
	 * @return devuelve el valor maximo entre 3 valores
	 */
	
	public static float MinimoDe3EnterosPositivos(int a, int b, int c) {
		if(a<0 || b<0 || c<0) {
			throw new IllegalArgumentException("Todas las notas deben ser mayor que 0.");
		}
		if(a<b || a<c) {
			return a;
		}
		else if(b<a || b<c) {
			return b;
		}
		else{
			return c;
		}
    }
}
