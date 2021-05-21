package core_java2;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int Rev=0;
		int i;
		while(n>0)
		{
			i=n%10;
			Rev=i+(Rev*10);
			n=n/10;
		}
System.out.println(Rev);
	}

}
