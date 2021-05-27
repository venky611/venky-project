package Lab1_java;
import java.io.*;
public class Fib {
	public static void main(String args[ ]) throws Exception {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		int i,a=1,b=1,c=0,n;
		System.out.print("Enter value of n: ");
		int n1 =Integer.parseInt(br.readLine());
		System.out.print(a);
		System.out.print(" "+b);
		for(i=0;i<n1-2;i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.print(" "+c);
		}
		System.out.println();
		System.out.print(n1+"th number of the series is: "+c);
		}
}
