package programming_elements;
import java.util.*;
public class userinput_unidiscount {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter fee:");
		double fee=sc.nextDouble();
		System.out.println("enter discount percent:");
		double discountPercent=sc.nextDouble();
		double discount=fee*discountPercent;
		double pay =fee-discount;
		System.out.printf("The discount amount is INR "+ discount+" and final discounted fee is INR "+ pay);
		sc.close();
	}

}
