package fileSystemProjectOne;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class DeleteFile {
	
	public static char deleteFile (ArrayList <String> fileList){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		// creates space in the console for readability
		for (int i = 0; i < 2; ++i) {
			System.out.println();
		}
		try {
			
			System.out.println("Please enter the file name that you would like to delete:  ");

			String fileName = scan.nextLine();
			Path path = Paths.get(fileName);

			if (Files.exists(path)) {
				Files.delete(path);
				System.out.println("File "+ path + " deleted");
				fileList.remove(fileName);
				
			}else {
				System.out.println("File doesnt exist");
			}
			
		} catch (Exception iox) {
			System.out.println("Exception: " + iox);
		}

		return 'x';
	}

}
