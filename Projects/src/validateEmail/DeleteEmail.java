package validateEmail;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteEmail {

	public static char deleteEmail(ArrayList<String> userEmails) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\nWelcome to the delete employee option");
		System.out.print("Please enter the employee's email you wish to delete:  ");

		String newEmail = scan.nextLine();

		if (newEmail.contains("@")) {
			if (userEmails.contains(newEmail)) {
				userEmails.remove(newEmail);
				System.out.println("\nEmployee email deleted");
				return '5';
			} else {
				System.out.println("\nEmployee email not found");
				return '5';
			}
		} else {
			System.out.println("\nInvalid email");
			return '5';
		}
	}

}
