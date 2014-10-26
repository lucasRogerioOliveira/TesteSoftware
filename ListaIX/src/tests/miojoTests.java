package tests;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.Miojo;


public class miojoTests {
	
	private Miojo miojo;
	
	@Before
	public void createVariable(){
		miojo = new Miojo();
	}
	
	
	@Test
	public void prepararMiojoPossivelTest(){
		assertEquals(10, miojo.prepararMiojo(3, 5, 7));
	}
	
	@Test
	public void prepararMiojoPossivel2Test(){
		assertEquals(17, miojo.prepararMiojo(4, 5, 7));
	}
	
	@Test
	public void prepararMiojoPossivel3Test(){
		assertEquals(55, miojo.prepararMiojo(5, 7, 10));
	}
	
	
	/*************************
	 * CAMINHO INFELIZ
	 *************************/

	@Test
	public void prepararMiojoImpossivelComLoopDeMenorValorTest(){
		assertEquals(-1, miojo.prepararMiojo(5, 6, 15));
	}
	
	@Test (expected = RuntimeException.class)
	public void ValorIgualAmpulheta(){
		miojo.prepararMiojo(3, 3, 7);
	}
	
	@Test (expected = RuntimeException.class)
	public void ValorMaiorQueAmpulheta(){
		miojo.prepararMiojo(4, 3, 7);
	}
	
}
