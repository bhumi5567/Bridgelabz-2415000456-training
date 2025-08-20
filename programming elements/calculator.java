package programming_elements;

import java.util.*;

public class calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        double sum = a+b;
        double difference = a-b;
        double product = a*b;
        double division = a/b;
        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers is "+sum + difference + product +division );
        sc.close();
    }
}

