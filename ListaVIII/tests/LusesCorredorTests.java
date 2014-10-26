

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LusesCorredorTests {
	
	public LusesCorredor luses;
	
	@Test
	public void LusesCorredor3Test() {
		luses = new LusesCorredor(3);
		Boolean teste[] = {true, false, false};
		luses.passarPeloCorredor();
		Assert.assertArrayEquals(teste, luses.interruptores);
	}
	
	@Test
	public void LusesCorredor5Test() {
		luses = new LusesCorredor(5);
		Boolean teste[] = {true, false, false, true, false};
		luses.passarPeloCorredor();
		Assert.assertArrayEquals(teste, luses.interruptores);
	}
}
