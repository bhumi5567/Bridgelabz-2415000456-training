package ControlFlow;
import java.util.Scanner;
public class LaunchWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number for countdown: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        System.out.println("Launch!");
	}
}
