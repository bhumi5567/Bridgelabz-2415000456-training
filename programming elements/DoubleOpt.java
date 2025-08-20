package programming_elements;
import java.util.Scanner;
public class DoubleOpt {

			public static void main (String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("enter num1:");
				double a=sc.nextInt();
				System.out.println("enter num2:");
				double b=sc.nextInt();
				System.out.println("enter num3:");
				double c=sc.nextInt();
				double A=a+b*c;
				double B=a*b+c;
				double C=c+a/b;
				double D=a%b+c;
				System.out.println(A);
				System.out.println(B);
				System.out.println(C);
				System.out.println(D);
				sc.close();
	}
	}


