package main;
import java.util.Scanner;
public class PowerCalculation {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double pi=3.14139;
        int a = sc.nextInt();
        int b = sc.nextInt();
        double result = Math.pow(a, b);
        System.out.println(result);
        sc.close();

    }

}
