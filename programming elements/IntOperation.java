package programming_elements;

import java.util.Scanner;

public class IntOperation {

		public static void main (String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter num1:");
			int a=sc.nextInt();
			System.out.println("enter num2:");
			int b=sc.nextInt();
			System.out.println("enter num3:");
			int c=sc.nextInt();
			int A=a+b*c;
			int B=a*b+c;
			int C=c+a/b;
			int D=a%b+c;
			System.out.println(A);
			System.out.println(B);
			System.out.println(C);
			System.out.println(D);
			sc.close();
}
}