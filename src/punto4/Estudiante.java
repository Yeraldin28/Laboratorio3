

package punto4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Estudiante {

	// Se declaran los atributos de la clase
	double nota1;
	double nota2;
	double examenFinal;
	double notaFinal;

	// Se declara un m�todo constructor para inicializar el objeto
	Estudiante(int n1, int n2, int n3) {
		nota1 = n1;
		nota2 = n2;
		examenFinal = n3;
	}

	// Se declara un objeto de tipo BufferedReader
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	// M�todo para comprobar las condiciones dadas
	double bienEscrito(double n) throws NumberFormatException, IOException {
		if (n < 0 || n > 50) {
			while (n < 0 || n > 50) {
				System.out.print("\n\n\tEscribe un n�mero que este entre 0 y 50: ");
				n = Double.parseDouble(in.readLine());
			}
		}
		return n;
	}

	// M�todo para calcular la nota final
	double notaFinal() {
		notaFinal = Math.round(((nota1 * 0.3) + (nota2 * 0.3) + (examenFinal * 0.4)) * 1000) / 1000;
		return notaFinal;
	}

}