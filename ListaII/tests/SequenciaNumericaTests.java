import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

//LISTA 2 - EXERCÍCIO 1

public class SequenciaNumericaTests {
	
	private static SequenciaNumerica sequenciaNumerica;
	
	@BeforeClass
	public static void Init(){
		sequenciaNumerica = new SequenciaNumerica();
		sequenciaNumerica.add(2);
		sequenciaNumerica.add(10);
		sequenciaNumerica.add(1);
		sequenciaNumerica.add(-1);
		sequenciaNumerica.add(4);
	}
	
	@Test
	public void MediaTest(){
		Assert.assertEquals(3.2, sequenciaNumerica.media(),0);
	}
	
	@Test
	public void MaxTest(){
		Assert.assertEquals(10,sequenciaNumerica.max(),0);
	}
	
	@Test
	public void MinTest(){
		Assert.assertEquals(-1,sequenciaNumerica.min(),0);
	}
	
}
