package Lab3_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PositiveString {
	 static boolean isAlphabaticOrder(String s)
	    {
	       
	        int n = s.length();
	        char c[] = new char [n];
	        for (int i = 0; i < n; i++) {
	            c[i] = s.charAt(i);
	        }
	        Arrays.sort(c);
	        for (int i = 0; i < n; i++)
	            if (c[i] != s.charAt(i)) 
	                return false;
	               
	        return true;    
	    }
	     
	    public static void main(String args[])throws Exception
	    {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter The String ");
			String s = br.readLine();
	        if (isAlphabaticOrder(s))
	           System.out.println("Yes");
	        else
	            System.out.println("No");
	           
	    }
}

