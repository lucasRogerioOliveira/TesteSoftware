
//LISTA 3 - EXERCÍCIO 1
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class NumeroFelizTests {

	@Test
	public void NumeroFelizTest(){
		assertTrue(NumeroFeliz.verificaNumeroFeliz(7));
	}
	
	@Test
	public void NumeroTrise(){
		assertTrue(!NumeroFeliz.verificaNumeroFeliz(48));
	}

}
