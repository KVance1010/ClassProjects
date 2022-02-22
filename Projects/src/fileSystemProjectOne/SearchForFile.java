package fileSystemProjectOne;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchForFile {

	public static char searchForFile(ArrayList<String> fileList) {
		@SuppressWarnings( "resource" )
		Scanner scan = new Scanner(System.in);

		// creates space in the console for readability
		for (int i = 0; i < 2; ++i) {
			System.out.println();
		}
		
		//Start of the Search feature
		try {

			String fileName = scan.nextLine();
			Path path = Paths.get(fileName);

			if (Files.exists(path)) {
				System.out.println("\nThe file you are looking for is in the system.");
				System.out.format("TheFile is located at: %s%n", path.toAbsolutePath());
				if(fileList.contains(fileName)) {
					// do nothing if the file is in the file list
				}
				else {
					System.out.println( "\nFile \"" + fileName + "\" File name is not in the file list directory");
					System.out.println("would you like to add it? \nPlease enter y for yes or n for no");
					String saveFile = scan.nextLine();
					if (saveFile.toLowerCase().charAt(0) == 'y') {
						fileList.add(fileName);
						System.out.println("\nFile added to file list directory");
					}
				}
				
			} else {
				System.out.println("\nNo File found");
			}

		} catch (Exception iox) {
			System.out.println("Exception: " + iox);
		}

		return 'x';
	}

}
