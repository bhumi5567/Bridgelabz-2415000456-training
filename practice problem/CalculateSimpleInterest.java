package main;
import java.util.Scanner;
public class CalculateSimpleInterest {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        System.out.println("Simple Interest:"+(p*r*t)/100);
        sc.close();

    }

}
