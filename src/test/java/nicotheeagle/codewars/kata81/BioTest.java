package nicotheeagle.codewars.kata81;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BioTest {
	@Test
	public void dnaToRnaTest() {
		String dna = "TTTT";
		String expected = "UUUU";
		
		Bio util = new Bio();
		String rna = util.dnaToRna(dna);
		
		assertEquals(expected, rna);
	}
}
