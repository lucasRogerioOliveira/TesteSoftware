
import static org.junit.Assert.*;

import org.junit.Test;


public class VerificadorSenhaTests {

	@Test
	public void senhaForteTest() {
		assertTrue(VerificadorSenha.senhaEhForte("a!3c4@"));
	}
	
	@Test
	public void senhaFracaPorRepeticaoDeLetrasTest() {
		assertFalse(VerificadorSenha.senhaEhForte("professor12!@"));
	}
	
	@Test
	public void senhaFracaPorFaltaDeNumerosTest(){
		assertFalse(VerificadorSenha.senhaEhForte("professor1!@"));
	}
	
	@Test
	public void senhaFracaPorFaltaDeCaracteresEspeciaisTest(){
		assertFalse(VerificadorSenha.senhaEhForte("professor12!"));
	}
	
	@Test
	public void senhaFracaPorSerMenorQueSeisCaracteresTest(){
		assertFalse(VerificadorSenha.senhaEhForte("@1$2a"));
	}

}
