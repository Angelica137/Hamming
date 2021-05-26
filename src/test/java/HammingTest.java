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
		s2 = "GAGCCTACTAACGGGAT";
		s3 = "CATCGTAATGACGGCCT";

	}

	@Test
	public void testSequencesMatch() {
		assertEquals("Hello, world!", hammingDistance.distance(s1, s2));
	}
}