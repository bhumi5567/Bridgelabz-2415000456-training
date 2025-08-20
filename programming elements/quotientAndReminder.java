package programming_elements;

import java.util.Scanner;

public class quotientAndReminder {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1:");
		double a=sc.nextDouble();
		System.out.println("enter num2:");
		double b=sc.nextDouble();
		System.out.printf("The Quotient is "+a/b+" and Reminder is "+a%b);
		sc.close();
}
}