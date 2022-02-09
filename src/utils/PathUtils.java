package utils;

import java.nio.file.Paths;

public class PathUtils {

	private static PathUtils instance = null;

	private PathUtils() {

	}

	public static PathUtils getInstance() {

		if (instance == null) {
			instance = new PathUtils();
		}
		return instance;
	}

	public String getPath(String fileName) {
		return Paths.get(fileName).toAbsolutePath().toString(); // fileName benim verdiðim dizinde arýycak
	}

	public boolean isPathValid(String s) {
		return Paths.get(s).toFile().exists(); // dosya var mi??
	}
}
