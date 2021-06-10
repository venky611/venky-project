package Lab3_java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class GetImage {
	public String getImage(String s) {
		StringBuffer sb = new StringBuffer(s);
		String revr = sb+"|"+sb.reverse();
		System.out.println("Reversed string : " +revr);
		return revr;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String s = br.readLine();
		GetImage MI = new GetImage();
		MI.getImage(s);
	

	}
}
