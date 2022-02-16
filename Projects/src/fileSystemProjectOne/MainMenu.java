package fileSystemProjectOne;

import java.util.Scanner;

public class MainMenu {
	
	public static char mainMenu() {
		String usersChoice;
		char selection;
		Scanner scan = new Scanner(System.in);


		do { 
			System.out.println("           MainMenu\n");
			System.out.println("1. List files in ascending order");
			System.out.println("2. Business-level operations");
			System.out.println("3. Close the application\n");
			System.out.print("Enter the number that corresponds with your choice:  ");
			usersChoice = scan.nextLine();
			selection = usersChoice.charAt(0);
			if ((selection != '1') || (selection != '2') || (selection != '3')) {
				System.out.println("Please enter an number that is 1-3");
			}
		} while ((selection == '1') && (selection == '2') && (selection == '3'));
		scan.close();
		return selection;
	}

}
