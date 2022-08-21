
package punto4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NotaFinal {
	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA CALCULA LA NOTA FINAL DE UN ESTUDIANTE\n");

		// Se declara un pbjeto de tipo BufferedReader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se introduce en ciclo para que el usuario elija si quiere volver a usar el
		// programa
		int repetir;

		do {
			// Se declara un objeto de tipo estudiante
			Estudiante juan = new Estudiante(0, 0, 0);

			// Se piden los datos del objeto y se comprueba que est�n bien escritos
			System.out.print("\n\n\tIngresa la nota N�1: ");
			juan.nota1 = juan.bienEscrito(Double.parseDouble(in.readLine()));

			System.out.print("\n\n\tIngresa la nota N�2: ");
			juan.nota2 = juan.bienEscrito(Double.parseDouble(in.readLine()));

			System.out.print("\n\n\tIngresa la nota del examen final: ");
			juan.examenFinal = juan.bienEscrito(Double.parseDouble(in.readLine()));

			// Se declara el valor de la nota final
			juan.notaFinal = juan.notaFinal();

			// Dependiendo del valor de la nota final se muestra la salida por pantalla
			if (juan.notaFinal >= 45) {
				System.out.print("\n\n\t�Felicitaciones, Usted llegar� lejos, su nota final es: " + juan.notaFinal);
			} else if (juan.notaFinal >= 40) {
				System.out.print("\n\n\t�Puede hacerlo mejor, su nota final es: " + juan.notaFinal);
			} else if (juan.notaFinal >= 30) {
				System.out.print("\n\n\tDebe esforzarse m�s, su nota final es: " + juan.notaFinal);
			} else {
				System.out.print("\n\n\tDebe repetir la asignatura, su nota final es: " + juan.notaFinal);
			}

			// Se le pregunta al usuario si quiere volver a usar el programa
			System.out.print("\n\n\t�Quieres volver a usar el programa? \n\t1. Si\n\t2. No\n\tDecisi�n: ");
			repetir = Integer.parseInt(in.readLine());
			if (repetir < 1 || repetir > 2) {
				while (repetir < 1 || repetir > 2) {
					System.out.print("\n\n\tEscribe un n�mero que sea valido: ");
					repetir = Integer.parseInt(in.readLine());
				}
			}
		} while (repetir == 1);
		System.out.println("\n\n\t\tGRACIAS POR USAR ESTE PROGRAMA\n");

	}
}
