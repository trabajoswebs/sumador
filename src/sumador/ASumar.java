package sumador;

/**
 * 
 * @author Johan manuel
 * @since 
 *
 */

public class ASumar {
	
	 public static String sumar(String cadena) {
	        int suma = 0;
	        
	        if(cadena.charAt(0) == '-') return "";

	        for (int i = 0; i < cadena.length(); i++) {
	            // Cadena de un dígito.
	            String digito = cadena.substring(i, i + 1);
	            
	            suma = suma + Integer.parseInt(digito);
	        }
	        return cadena + " = " + suma;

	    }

}
