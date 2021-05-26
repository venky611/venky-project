package day2;

public class AverageofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numbers= new int[] {10,20,40,45,100};
int sum=0;
for(int i=0;i<numbers.length;i++)
sum = sum + numbers[i];
double average= sum/numbers.length;
System.out.println("average of Array :" +average);

	}

}
