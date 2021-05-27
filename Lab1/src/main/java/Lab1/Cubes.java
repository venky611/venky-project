package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cubes {
	public static void main(String[] args)  throws Exception {
		double sum=0;
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a num");
		int n =Integer.parseInt(br.readLine());
		while (n>0)
		{
			double i=n%10;
			sum=sum+(Math.pow(i, 3));
			n=n/10;
		}
		System.out.print("Sum of cubes of digits is" +sum);
	}
}
