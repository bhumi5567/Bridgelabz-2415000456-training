package main;
import java.util.Scanner;
public class ConvertKilometerstoMiles {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	float a = sc.nextInt();
    	double m=a*0.162137;
        System.out.printf("Formatted value: %.4f%n", m);
        // Output: Formatted value: 123.4568
        sc.close();
    }

}
