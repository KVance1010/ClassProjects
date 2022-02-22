package fileSystemProjectOne;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class DeleteFile {
	
	public static char deleteFile (ArrayList <String> fileList){
//		@SuppressWarnings("resource")
//		Scanner scan = new Scanner(System.in);
		
		// creates space in the console for readability
		for (int i = 0; i < 2; ++i) {
			System.out.println();
		}
		try {
			
			System.out.print("Please enter the file name that you would like to delete:  ");

			String fileName = FileSystemMain.SCAN.nextLine();;
			Path path = Paths.get(fileName);

			if (Files.exists(path)) {
				Files.delete(path);
				System.out.println("\nFile "+ path + " deleted");
				fileList.remove(fileName);
				
			}else {
				System.out.println("\nFile doesnt exist");
			}
			
		} catch (Exception iox) {
			System.out.println("Exception: " + iox);
		}

		return 'x';
	}

}
