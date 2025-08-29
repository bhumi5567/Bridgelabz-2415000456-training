package array;
import java.util.Scanner;
public class FrequencyOfDigit {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        String s = String.valueOf(n);
	        int[] freq = new int[10];
	        for (int i = 0; i < s.length(); i++) {
	            int d = s.charAt(i) - '0';
	            freq[d]++;
	        }
	        System.out.println("Digit frequencies:");
	        for (int i = 0; i < 10; i++) {
	            if (freq[i] > 0) System.out.println(i + " -> " + freq[i]);
	        }
	        sc.close();
	    }
	}


