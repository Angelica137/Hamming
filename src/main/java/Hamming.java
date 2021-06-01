public class Hamming {
	public String distance(String s1, String s2) {
		if (s1.length() == s2.length()) {
			if (s1.equals(s2)) {
				return "Distance is 0";
			} else {
				int counter = 0;
				char[] first = s1.toLowerCase().toCharArray();
				char[] second = s2.toLowerCase().toCharArray();

				for (int i = 0; i < second.length; i++) {
					if (first[i] != second[i]) {
						counter++;
					}
				}
				return Integer.toString(counter);
			}
		} else {
			return "oooops";
		}

	}
}