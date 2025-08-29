package array;
import java.util.Scanner;
public class Array2D {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter rows: ");
	        int rows = sc.nextInt();
	        System.out.print("Enter cols: ");
	        int cols = sc.nextInt();
	        int[][] mat = new int[rows][cols];
	        System.out.println("Enter matrix elements:");
	        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) mat[i][j] = sc.nextInt();
	        int[] array = new int[rows * cols];
	        int k = 0;
	        for (int i = 0; i < rows; i++) for (int j = 0; j < cols; j++) array[k++] = mat[i][j];
	        System.out.println("1D array elements:");
	        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
	        sc.close();
	    }
	}


