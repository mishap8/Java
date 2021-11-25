package learningPackage;

import java.util.Scanner;

public class NumberOperations {

	public int getInput() {
		Scanner sc = new java.util.Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}

	public int add(int num1, int num2) {
		int total = num1 + num2;
		return total;
	}

	public int substraction(int num1, int num2) {
		int total = num1 - num2;
		return total;
	}

	public int multiply(int num1, int num2) {
		int total = num1 * num2;
		return total;
	}

	public int divide(int num1, int num2) {
		int total = num1 / num2;
		return total;
	}

}
