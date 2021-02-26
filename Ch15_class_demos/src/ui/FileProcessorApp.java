package ui;

import java.io.IOException;
import java.nio.file.*; // keep note of this for file transfer/connections

public class FileProcessorApp {

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to the File Processor App!");
		//.p463
		String dirString = "c:/temp/files";
		Path dirPath = Paths.get(dirString);
		// create the directory if it doesn't already exist
		if (Files.notExists(dirPath)) {
			Files.createDirectories(dirPath);
			System.out.println("Directory created");
		}
		else {
			System.out.println("Directory already exists");
		}
 		// create the file if it doesn't already exist
		String fileString = "products.txt";
		Path filePath = Paths.get(dirString, fileString);
		if (Files.notExists(filePath)) {
			Files.createFile(filePath);
			System.out.println("File created");
		}
		else {
			System.out.println("File already exists");
		}
		
		// display files in c:\temp\files folder
		if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
			System.out.println("Directory: "+dirPath.toAbsolutePath());
			System.out.println("Files:");
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
			for (Path p: dirStream) {
				if(Files.isRegularFile(p))
				System.out.println("   "+p.getFileName());
			}
		}
		
		
		
		
		System.out.println("Thanks for using the File Processor App!");

	}

}
