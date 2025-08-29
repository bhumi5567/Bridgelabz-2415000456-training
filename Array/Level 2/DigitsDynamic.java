package array;
import java.util.Scanner;
public class DigitsDynamic {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        int maxDigit = 10;
	        int[] digits = new int[maxDigit];
	        int index = 0;
	        while (n!= 0) {
	            if (index == maxDigit) {
	                maxDigit += 10;
	                int[] t = new int[maxDigit];
	                for (int j = 0; j < digits.length; j++) t[j] = digits[j];
	                digits = t;
	            }
	            digits[index++] = n % 10;
	            n /= 10;
	        }
	        int largest = 0, second = 0;
	        for (int i = 0; i < index; i++) {
	            if (digits[i] > largest) {
	                second = largest;
	                largest = digits[i];
	            } else if (digits[i] > second && digits[i] != largest) {
	                second = digits[i];
	            }
	        }
	        System.out.println("Largest digit = " + largest);
	        System.out.println("Second largest digit = " + second);
	        sc.close();
	    }
	}


