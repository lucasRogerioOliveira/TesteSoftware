
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import Exceptions.CaracteresInvalidosException;
import Exceptions.TamanhoCpfInvalidoException;


public class ValidadorCpfTests {
	
	private static ValidadorCpf valdCpf;
	
	@BeforeClass
	public static void init(){
		valdCpf = new ValidadorCpf();
	}

	@Test
	public void ValidCpfTest() {
		assertTrue(valdCpf.validarCPF("39575498844"));
	}

	@Test
	public void InvalidCpfTest() {
		assertFalse(valdCpf.validarCPF("39575498843"));
	}

	@Test (expected = CaracteresInvalidosException.class)
	public void CaracteresInvalidosCPFTest() {
		assertFalse(valdCpf.validarCPF("abcdeabcdef"));
	}
	
	@Test (expected = TamanhoCpfInvalidoException.class)
	public void TamanhoCpfInvalidoTest() {
		assertFalse(valdCpf.validarCPF("111111111111"));
	}	
	
}
