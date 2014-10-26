
import static org.junit.Assert.*;

import org.junit.Test;


public class AnoBissextoTest {

	@Test
	public void anosBissextosTests() {
		assertTrue(AnoBissexto.ehBissexto(1600) 
				&& AnoBissexto.ehBissexto(1732)
				&& AnoBissexto.ehBissexto(1888)
				&& AnoBissexto.ehBissexto(1944)
				&& AnoBissexto.ehBissexto(2008));
	}
	
	@Test
	public void anoNaoBissextoTests(){
		assertFalse(AnoBissexto.ehBissexto(1742) 
				&& AnoBissexto.ehBissexto(1889)
				&& AnoBissexto.ehBissexto(1951)
				&& AnoBissexto.ehBissexto(1951));
	}

}
