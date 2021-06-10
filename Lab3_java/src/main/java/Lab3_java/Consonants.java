package Lab3_java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Consonants {
	private static String CONSONANTS = "bcdfghjklmnpqrstvwxyz";
	 
	public static String repalceConsonents(String input) {
		char[] chars = input.toCharArray();
	    for (int i = 0; i < chars.length; i++) {
	        char ch = chars[i];
	        char lower = Character.toLowerCase(ch);
	        int idx = CONSONANTS.indexOf(lower);
	        if (idx != -1) {
	            char next = CONSONANTS.charAt((idx + 1) % CONSONANTS.length());
	            chars[i] = (ch == lower ? next : Character.toUpperCase(next));
	        }
	    }
	    return new String(chars);
	
	}

			public static void main(String[] args)throws Exception {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter The String ");
				String input = br.readLine();
				System.out.println(repalceConsonents(input));
	}
}
