package sumador;

/**
 * 
 * @author Johan manuel
 * @since 
 *
 */

public class ASumar {
	
	/**
	 * Muestra una concatenación de numeros de String "numero = numero"
	 * @param cad String cadena de numeros
	 * @return String 
	 */
	public String mostrar(String cad) {
        String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
		return numero;
	}

}
