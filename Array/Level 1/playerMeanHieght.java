package array;
import java.util.Scanner;
public class playerMeanHieght {
    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        double[] heights = new double[11];
	        double s = 0.0;
	        System.out.println("Enter 11 heights:");
	        for (int i = 0; i < 11; i++) {
	            heights[i] = sc.nextDouble();
	            s += heights[i];
	        }
	        double mean = s / 11;
	        System.out.println("Mean height = " + mean);
	        sc.close();
	    }
	}


