package Day18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		
//		createFile();
//		createDirectory();
//		DeleteFile();
//		DeleteDir();
		Copy();
	}
//Copy
private static void Copy() throws IOException {
		var source = Path.of("src/readme.txt");
		var dest = Path.of("src/another.txt");
		
		Files.copy(source, dest);
		System.out.println("Copy success!");
	}

//Delete empty directory / folder
private static void DeleteDir() throws IOException{
//		var path = Path.of("./test");
////		System.out.println("Exit: " + Files.exists(path));
//		var DirDel = Files.deleteIfExists(path);
//		if(DirDel)
//			System.out.println("Delete success");
//		else
//			System.out.println("Something went wrong!");
	
//non empty delete directory
		var path = Path.of("./Data");
		if(Files.exists(path)) {
			Files.walk(path) //List path
				.map(p-> p.toFile())//convert path to file
				.forEach(f -> f.delete());
		Files.delete(path);
		System.out.println("Delete success");
		
		}else {
			System.out.println("Something went wrong!");
		}
	}

//delete file
private static void DeleteFile() throws IOException {
		var path = Path.of("src/readme.txt");
		boolean fileDel = Files.deleteIfExists(path);
		if(fileDel)
			System.out.println("Delete success!");
		else
			System.out.println("Something is wrong!");
	}
//create directory
	private static void createDirectory() throws IOException {
		//locate
		Path path = Path.of("./test");
		if(Files.notExists(path)) {
			Files.createDirectories(path);
			System.out.println("Creating new Dir!");
		}else{
			System.out.println("This dir is already exist!");
		}
	}
	
//create file
	private static void createFile() throws IOException {
		//locate
		Path path = Path.of("src/readme.txt");
		if(Files.exists(path))
			System.out.println("File already exist!");
		else
		{
			Files.createFile(path);
			System.out.println("Createting new file!");
		}
	}
}
