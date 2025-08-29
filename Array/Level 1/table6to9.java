package array;
import java.util.Scanner;
public class table6to9 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int n = sc.nextInt();
	        int[] table = new int[4];
	        for (int i = 6; i <= 9; i++) table[i - 6] = n * i;
	        for (int i = 6; i <= 9; i++) System.out.println(n + " * " + i + " = " + table[i - 6]);
	        sc.close();
	    }
	}


