package day2;
import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {

	    {
	        float fah;
	        double cel;
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Temperature in Fahrenheit : ");
	        fah = sc.nextFloat();

	        cel = (fah-32) / 1.8;

	        System.out.print("Equivalent Temperature in Celsius = " + cel);sc.close();

	}

	}
}