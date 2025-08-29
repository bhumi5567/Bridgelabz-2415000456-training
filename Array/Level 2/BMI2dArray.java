package array;
import java.util.Scanner;
public class BMI2dArray {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of persons: ");
	        int n = sc.nextInt();
	        double[][] Data = new double[n][3];
	        String[] status = new String[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter weight of person " + (i + 1) + ": ");
	            double w = sc.nextDouble();
	            System.out.print("Enter height of person " + (i + 1) + ": ");
	            double h = sc.nextDouble();
	            if (w <= 0 || h <= 0) {
	                System.out.println("Invalid input, enter again");
	                i--;
	                continue;
	            }
	            Data[i][0] = w;
	            Data[i][1] = h;
	           Data[i][2] = w / (h * h);
	            if (Data[i][2] < 18.5) status[i] = "Underweight";
	            else if (Data[i][2] < 25) status[i] = "Normal";
	            else if (Data[i][2] < 30) status[i] = "Overweight";
	            else status[i] = "Obese";
	        }
	        for (int i = 0; i < n; i++) {
	            System.out.println("Person " + (i + 1) + ": Height=" + Data[i][1] + " Weight=" + Data[i][0] + " BMI=" + Data[i][2] + " Status=" + status[i]);
	        }
	        sc.close();
	    }
	}


