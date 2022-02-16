package fileSystemProjectOne;

import java.util.Scanner;

public class BusinessLevelMenu {
	
	public static char businessLevelMenu() {
		String usersChoice;
		char selection;
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);


		do { 
			for (int i = 0; i < 5; ++i) {
				System.out.println();
			}
			System.out.println("   Business-level Menu \n");
			System.out.println("1. Add a user specified file");
			System.out.println("2. Delete a user specified file");
			System.out.println("3. return to the MainMenu\n");
			System.out.print("Enter the number that corresponds with your choice:  ");
			usersChoice = scan.nextLine();
			selection = usersChoice.charAt(0);

		} while ((selection != '1') && (selection != '2') && (selection != '3'));
		
		if (selection == '3') {
			selection = 'x';
		}
		//scan.close();
		return selection;
	}
	

}
