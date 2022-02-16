package fileSystemProjectOne;

public class FileSystemMain {

	public static void main(String[] args) {
		char usersChoice;
		char businessChoice;
		
		//MainMenu menuOne = new MainMenu();

		do {
		    // calls the main menu and returns the users choice
			usersChoice = MainMenu.mainMenu();
			//usersChoice = menuOne.mainMenu();

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
				
			case '3':    //Option to close the application
				
				break;

			}
		} while ((usersChoice == '1') || (usersChoice == '2')  || (usersChoice != '3'));

		for (int i = 0; i < 5; ++i) {
			System.out.println();
		}
		
		System.out.println("You have chosen to leave the program.");
		System.out.println("Good Bye.");
		
	}

}
