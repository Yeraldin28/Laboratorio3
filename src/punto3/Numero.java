

package punto3;

public class Numero {

	// Se declaran los atributos de la clase
	int numero;

	// Se declara un m�todo constructor para inicializar el objeto
	Numero(int n) {
		numero = n;
	}

	// Se declara un m�todo para saber si los divisores del n�mero
	void imprimirDivisores() {
		int contador = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				System.out.print(i + " ");
				contador++;
			}
		}
		if (contador == 0) {
			System.out.print("El n�mero no tiene divisores");
		}
	}

}