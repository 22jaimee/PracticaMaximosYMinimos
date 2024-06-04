package clases;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Maximos {
	
	
	public static float MaximoDe2EnterosPositivos(ArrayList<Float> notas) {
        verificarNotas(notas);
        return Collections.max(notas);
    }
	
	public static float MaximoDe3EnterosPositivos(ArrayList<Float> notas) {
        verificarNotas(notas);
        return Collections.max(notas);
    }
	
	
	private static void verificarNotas(ArrayList<Float> notas) {
        for (float nota : notas) {
            if (nota < 0) {
                throw new IllegalArgumentException("Todas las notas deben ser mayor que 0.");
            }
        }
    }

}
