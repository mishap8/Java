package learningPackage;

public class MyChar {

	private char ch;

	public MyChar(char ch) {
		this.ch = ch;
	}

	public boolean isVowel() {

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U')
			return true;

		return false;
	}

	public boolean isNumber() {
		if (ch <= 63 && ch >= 48)
			return true;

		return false;
	}

	public boolean isConsanant() {

		if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') || ((ch < 65 || (ch >= 91 && ch <= 96) || ch > 122)))
			return false;

		return true;
	}

	public boolean isAlphabate() {

		if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
			return true;

		return false;
	}

	public char printUpperCaseChar() {

		ch = Character.toUpperCase(ch);
		return ch;
	}

	public char printLowerCaseChar() {
		ch = Character.toLowerCase(ch);
		return ch;
	}

	public static void printUpperCaseAlbhabates() {

		System.out.println("");
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch);
		}
	}

	public static void printLowerCaseAlbhabates() {

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.print(ch);
		}
	}
}
