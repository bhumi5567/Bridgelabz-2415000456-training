package array;
import java.util.Scanner;
public class multipleValueSum {
    public static void main(String[] args) {	        Scanner sc = new Scanner(System.in);
	        double[] arr = new double[10];
	        double t = 0.0;
	        int idx = 0;
	        while (true) {
	            System.out.print("Enter a number: ");
	            double val = sc.nextDouble();
	            if (val <= 0 || idx == 10) break;
	            arr[idx] = val;
	            idx++;
	        }
	        for (int i = 0; i < idx; i++) t += arr[i];
	        System.out.println("Numbers entered:");
	        for (int i = 0; i < idx; i++) System.out.print(arr[i] + " ");
	        System.out.println("\nSum = " + t);
	        sc.close();
	    }
	}


