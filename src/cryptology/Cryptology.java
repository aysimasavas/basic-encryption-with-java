package cryptology;

import utils.FileUtil;
import utils.IFileEvents;

public class Cryptology implements IFileEvents {

	private String data = "";
	private String ifp = "";
	private String ofp = "";
	private FileUtil fileUtil;
	private int mod = 0;


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
		this.mod = 1;
		fileUtil.readFile(ifp);

	}

	public void decrypt(String ifp, String ofp) {
		this.ifp = ifp;
		this.ofp = ofp;
		this.mod = 2;
		fileUtil.readFile(ifp);
	}

	@Override
	public void onReadingComplete(String content) {
		if (mod == 1) {
			data = encryption(content);
		}
		else if (mod == 2) {
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
