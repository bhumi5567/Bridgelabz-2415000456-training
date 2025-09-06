package method;
import java.util.Scanner;
public class TrianglePark {
	    public static int calculateRounds(double a, double b, double c) {
	        double perimeter = a + b + c;
	        return (int)Math.ceil(5000 / perimeter);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter side 1: ");
	        double side1 = sc.nextDouble();
	        System.out.print("Enter side 2: ");
	        double side2 = sc.nextDouble();
	        System.out.print("Enter side 3: ");
	        double side3 = sc.nextDouble();
	        int rounds = calculateRounds(side1, side2, side3);
	        System.out.println("The athlete must complete " + rounds + " rounds");
	        sc.close();
	    }
	}


