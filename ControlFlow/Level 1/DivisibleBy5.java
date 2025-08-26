package ControlFlow;

import java.util.Scanner;

public class DivisibleBy5 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	if(n%5==0)
			System.out.print("Divisible");
	else
		System.out.print("not");
		
	sc.close();
		}

}

