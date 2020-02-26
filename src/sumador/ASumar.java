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
	        String cad = "";
	        
	        if(cadena.charAt(0) == '-') return ""; // Si el valor es negativo
	        if(cadena.length() == 1) return cadena + " = " + cadena;

	        for (int i = 0; i < cadena.length(); i++) {
	            // Cadena de un dígito.
	        	
	            String digito = cadena.substring(i, i + 1);
	            
	            if(i > 0) {
	            	cad = cad + " + " + digito;
	            }else{
	            	cad = digito;
	            }
	            
	            
	            
	            suma = suma + Integer.parseInt(digito);
	        }
	        
	        return cad + " = " + suma;

	    }

}
