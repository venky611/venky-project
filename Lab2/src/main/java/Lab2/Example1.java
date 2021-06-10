package Lab2;
import java.util.Arrays;
import java.util.Scanner;
public class Example1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of elements : ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(getSecondSmallest(arr));
		
	}
		public static int getSecondSmallest(int[] arr) {
			Arrays.sort(arr);
			return arr[1];
		}
}
