
//LISTA 3 - EXERC�CIO 1
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
