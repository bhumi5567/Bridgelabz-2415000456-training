package array;
import java.util.Scanner;
public class ReverseDigits {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n= sc.nextInt();
	        String s = String.valueOf(n);
	        int[] digits = new int[s.length()];
	        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
	        System.out.println("Reversed number:");
	        for (int i = digits.length - 1; i >= 0; i--) System.out.print(digits[i]);
	        sc.close();
	    }
	}


