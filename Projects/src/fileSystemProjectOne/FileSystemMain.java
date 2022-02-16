package fileSystemProjectOne;

public class FileSystemMain {

	public static void main(String[] args) {
		char usersChoice;
		char businessChoice;
		
	    // calls the main menu and returns the users choice
		usersChoice = MainMenu.mainMenu();

		do {

			usersChoice = MainMenu.mainMenu();
			switch (usersChoice) {
			
			case '1':   //Retrieving the file names in an ascending order
				System.out.println("option 1");
				break;
			
			case '2':   //Business-level operations:
				// calls the business level menu and returns the users choice
				businessChoice = BusinessLevelMenu.businessLevelMenu();
				if (businessChoice == '1') usersChoice = AddFile.addfile();
				if (businessChoice == '2') usersChoice = DeleteFile.deleteFile();
				
				break;
			case 'x':
				//returns the main menu
				usersChoice = MainMenu.mainMenu();
				break;
			
			case '3':    //Option to close the application
				break;
				
			default:
				
				while ((usersChoice != '1') && (usersChoice != '2') && (usersChoice != '3') && (usersChoice != 'x')) {
					System.out.print("Please enter a valid option of 1-3");
					System.out.println("You entered "+ usersChoice);
					usersChoice = MainMenu.mainMenu();
				}
				break;

			}
		} while ((usersChoice != '1') || (usersChoice != '2'));

		for (int i = 0; i < 5; ++i) {
			System.out.println();
		}
		
		System.out.println("You have chosen to leave the program.");
		System.out.println("Good Bye.");
	}

}
