package Main_Pro;
	import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

	public class oprs {

		

		// File listing function
		public static void listFiles() {

			int fileCount = 0;
			ArrayList<String> filenames = new ArrayList<String>();

			File directoryPath = new File(System.getProperty("user.dir"));
			File[] listOfFiles = directoryPath.listFiles();
			fileCount = listOfFiles.length;

			System.out.println("Files in ascending order: ");
			for (int i = 0; i < fileCount; i++) {
				if (listOfFiles[i].isFile()) {
					filenames.add(listOfFiles[i].getName());
				}
			}Collections.sort(filenames);


			for (String currentFile : filenames) {
				System.out.println(currentFile);
			}

		}

		// File delete function
		public static void deleteFile(String fileToBeDeleted) {

			File file = new File((System.getProperty("user.dir")) + "\\" + fileToBeDeleted);

			if (file.exists()) {
				if (file.delete()) {
					System.out.println("File deleted successfully!");
				}
			} else {
				System.out.println("Sorry,File Not Found");
			}
		}

		// File search function
		public static void searchFile(String fileToBeSearched) {

			File file = new File((System.getProperty("user.dir")) + "\\" + fileToBeSearched);
			if (file.exists()) {
				System.out.println("File found!");
			} else {
				System.out.println("Sorry, File Not Found");
			}
			PrintWriter pw;
			try {
				pw = new PrintWriter(fileToBeSearched); // may throw exception
				pw.println("saved");
			}
			// providing the checked exception handler
			catch (FileNotFoundException e) {

				System.out.println(e);
			}
		}

		// File creation function
		public static void createFile(String fileToBeCreated) {
			File file = new File((System.getProperty("user.dir")) + "\\" + fileToBeCreated);

			try {
				if (file.createNewFile()) {
					System.out.println("File Created!");
					
		
					}

				 else {
					System.out.println("File already exists :(");
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

}