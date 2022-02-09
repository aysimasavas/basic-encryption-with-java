package cryptology;

public enum CryptologyMod {
	ENCRYPT(1), DECRYPT(2);

	private int value;

	CryptologyMod(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
