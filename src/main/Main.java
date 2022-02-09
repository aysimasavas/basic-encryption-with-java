package main;


import cryptology.Cryptology;

public class Main {

	public static void main(String[] args) {

		Cryptology crypto = new Cryptology();

		crypto.encrypt("C:\\Users\\ASUS\\eclipse-workspace\\Encryption\\src\\test.txt",
				"C:\\Users\\ASUS\\eclipse-workspace\\Encryption\\src\\sonuc.txt");


		crypto.decrypt("C:\\Users\\ASUS\\eclipse-workspace\\Encryption\\src\\sonuc.txt",
				"C:\\Users\\ASUS\\eclipse-workspace\\Encryption\\src\\dec.txt");
	}


}
