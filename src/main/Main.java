package main;


import cryptology.Cryptology;
import utils.PathUtils;

public class Main {

	public static void main(String[] args) {

		Cryptology crypto = new Cryptology();
		crypto.encrypt(PathUtils.getInstance().getPath("src/test.txt"),
				PathUtils.getInstance().getPath("src/test.enc"));
		crypto.decrypt(PathUtils.getInstance().getPath("src/test.enc"),
				PathUtils.getInstance().getPath("src/sonuc.txt"));

		/*
		 * crypto.encrypt(
		 * "C:\\Users\\ASUS\\eclipse-workspace\\Encryption\\src\\test.txt",
		 * "C:\\Users\\ASUS\\eclipse-workspace\\Encryption\\src\\sonuc.txt");
		 * 
		 * crypto.decrypt(
		 * "C:\\Users\\ASUS\\eclipse-workspace\\Encryption\\src\\sonuc.txt",
		 * "C:\\Users\\ASUS\\eclipse-workspace\\Encryption\\src\\dec.txt");
		 */
	}


}
