package programming_elements;

public class uni_course {
	public static void main (String[] args) {
		int fee=125000;
		double discountPercent=.10;
		double discount=fee*discountPercent;
		double pay =fee-discount;
		System.out.print("The discount amount is INR "+ discount+" and final discounted fee is INR "+ pay);
	}

}
