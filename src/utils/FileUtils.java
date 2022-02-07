package utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class FileUtils {

	public File getFile(String path) {
		return new File(path);
	}

	public String readFile(String path, IReader reader) {

		String content = "";
		try {
			File myObj = new File(path); // C:\Users\ASUS\eclipse-workspace\Passworder\src\test.txt

			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				for (char c : data.toCharArray()) {
					reader.onChar(c);

				}
				reader.onChar('\n');
				content += data;
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("hata");
			e.printStackTrace();
		}
		reader.onComplete(content);
		return content;

	}

	public void writeFile(String path, String content) {

		try {
			File file = new File(path);
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fileWriter = new FileWriter(file, false);
			BufferedWriter bWriter = new BufferedWriter(fileWriter);
			bWriter.write(content);
			bWriter.close();

		} catch (Exception e) {

		}

	}

}
