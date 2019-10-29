package es.upm.grise.profundizacion2019.ex1;

public class ClaseExamen {
	
	public float metodoAProbar(int a, int b) {
		
		float result = 0;
		
		// Nodo 1
		while( a > b) {
			// Nodo 2
			a--;
		}
		// Nodo 3
		if (a <= b) {
			// Nodo 4
			result = 0;
		}
		else {
			// Nodo 5
			result = b;
		}
		// Nodo 6
		return result;
	}

}
