package Hello;
import java.util.Scanner;

public class Hello {
	
	// static String firstname = "marty";
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Enter firstname");
		String userFirstName = myObj.nextLine();

		System.out.println("Enter lastname");
		String userLastName = myObj.nextLine();
		myObj.close();
	 System.out.println("Hello world" +" "+ userLastName + " " + userFirstName);	}
}
