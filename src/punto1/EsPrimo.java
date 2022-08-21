
package punto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class EsPrimo {
	public static void main(String arg[]) throws IOException {

		System.out.print("\n\n\tESTE PROGRAMA COMPRUEBA SI UN N�MERO ES PRIMO\n");

		// Se declara un pbjeto de tipo BufferedReader
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		// Se introduce en ciclo para que el usuario elija si quiere volver a usar el
		// programa
		int repetir;

		do {
			// Se declara un objeto de tipo n�mero y se piden sus respectivos datos
			Numero numeroAComprobar = new Numero(0);

			System.out.print("\n\n\tIngresa el n�mero a comprobar: ");
			numeroAComprobar.numero = Integer.parseInt(in.readLine());

			// Se comprueba que el n�mero no sea menor que 0
			if (numeroAComprobar.numero < 0) {
				while (numeroAComprobar.numero < 0) {
					System.out.print("\n\n\tEscribe un n�mero mayor que cero: ");
					numeroAComprobar.numero = Integer.parseInt(in.readLine());
				}
			}

			// Se muestra un mensaje dependiendo del valor que retorne el m�todo esPrimo()
			if (numeroAComprobar.esPrimo()) {
				System.out.print("\n\tEl n�mero " + numeroAComprobar.numero + " es primo");
			} else {
				System.out.print("\n\tEl n�mero " + numeroAComprobar.numero + " no es primo");
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
