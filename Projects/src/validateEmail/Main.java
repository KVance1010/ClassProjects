package validateEmail;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> userEmails = new ArrayList<>();
		char usersChoice;

		do {
			usersChoice = MainMenu.menu();

			switch (usersChoice) {

			case '1':
				AddEmail.addEmail(userEmails);
				break;
			case '2':
				DeleteEmail.deleteEmail(userEmails);
				break;
			case '3':
				ListEmails.printList(userEmails);
				break;

			case '4':
				break;
			}
		} while ((usersChoice != '4')); 

		System.out.println("\nYou have choosen to leave the program.");
		System.out.println("Good bye.");
	}

}
