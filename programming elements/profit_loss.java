package programming_elements;

public class profit_loss {
	public static void main (String[] args) {
		int cp=129;
		int sp=191;
		double profit=sp-cp;
		double percent = (profit/cp)*100;
		System.out.println("The cp is INR 129 and the sp is INR 191");
		System.out.print("The profit is INR "+profit+" and the percent is "+percent);
	}

}
