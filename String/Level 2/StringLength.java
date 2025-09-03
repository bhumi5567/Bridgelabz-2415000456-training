package string;
import java.util.Scanner;
public class StringLength {
	 public static int findLength(String s) {
	        int c = 0;
	        for (char a : s.toCharArray()) {
	            c++;
	        }
	        return c;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String text = sc.next();
	        int manualLength = findLength(text);
	        int builtInLength = text.length();
	        System.out.println("Manual length: " + manualLength);
	        System.out.println("Built-in length: " + builtInLength);
	    }
	}



