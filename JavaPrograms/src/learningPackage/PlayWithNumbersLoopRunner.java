package learningPackage;

import java.util.Scanner;

public class PlayWithNumbersLoopRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number");
		double num = scanner.nextDouble();

		PlayWithNumbersLoop number = new PlayWithNumbersLoop(num);

		if (number.isPrime() == false) {
			System.out.println("Provided number is a Prime Number");
		} else
			System.out.println("Provided number is Not a Prime Number");

		System.out.println("Sum Till Number : " + number.sumUptoNumber());
		System.out.println("Sum of Divisor numbers : " + number.sumOfDivisors());

		number.printANumberTriangle();

		number.printSquareUpToNumber();
		number.printCubeUpToNumber();

		int num1 = -1;
		do {
			if (num1 != -1) {
				number.printCube(num1);
			}
			System.out.println("Input number to get the Cube");
			num1 = scanner.nextInt();
		} while (num1 >= 0);
		System.out.println("Thankyou!!! Have Fun!!!");
	}
}
