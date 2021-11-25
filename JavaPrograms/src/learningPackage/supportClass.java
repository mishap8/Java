package learningPackage;
import java.util.Scanner;

public class supportClass {
	
void printTable() {
	
	System.out.println("Enter the numbr to Print the table For");
	
	
	Scanner sc = new Scanner(System.in);
	int tableFor = sc.nextInt();
	
	for (int i = 1 ; i<= 10 ; i++) {
		System.out.println(tableFor + " * " + i + " = " + tableFor*i);
	}
		
	}

public void printTable(int tableFor) {
	for (int i = 1 ; i<= 10 ; i++) {
		System.out.println(tableFor + " * " + i + " = " + tableFor*i);
	}
	
}

}
