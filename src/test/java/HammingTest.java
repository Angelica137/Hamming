import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class HammingTest {

	private Hamming hammingDistance;
	private String s1;
	private String s2;
	private String s3;

	@Before
	public void setup() {
		hammingDistance = new Hamming();
		s1 = "GAGCCTACTAACGGGAT";
		s2 = "CATCGTAATGACGGCCT";
		s3 = "CATCGTAATGACGGCCTCATCGTAATGACGGCCT";

	}

	@Test
	public void testSequencesMatch() {
		assertEquals("It is a match", hammingDistance.distance(s1, s2));
	}

	@Test
	public void testExceptionNoMatch() {
		assertEquals("oooops", hammingDistance.distance(s1, s3));
	}
}