package programming_elements;

import java.util.Scanner;

public class totalPurchase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter unit price:");
		double unitPrice=sc.nextDouble();
		System.out.println("enter quantity:");
		double quantity=sc.nextDouble();
		System.out.printf("The total purchase price is INR "+unitPrice*quantity);
		sc.close();
}
}