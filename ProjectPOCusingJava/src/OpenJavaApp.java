import java.io.IOException;

public class OpenJavaApp {

	public static void main(String[] args) throws IOException {
		Runtime runtime = Runtime.getRuntime(); // getting Runtime object

		// runtime.exec("notepad.exe"); // opens new notepad instance
		String[] s = new String[] { "C:\\ProgramData\\S2iLauncher\\ple\\AH\\bin\\run.bat" };
		try {
			runtime.exec(s); // opens "https://javaconceptoftheday.com/" in chrome browser
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}