package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileUtil {

	IFileEvents event;

	public FileUtil(IFileEvents event) {
		this.event = event;

	}


	public void readFile(String path) {

		try {
			StringBuilder data = new StringBuilder();
			File file = new File(path);
			FileReader reader = new FileReader(file);
			BufferedReader br = new BufferedReader(reader);

			int c = 0;

			while ((c = br.read()) != -1) {
				char ch = (char) c;
				event.onReading(ch);
				data.append(ch);

			}
			event.onReadingComplete(data.toString());

		} catch (Exception e) {

			event.onError(e.getMessage());
		}

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
			event.onWritingComplete();
		} catch (Exception e) {
			event.onError(e.getMessage());
		}

	}

}
