package array;
import java.util.Scanner;
public class YoungestTallest {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String[] name = {"Amar", "Akbar", "Anthony"};
	        int[] age = new int[3];
	        double[] height = new double[3];
	        for (int i = 0; i < 3; i++) {
	            System.out.print("Enter age of " + name[i] + ": ");
	            age[i] = sc.nextInt();
	            System.out.print("Enter height of " + name[i] + ": ");
	            height[i] = sc.nextDouble();
	        }
	        int minAgeIndex = 0, maxHeightIndex = 0;
	        for (int i = 1; i < 3; i++) {
	            if (age[i] < age[minAgeIndex]) minAgeIndex = i;
	            if (height[i] > height[maxHeightIndex]) maxHeightIndex = i;
	        }
	        System.out.println("Youngest friend: " + name[minAgeIndex]);
	        System.out.println("Tallest friend: " + name[maxHeightIndex]);
	        sc.close();
	    }
	}


