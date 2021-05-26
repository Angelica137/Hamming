public class Hamming {
	public String distance(String s1, String s2) throws Exception {
		if (s1.equals(s2)) {
			return "It is a match";
		} else {
			throw new Exception("oooops");
		}

	}
}