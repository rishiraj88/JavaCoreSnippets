package java11;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
/**
 * 
 * @author rishiraj
 * to read from and write to file
 */
public class FilesReadStringWriteString {
	public static void main(String[] args) {

		// Absolute path format for Windows: "D:\\tmp\\finalvariables.txt"
		var filePath = "httpClientLogs2024.txt";
		try {
			// Files.readString(path) method available since JDK 11
			// Path.of(filePath) or Paths.get(filePath) can be used to get Path
			String fileData = Files.readString(Path.of(filePath));
			System.out.println(fileData);

			String tmpFilePath = "tmp_"+ filePath;
			File file = Path.of(tmpFilePath).toFile();
			if(!file.exists()) file.createNewFile();
			// Files.writeString(path) method available since JDK 11
			Files.writeString(Path.of(tmpFilePath),"new string added", StandardOpenOption.APPEND);
			fileData = Files.readString(Path.of(tmpFilePath));
			System.out.println(fileData);
			
		}catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
}
