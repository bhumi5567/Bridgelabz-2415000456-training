package programming_elements;

import java.util.Scanner;

public class areOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double b=sc.nextDouble();
		double h=sc.nextDouble();
		double area=b*h*.5;
		double areai=area*2.54;
		double areaf=area*12*2.54;
		System.out.print("Your area in cm is"+area+" while in feet is "+areaf+" and inches is "+areai);
		sc.close();
	}

}
