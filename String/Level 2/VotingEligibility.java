package string;
import java.util.Scanner;
public class VotingEligibility {
	
	    public static String checkEligibility(int age) {
	        if (age >= 18) return "Eligible";
	        return "Not Eligible";
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int[] ages = new int[10];
	        String[] result = new String[10];

	        System.out.println("Enter ages of 10 students:");
	        for (int i = 0; i < 10; i++) {
	            ages[i] = sc.nextInt();
	            result[i] = checkEligibility(ages[i]);
	        }

	        System.out.println("\nStudent\tAge\tStatus");
	        for (int i = 0; i < 10; i++) {
	            System.out.println((i + 1) + "\t" + ages[i] + "\t" + result[i]);
	        }
	    }
	}


