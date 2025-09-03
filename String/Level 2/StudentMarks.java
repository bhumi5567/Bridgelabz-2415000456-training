package string;
import java.util.Scanner;
public class StudentMarks {
	
	    public static String getGrade(double percent) {
	        if (percent >= 90) return "A";
	        else if (percent >= 75) return "B";
	        else if (percent >= 60) return "C";
	        else if (percent >= 40) return "D";
	        else return "F";
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of students: ");
	        int n = sc.nextInt();

	        int[][] marks = new int[n][3];
	        double[] percent = new double[n];
	        String[] grade = new String[n];

	        System.out.println("\nEnter marks of Physics, Chemistry, Maths:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Student " + (i + 1) + ": ");
	            marks[i][0] = sc.nextInt();
	            marks[i][1] = sc.nextInt();
	            marks[i][2] = sc.nextInt();

	            int total = marks[i][0] + marks[i][1] + marks[i][2];
	            percent[i] = Math.round((total / 3.0) * 100.0) / 100.0;
	            grade[i] = getGrade(percent[i]);
	        }

	        System.out.println("\nStudent\tPhysics\tChem\tMaths\t%age\tGrade");
	        for (int i = 0; i < n; i++) {
	            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" +
	                               marks[i][2] + "\t" + percent[i] + "\t" + grade[i]);
	        }
	    }
	}


