package Lab3_java;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Exercise5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter text : ");
		String txt = br.readLine();
		int charCount = 0, wordCount = 0, lineCount = 0;

		charCount = txt.length();
		wordCount = txt.split(" ").length;

		String[] lineList = txt.split("\n");
		lineCount = lineList.length;

		System.out.println("Number of Character : " + charCount 
				+ "\nNumber of Words : " + wordCount
				+ "\nNumber of Lines : " + lineCount);

	}
}
