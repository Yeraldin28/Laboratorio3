
package punto1;

public class Numero {

	// Se declaran los atributos de la clase
	int numero;

	// Se declara un m�todo constructor para inicializar el objeto
	Numero(int n) {
		numero = n;
	}

	// Se declara un m�todo para saber si es primo el n�mero del objeto
	boolean esPrimo() {
		int contador = 0;
		for (int i = 0; i < numero; i++) {
			if (i > 0 && numero % i == 0) {
				contador += 1;
			}
		}
		if (contador == 1) {
			return true;
		} else {
			return false;
		}
	}

}