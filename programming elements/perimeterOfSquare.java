package programming_elements;

import java.util.Scanner;

public class perimeterOfSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double perimeter=sc.nextDouble();
		double side=perimeter/4;
		System.out.print(" The length of the side is "+side+" whose perimeter is "+perimeter);
		sc.close();
}
}