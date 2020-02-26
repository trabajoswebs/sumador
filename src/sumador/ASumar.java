package sumador;

/**
 * 
 * @author Johan manuel
 * @since 
 *
 */

public class ASumar {
	
	/**
	 * Muestra una concatenación de numeros de String 
	 * @param cad String cadena de numeros
	 * @return String en formato "numero = numero". Devuelve vacio si el numero es negativo
	 */
	public String mostrar(String cad) {
        String numero = cad;
        
        if(cad.charAt(0) == '-') return ""; //  Si la cadena contiene un valor negativo
        
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
		return numero;
	}

}
