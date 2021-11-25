package learningPackage;

public class NumberRunner {

	public static void main(String[] args) {

		/*
		 * Number number1 = new Number(5, 10);
		 * 
		 * System.out.println("Sum of Numbers is: " + number1.add());
		 * System.out.println("Multiplication of Numbers is: " + number1.multiply());
		 * 
		 * number1.doubleNum(); System.out.println("Double of Number 1 is: " +
		 * number1.getNum1()); System.out.println("Double of Number 2 is: " +
		 * number1.getNum2());
		 */

		SimpleIntrest si = new SimpleIntrest("4500.00", "7.5");
		System.out.println(si.calculateTotalValue(5));

	}

}