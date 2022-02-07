package main;

import utils.FileUtils;
import utils.IReader;

public class Main implements IReader {

	public static void main(String[] args) {
		FileUtils fileUtil = new FileUtils();
		// fileUtil.writeFile("C:\\Users\\ASUS\\eclipse-workspace\\Passworder\\src\\test.txt",
		// "java dev aysima");
		System.out.println("a: " + (int) 'a');

		fileUtil.readFile("C:\\Users\\ASUS\\eclipse-workspace\\Encryption\\src\\test.txt", new Main());

	}

	@Override
	public void onChar(char c) {
		System.out.println("onchar: " + c);

	}

	@Override
	public void onComplete(String content) {
		System.out.println("content calisti");

	}

}
