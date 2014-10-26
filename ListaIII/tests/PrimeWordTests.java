
//LISTA 3 - EXERCÍCIO 2
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import Exceptions.EmptyWordException;
import Exceptions.InvalidLetterException;

public class PrimeWordTests {
	
	private static PrimeWord primeWord;
	
	@BeforeClass
	public static void init(){
		primeWord = new PrimeWord();
	}

	@Test
	public void PrimeWordTest(){
		primeWord.setWord("AZ");
		assertTrue(primeWord.isPrime());
	}
	
	@Test
	public void notPrimeWordTest(){
		primeWord.setWord("bb");
		assertTrue(!primeWord.isPrime());
	}
	
	@Test (expected = EmptyWordException.class)
	public void emptyWordTest(){
		primeWord.setWord("");
		primeWord.isPrime();
	}
	
	@Test (expected = InvalidLetterException.class)
	public void invalidWordTest(){
		primeWord.setWord("1234!@#");
		primeWord.isPrime();		
	}

}
