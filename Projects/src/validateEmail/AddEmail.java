package validateEmail;

import java.util.ArrayList;
import java.util.Scanner;

public class AddEmail {
	
	public static char addEmail(ArrayList<String> userEmails) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\nWelcome to the add employee option");
		System.out.print("Please enter the new employee's email:  ");
		
		
		String newEmail = scan.nextLine();
		
		if (newEmail.contains("@")) {			
			if (userEmails.contains(newEmail)) {			
				System.out.println("\nUsers email already exist");			
				return '5';
			}
			else {
				userEmails.add(newEmail); 
				System.out.println("\nEmployee email added");
				return '5';
			}
		}
		else {
			System.out.println("\nInvalid email");
			return '5';
		}		
	}
}
