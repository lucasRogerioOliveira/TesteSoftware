
//LISTA 2 - EXERCÍCIO 2
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import Exceptions.EmptyStringException;
import Exceptions.LetrasRepetidasException;
import Exceptions.NumerosInvalidosException;
import Exceptions.NumerosMisturadosException;


public class ConversorNumericoTests {

	private static ConversorNumerico conversorNumerico;
	
	@BeforeClass
	public static void Init(){
		conversorNumerico = new ConversorNumerico();
	}
	
	@Test
	public void RomanToIndoArabe() {
		Assert.assertEquals(conversorNumerico.Convert("MMMCDXLIV"), 3444, 0);		
	}
	
	@Test
	public void IndoArabeToRoman() { 
		Assert.assertEquals(conversorNumerico.Convert(3444), "MMMCDXLIV");
	}
	
	@Test (expected = EmptyStringException.class)
	public void EmptyValueException(){
		conversorNumerico.Convert("");
	}
	
	@Test (expected = NumerosInvalidosException.class)
	public void NumerosInvalidosExceptionTest(){
		conversorNumerico.Convert("GTR");
	}
		
	@Test (expected = LetrasRepetidasException.class)
	public void LetrasRepetidasExceptionTest(){
		conversorNumerico.Convert("XXXX");
	}
	
	@Test (expected = NumerosMisturadosException.class)
	public void NumerosMisturadosExceptionTest(){
		conversorNumerico.Convert("X1");
	}
}
