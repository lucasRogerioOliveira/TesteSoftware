package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import src.Josephus;

public class JosephusTests {

	@Test
	public void SuicidarOkTest() {
		 assertEquals(4, Josephus.sucidar(5, 2, 1)); 
	}
	
	/*
	 * CAMINHO INFELIZ
	 */

	@Test(expected=RuntimeException.class)
	public void SuicidarPassoasInvalidas() {
		 assertEquals(4, Josephus.sucidar(0, 2, 1)); 
	}
	
	@Test(expected=RuntimeException.class)
	public void SuicidarInvalidas() {
		 assertEquals(4, Josephus.sucidar(5, 0, 1)); 
	}

	@Test(expected=RuntimeException.class)
	public void SuicidarPassosInvalidas() {
		 assertEquals(4, Josephus.sucidar(5, 2, -1)); 
	}

	
}
