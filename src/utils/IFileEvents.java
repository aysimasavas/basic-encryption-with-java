package utils;

public interface IFileEvents {

	public void onReadingComplete(String content);

	public void onWritingComplete();

	public void onReading(char c);

	public void onError(String msg);
	
}
