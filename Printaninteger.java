package smartengineer;
import java.util.Scanner;
public class Printaninteger {
	public static void main(String[] args) {
		
		//Creates a reader instance which takes
		//inputs from standard input - keyword
		Scanner reader = new Scanner(System.in);
		System.out.print("ENTER A NUMBER: ");
		
		//nextInt() reads the next integer from the keyboard
		int number = reader.nextInt();
		
		System.out.println("You entered: " + number);
	}
}