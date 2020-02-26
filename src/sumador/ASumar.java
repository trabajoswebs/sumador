package sumador;

/**
 * 
 * @author Johan manuel
 * @since 
 *
 */

public class ASumar {
	
	/**
	 * Convierte a integer la cadena que pasa por parametro y devuelve unacadena con la suma de cada uno de sus valores 
	 * @param String cadena
	 * @return String 
	 */
	
	 public static String sumarCadena(String cadena) {
	        int suma = 0;
	        String cad = "";
	        
	        if(cadena.charAt(0) == '-') return ""; // Si el valor es negativo
	        
	        if(cadena.length() == 1) return cadena + " = " + cadena; // Si solo se trata de un numero

	        for (int i = 0; i < cadena.length(); i++) { // Numero mayo a 9
	            // Cadena de un dígito.
	        	
	            String digito = cadena.substring(i, i + 1);
	            
	            if(i > 0) { // Contatena cada numero
	            	cad = cad + " + " + digito;
	            }else{
	            	cad = digito;
	            }
	            
	            suma = suma + Integer.parseInt(digito);
	        }
	        
	        return cad + " = " + suma;

	    }

}
