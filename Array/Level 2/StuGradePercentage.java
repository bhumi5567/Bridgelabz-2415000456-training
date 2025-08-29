package array;
import java.util.Scanner;
public class StuGradePercentage {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();
	        int[] physics = new int[n];
	        int[] chemistry = new int[n];
	        int[] maths = new int[n];
	        double[] percentage = new double[n];
	        String[] grade = new String[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter Physics marks for student " + (i + 1) + ": ");
	            physics[i] = sc.nextInt();
	            System.out.print("Enter Chemistry marks for student " + (i + 1) + ": ");
	            chemistry[i] = sc.nextInt();
	            System.out.print("Enter Maths marks for student " + (i + 1) + ": ");
	            maths[i] = sc.nextInt();
	            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
	                System.out.println("Invalid marks, enter again");
	                i--;
	                continue;
	            }
	            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
	            if (percentage[i] >= 90) grade[i] = "A";
	            else if (percentage[i] >= 75) grade[i] = "B";
	            else if (percentage[i] >= 50) grade[i] = "C";
	            else grade[i] = "D";
	        }
	        for (int i = 0; i < n; i++) {
	            System.out.println("Student " + (i + 1) + ": Physics=" + physics[i] + " Chemistry=" + chemistry[i] + " Maths=" + maths[i] + " Percentage=" + percentage[i] + " Grade=" + grade[i]);
	        }
	        sc.close();
	    }
	}


