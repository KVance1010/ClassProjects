package validateEmail;

import java.util.ArrayList;

public class ListEmails {
	
	public static char printList(ArrayList<String> userEmails) {
		System.out.println("\n\nEmployee list");
		if (userEmails.isEmpty()) {
			System.out.println("\nEmploy list is currently empty");
		}
		else {
			System.out.println();
			for(String empEmail: userEmails) {
				System.out.println(empEmail);
			}
		}
		
		return '5';
	}
	

}
