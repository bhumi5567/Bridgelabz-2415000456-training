package programming_elements;

import java.util.Scanner;

public class handshakes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no. of students:");
		int n=sc.nextInt();
		System.out.printf("Handshakes: "+ (n*(n-1))/2);
		sc.close();
}
}