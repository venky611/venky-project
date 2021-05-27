package Lab1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primenumbers {
	public static void main(String[] args)
			throws Exception
	{
		int i ;
		int j;
		int count=0;
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			int n1 = Integer.parseInt(s);
			for(i=2;i<=100;i++)
			{
			
			for(j=1;j<=i;j++)
			{
			if(i%j==0)
			count++;
			}
			if(count==2)

			System.out.print(" "+i);
			count=0;
		
		}
	}
}
