public class Hamming {
	public String distance(String s1, String s2) {
		if (s1.length() == s2.length()) {
			if (s1.equals(s2)) {
				return "Distance is 0";
			} else {
				return "sad face";
			}
		} else {
			return "oooops";
		}

	}
}