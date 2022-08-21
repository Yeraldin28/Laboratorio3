

package punto2;

public class Numero {

	// Se declaran los atributos de la clase
	int numero;

	// Se declara un m�todo constructor para inicializar el objeto
	Numero(int n) {
		numero = n;
	}

	// Se declara un m�todo para saber si es par el n�mero del objeto
	boolean esPar() {
		if (numero % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}