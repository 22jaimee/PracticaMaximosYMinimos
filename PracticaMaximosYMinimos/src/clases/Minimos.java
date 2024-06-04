package clases;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Minimos {

	
	
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
