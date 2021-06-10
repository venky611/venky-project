package Lab3_java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Token {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the numbers");
		String s = br.readLine();
		StringTokenizer st = new StringTokenizer(s," ");
		String s1 = st.nextToken();
		String s2 = st.nextToken();
		String s3 = st.nextToken();
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		int n3 = Integer.parseInt(s3);
		
		int  add = n1 + n2 + n3;
		System.out.println("Result : "+add);
		

	}
}
