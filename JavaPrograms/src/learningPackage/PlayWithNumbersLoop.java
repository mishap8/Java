package learningPackage;

public class PlayWithNumbersLoop {

	private double num;
	private double num1;
	private double num2;

	public PlayWithNumbersLoop(double num) {
		this.num = num;
	}

	boolean inLoop = false;

	public boolean isPrime() {
		if (num < 1) {
			System.out.println("Invlaid Number");
		} else {
			for (double i = 2; i < num; i++) {
				if (num % i == 0) {
					inLoop = true;
				}
			}
		}
		return inLoop;
	}

	public double sumUptoNumber() {

		for (double i = 1; i <= num; i++) {
			num1 = num1 + i;
		}
		return num1;

	}

	public double sumOfDivisors() {
		for (double i = 2; i < num; i++) {
			if (num % i == 0) {
				num2 = num2 + i;
			}
		}
		return num2;
	}

	public void printANumberTriangle() {
		for (double i = 1; i <= num; i++) {
			for (double j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public void printSquareUpToNumber() {

		double i = 1;
		while (i * i < num) {
			System.out.println(i * i);
			i++;
		}

	}

	public void printCubeUpToNumber() {
		double i = 1;
		while (i * i * i < num) {
			System.out.println(i * i * i);
			i++;
		}
	}

	public void printCube(double num3) {

		System.out.println("Cube is :" + num3 * num3 * num3);

	}
}