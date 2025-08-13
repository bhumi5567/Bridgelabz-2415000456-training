package main;
import java.util.Scanner;
public class PerimeterofaRectangle {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double pi=3.14139;
        int l = sc.nextInt();
        int w = sc.nextInt();
        System.out.println("Perimeter:"+2*(l+w));
        sc.close();

    }

}
