package array;
import java.util.Scanner;
public class FactorArray {	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number to find factors: ");
	        int n = sc.nextInt();
	        int maxfactor = 10;
	        int[] factors = new int[maxfactor];
	        int index = 0;
	        for (int i = 1; i <= n; i++) {
	            if (n % i == 0) {
	                if (index == maxfactor) {
	                    maxfactor *= 2;
	                    int[] t = new int[maxfactor];
	                    for (int j = 0; j < factors.length; j++) t[j] = factors[j];
	                    factors = t;
	                }
	                factors[index++] = i;
	            }
	        }
	        System.out.println("Factors of " + n + ":");
	        for (int i = 0; i < index; i++) System.out.print(factors[i] + " ");
	        sc.close();
	    }
	}


