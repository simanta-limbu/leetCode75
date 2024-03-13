package leetCode75;

public class mergingStringsAlternately {

	static public void mergerer(String s1, String s2) {

		char[] s1char = s1.toCharArray();
		char[] s2char = s2.toCharArray();
		String mergedString = "";

		if (s1char.length >= s2char.length) {

			for (int i = 0; i < s2char.length; i++) {
				mergedString += s1char[i];
				mergedString += s2char[i];

			}
			String kite = s1.substring(s2char.length, s1.length());
			mergedString += kite;
		}

		else {
			for (int i = 0; i < s1char.length; i++) {
				mergedString += s1char[i];
				mergedString += s2char[i];

			}
			String kite = s2.substring(s1char.length, s2.length());
			mergedString += kite;
		}

		System.out.println(mergedString);
	}

	public static void main(String[] args) {

		String s1 = "Simanta";
		String s2 = "Hari";

		mergingStringsAlternately.mergerer(s2, s1);

	}

}
