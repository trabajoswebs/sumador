package sumador;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestASumar {

	@Test
	 public void testUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("7");
        assertEquals("7 = 7",resultado );
    }
	
	@Test
	 public void testValorNegativo() {
       ASumar sumi = new ASumar();
       String resultado = sumi.mostrar("-74");
       assertEquals("",resultado );
   }

}
