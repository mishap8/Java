package learningPackage;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalRunnerClass {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Apoorv\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cnn.com");
		Thread.sleep(5000);
		driver.close();

		ConditionalClass cs = new ConditionalClass();

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the Number (between 0-7) for which you want to find Day of Week : ");
		int dayOfWeek = scanner.nextInt();

		System.out.println("Based on your Input day is : " + cs.dayofWeek(dayOfWeek));

		System.out.println("Based on your Input is it a Weekday? : " + cs.isWeekday(dayOfWeek));

		System.out.print("Enter the Number (between 1-12) for which you want to find Month Name in the Year : ");
		int noOfMonth = scanner.nextInt();

		System.out.println("Based on your Input Month is : " + cs.noOfMonth(noOfMonth));

	}

}
