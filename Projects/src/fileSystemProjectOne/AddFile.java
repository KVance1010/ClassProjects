package fileSystemProjectOne;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class AddFile {

	public static char addfile(ArrayList<String> fileList) {
//		@SuppressWarnings("resource")
//		Scanner scan = new Scanner(System.in);

		// creates space in the console for readability
		for (int i = 0; i < 2; ++i) {
			System.out.println();
		}

		try {
			
			System.out.print("Please enter the file name that you would like to add:  ");
			
			String fileName = FileSystemMain.SCAN.nextLine();
			
			Path path = Paths.get(fileName);

			if (Files.exists(path)) {
				System.out.println("\n\""+ fileName +"\" file already exist");
			} else {
				Path donePath = Files.createFile(path);
				System.out.println("\n\"" +donePath.toString() + "\" file created");
				fileList.add(fileName);
			}

		} catch (Exception iox) {
			System.out.println("\nException: " + iox);
		}

		return 'x';
	}

}
