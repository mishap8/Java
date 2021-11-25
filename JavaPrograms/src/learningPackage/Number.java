package learningPackage;

public class Number {

	private int num1;
	private int num2;

	public Number(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}

	public int add() {
		int sum = this.num1 + this.num2;
		return sum;
	}

	public int multiply() {
		int multiply = (this.num1 * this.num2);
		return multiply;
	}

	public void doubleNum() {
		num1 = this.num1 * 2;
		num2 = this.num2 * 2;
	}

}
