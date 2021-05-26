package day2;
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("No of Rows");
		int rows =sc.nextInt();
		
		System.out.println("pattern :");
		System.out.println(0);
		for(int i=2;i<=rows;i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(j*i);
			}
			System.out.println();
		}
		sc.close();
	}

}
