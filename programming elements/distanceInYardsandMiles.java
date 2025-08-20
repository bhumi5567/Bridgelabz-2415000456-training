package programming_elements;

import java.util.Scanner;

public class distanceInYardsandMiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter distance in cm:");
		double dis=sc.nextDouble();
		double yard=dis*3;
		double mile=yard*1760;
		System.out.print("The distance in yard is "+yard+" and in miles is "+mile);
		sc.close();
}
}