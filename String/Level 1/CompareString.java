package string;
import java.util.Scanner;
public class CompareString {
	
	    public static boolean CharAt(String s1, String s2) {
	        if (s1.length() != s2.length()) return false;
	        for (int i = 0; i < s1.length(); i++) {
	            if (s1.charAt(i) != s2.charAt(i)) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String first = sc.next();
	        String second = sc.next();
	        boolean charAtResult =CharAt(first, second);
	        boolean equalsResult = first.equals(second);
	        System.out.println("charAt() comparison: " + charAtResult);
	        System.out.println("equals() comparison: " + equalsResult);
	        System.out.println("Both methods give same result: " + (charAtResult == equalsResult));
	    }
	}



