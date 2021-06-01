import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class HammingTest {

	private Hamming hammingDistance;
	private String s1;
	private String s2;
	private String s3;
	private String s4;

	@Before
	public void setup() {
		hammingDistance = new Hamming();
		s1 = "GAGCCTACTAACGGGAT";
		s2 = "CATCGTAATGACGGCCT";
		s3 = "CATCGTAATGACGGCCTCATCGTAATGACGGCCT";
		s4 = "GAGCCTACTAACGGGAT";

	}

	@Test
	public void testExceptionLengthDifferent() {
		assertEquals("oooops", hammingDistance.distance(s1, s3));
	}

	// test strings match
	@Test
	public void testSequencesMatch() {
		assertEquals("Distance is 0", hammingDistance.distance(s1, s4));
	}

	@Test
	public void testSequencesNoMatch() {
		assertEquals("7", hammingDistance.distance(s1, s2));
	}
}