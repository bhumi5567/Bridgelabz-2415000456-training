package main;
import java.util.Scanner;
public class VolumeofaCylinder {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double pi=3.14139;
        int r = sc.nextInt();
        int h = sc.nextInt();
        System.out.println("Volume of cylinder:"+pi*r*r*h);
        sc.close();

    }

}
