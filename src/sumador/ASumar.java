package sumador;

public class ASumar {
	
	/**
	 * Muestra una concatenación de numeros de String "numero = numero"
	 * @param cad String cadena de numeros
	 * @return
	 */
	public String mostrar(String cad) {
        String numero = cad;
        if (numero.length() == 1) {
            return (numero + " = " + numero);
        }
		return numero;
	}

}
