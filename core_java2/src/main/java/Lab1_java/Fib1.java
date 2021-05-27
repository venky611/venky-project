package Lab1_java;
import java.io.*;
import java.lang.*;
public class Fib1 {
	int fib(int n) {
		if(n==1)
		return (1);
		else if(n==2)
		return (1);
		else
		return (fib(n-1)+fib(n-2));
		}
		}
		class FibR {
		public static void main(String args[])throws Exception {
		InputStreamReader obj=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(obj);
		System.out.print("Enter value of n: ");
		int n=Integer.parseInt(br.readLine());
		Fib1 ob=new Fib1();
		System.out.print("Fibonaccie Series is:");
		int r=0;
		for(int i=1;i<=n;i++) {
		r=ob.fib(i);
		System.out.print(" "+r);
		}
		System.out.println();
		System.out.println(n+"th number of the series is: "+r);
		}
}
