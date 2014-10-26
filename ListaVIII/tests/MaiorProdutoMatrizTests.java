

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;


public class MaiorProdutoMatrizTests {
	
	private static MaiorProdutoMatriz mpm;
	
	@BeforeClass
	public static void init(){
		mpm = new MaiorProdutoMatriz();
		mpm.lerMatriz();
	}
	
	@Test
	public void verMaiorProdutoTest(){
		Assert.assertEquals(20, mpm.maiorProdutoMatriz(),0);
	}

}
