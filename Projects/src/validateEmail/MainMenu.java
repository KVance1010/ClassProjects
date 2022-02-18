package validateEmail;

import java.util.Scanner;

public class MainMenu {
    
	public static char menu() {
	
		char usersChoice;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	
	    do 
	    {
	    
	    System.out.println("\n\nWelcome to the Employee email list");
	    System.out.println("              Menu\n");
	    System.out.println("1. Add a new email");
	    System.out.println("2. Delete an email");
	    System.out.println("3. Show all current employee emails");
	    System.out.println("4. Exit the program");
	    System.out.print("\nPlease enter 1-4:   ");
	    String tempValue = scan.nextLine();
	    usersChoice = tempValue.charAt(0);
	    } while ((usersChoice != '1') && (usersChoice != '2') && (usersChoice != '3') && (usersChoice != '4'));
	    
	    return usersChoice; 
	}
}
