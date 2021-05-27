package Lab1_java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Checknumber {
	public  boolean  checknumber(int n)
	 {
	  while(n%2==0)
	  {
	   n=n/2;
	  }
	  if(n==1)
	  {
	   return true;
	  }
	  else
	  {
	   return false;
	  }
	 }
	  public static void main(String[] args)throws Exception {
		  Checknumber c = new Checknumber();
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  System.out.println("Enter The Number");
		  String s = br.readLine();
		  int n = Integer.parseInt(s);
		 System.out.println( c. checknumber(n));
		  
		 }
}
