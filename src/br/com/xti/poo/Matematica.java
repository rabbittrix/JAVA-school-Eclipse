package br.com.xti.poo;

public class Matematica {
	
	/**
	 * @author Roberto de Souza
	 * @param um
	 * @param dois
	 * @return o maior dos dois numeros
	 */
	int maior(int um, int dois) {
		if(um > dois) {
			return um;
		}else {
			return dois;
		}
		
	}
	/** Metodo com numero de argumentos definidos
	double soma(double um, double dois) {
		double s = um + dois;
		return s;
	}
	*/
	
	// Metodo com numero de argumentos indefinido
	double soma(double ... numeros) {
		double total = 0;
		for(double n : numeros) {
			total += n;
		}
		return total;
	}
	
	int raiz(int numero) {
		int raiz = 0, impar = 1;
		while(numero >= impar) {
			numero -= impar;
			impar += 2; // proximo numero impar
			++raiz;
		}
		return raiz;
	}

}
