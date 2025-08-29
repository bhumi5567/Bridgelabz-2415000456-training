package array;
import java.util.Scanner;
public class StudentMarks2D {	
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        System.out.print("Enter no of students: ");
	        int n = sc.nextInt();
	        int[][] marks = new int[n][3];
	        double[] per = new double[n];
	        String[] grade = new String[n];
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter Physics, Chemistry, Maths marks " + (i + 1) + ": ");
	            for (int j = 0; j < 3; j++) marks[i][j] = sc.nextInt();
	            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
	                System.out.println("Invalid marks");
	                i--;
	                continue;
	            }
	            per[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
	            if (per[i] >= 90) grade[i] = "A";
	            else if (per[i] >= 75) grade[i] = "B";
	            else if (per[i] >= 50) grade[i] = "C";
	            else grade[i] = "D";
	        }
	        for (int i = 0; i < n; i++) {
	            System.out.println("Student " + (i + 1) + ": Physics=" + marks[i][0] + " Chemistry=" + marks[i][1] + " Maths=" + marks[i][2] + " Percentage=" + per[i] + " Grade=" + grade[i]);
	        }
	        sc.close();
	    }
	}


