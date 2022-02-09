package cryptology;

import utils.FileUtil;
import utils.IFileEvents;

public class Cryptology implements IFileEvents {

	private String data = "";
	private String ifp = "";
	private String ofp = "";
	private FileUtil fileUtil;

	CryptologyMod mod;

	public Cryptology() {
		fileUtil = new FileUtil(this);
	}

	private char encryption(char c) {

		return (char) (c - 10);

	}

	private String encryption(String s) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			sb.append(encryption(c));
		}
		return sb.toString();

	}

	private char decryption(char c) {
		return (char) (c + 10);

	}

	private String decryption(String s) {
		StringBuilder sb = new StringBuilder();
		for (char c : s.toCharArray()) {
			sb.append(decryption(c));
		}
		return sb.toString();

	}

	public void encrypt(String ifp, String ofp) {
		this.ifp = ifp;
		this.ofp = ofp;
		this.mod = CryptologyMod.ENCRYPT;
		fileUtil.readFile(ifp);

	}

	public void decrypt(String ifp, String ofp) {
		this.ifp = ifp;
		this.ofp = ofp;
		this.mod = CryptologyMod.DECRYPT;
		fileUtil.readFile(ifp);
	}

	@Override
	public void onReadingComplete(String content) {
		if (mod == CryptologyMod.ENCRYPT) {
			data = encryption(content);
		}
		else if (mod == CryptologyMod.DECRYPT) {
			data=decryption(content);
		}
		fileUtil.writeFile(ofp, data);
		System.out.println("data:" + data);


	}

	@Override
	public void onWritingComplete() {

	}

	@Override
	public void onReading(char c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onError(String msg) {
		// TODO Auto-generated method stub

	}

}
