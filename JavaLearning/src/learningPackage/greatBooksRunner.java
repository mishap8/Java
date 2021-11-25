package learningPackage;

public class greatBooksRunner {

	public static void main(String[] args) {

		greatBooks artOfProgramming = new greatBooks(100);
		greatBooks cleanCode = new greatBooks(200);
		greatBooks javaLearning = new greatBooks(300);

		/*
		 * greatBooks artOfProgramming = new greatBooks(); greatBooks cleanCode = new
		 * greatBooks(); greatBooks javaLearning = new greatBooks();
		 */

		// artOfProgramming.start();
		// artOfProgramming.setNoOfCopies(10);
		System.out.println(artOfProgramming.getNoOfCopies());

		artOfProgramming.increaseCopies(500);
		System.out.println(artOfProgramming.getNoOfCopies());
		artOfProgramming.decreaseCopies(300);
		System.out.println(artOfProgramming.getNoOfCopies());

		// cleanCode.start();
		// cleanCode.setNoOfCopies(5);
		System.out.println(cleanCode.getNoOfCopies());

		cleanCode.increaseCopies(150);
		System.out.println(cleanCode.getNoOfCopies());
		cleanCode.decreaseCopies(350);
		System.out.println(cleanCode.getNoOfCopies());

		// javaLearning.start();
		// javaLearning.setNoOfCopies(100);
		System.out.println(javaLearning.getNoOfCopies());

		javaLearning.increaseCopies(200);
		System.out.println(javaLearning.getNoOfCopies());
		javaLearning.decreaseCopies(550);
		System.out.println(javaLearning.getNoOfCopies());
	}
}
