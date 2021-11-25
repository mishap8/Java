package learningPackage;

public class NumberOperationsRunner {

	public static void main(String[] args) {

		NumberOperations numberOps = new NumberOperations();

		System.out.println("Entre Number 1:");
		int num1 = numberOps.getInput();

		System.out.println("Entre Number 2:");
		int num2 = numberOps.getInput();

		System.out.println("Select the numeric operator to Perform");
		System.out.println("1 - Add");
		System.out.println("2 - Substract");
		System.out.println("3 - Multiply");
		System.out.println("4 - Divide");

		int option = numberOps.getInput();

		if (option == 1) {
			System.out.println(numberOps.add(num1, num2));
		} else if (option == 2) {
			System.out.println(numberOps.substraction(num1, num2));
		} else if (option == 3) {
			System.out.println(numberOps.multiply(num1, num2));
		} else if (option == 4) {
			System.out.println(numberOps.divide(num1, num2));
		}

	}
}
