package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
	 public void testUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.sumarCadena("7");
        assertEquals("7 = 7",resultado );
    }
	
	@Test
	 public void testValorNegativo() {
       ASumar sumi = new ASumar();
       String resultado = sumi.sumarCadena("-74");
       assertEquals("",resultado );
   }
	
	@Test
	 public void testMayorQueNueve() {
      ASumar sumi = new ASumar();
      String resultado = sumi.sumarCadena("7423");
      assertEquals("7 + 4 + 2 + 3 = 16",resultado );
  }

}
