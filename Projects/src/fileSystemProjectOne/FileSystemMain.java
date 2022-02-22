package fileSystemProjectOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileSystemMain {
	
	public static final Scanner SCAN = new Scanner(System.in) ;

	public static void main(String[] args) {
		char usersChoice;
		char businessChoice;
		ArrayList <String> fileList = new ArrayList<>();
		
		System.out.println("Welcome to the Lockers Pvt. Ltd \"LockedMe.com\" project");
		System.out.println("Developed by Kyle Vance");
		
		
		//MainMenu menuOne = new MainMenu();

		do {
		    // calls the main menu and returns the users choice
			usersChoice = MainMenu.mainMenu();
			
			switch (usersChoice) {
			
			case '1':   //Retrieving the file names in an ascending order
				if (fileList.isEmpty()) {
					System.out.println("\n\nThere are no files in this directory currently.");
					System.out.println("You can search for a file and added it to the directory\nin the search option feature of business-level operations.");
					System.out.println("Files added through the Add File feature are automatically\nadded to the directory.");
				}
				else {
					System.out.println("\nFile list in ascending order\n");
					Collections.sort(fileList);
					  System.out.println("");
				      for (String file : fileList) {
				      System.out.println(file);  
				      }
				      System.out.println("");
				}
				break;
			
			case '2':   //Business-level operations:
				// calls the business level menu and returns the users choice
				businessChoice = BusinessLevelMenu.businessLevelMenu();
				if (businessChoice == '1') usersChoice = AddFile.addfile(fileList);
				if (businessChoice == '2') usersChoice = DeleteFile.deleteFile(fileList);
				if (businessChoice == '3') usersChoice = SearchForFile.searchForFile(fileList);
				
				break;
				
			case '3':    //Option to close the application
				
				break;

			}
		} while ((usersChoice == '1') || (usersChoice == '2')  || (usersChoice != '3'));

		for (int i = 0; i < 2; ++i) {
			System.out.println();
		}
		
		System.out.println("You have chosen to leave the program.");
		System.out.println("Good Bye.");
		SCAN.close();
		
	}

}
