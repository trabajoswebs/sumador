package sumador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JMGRFunciona {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		String valor = "";
		String cadena = "";
		
		boolean correcto = true;
		
		do {
			
			try {
				System.out.println("Indique un valor númerico: ");
				valor = sc.nextLine();
				ASumar suma = new ASumar();
				cadena = suma.sumarCadena(valor);
				System.out.println(cadena);
			}catch(InputMismatchException e) {
				correcto = false;
				System.out.println("Ha ocurrido una excepción: " + e.getMessage());
			}
			
			
		}while(! correcto);
		
	}

}
