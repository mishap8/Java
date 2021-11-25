package learningPackage;

public class MyCharRunner {

	public static void main(String[] args) {

		MyChar myChar = new MyChar('H');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isConsanant());
		System.out.println(myChar.isNumber());
		System.out.println(myChar.isAlphabate());
		System.out.println(myChar.printUpperCaseChar());
		System.out.println(myChar.printLowerCaseChar());
		MyChar.printLowerCaseAlbhabates();
		MyChar.printUpperCaseAlbhabates();
	}

}
