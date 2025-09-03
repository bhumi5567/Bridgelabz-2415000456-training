package string;
import java.util.Scanner;
public class UppercaseCompare {
	
	    public static String toUpperCaseManual(String s) {
	        String result = "";
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            if (ch >= 'a' && ch <= 'z') {
	                result += (char)(ch - 32);
	            } else {
	                result += ch;
	            }
	        }
	        return result;
	    }

	    public static boolean CharAt(String s1, String s2) {
	        if (s1.length() != s2.length()) return false;
	        for (int i = 0; i < s1.length(); i++) {
	            if (s1.charAt(i) != s2.charAt(i)) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String text = sc.nextLine();
	        String manualUpper = toUpperCaseManual(text);
	        String builtInUpper = text.toUpperCase();
	        boolean result = CharAt(manualUpper, builtInUpper);
	        System.out.println("Manual uppercase: " + manualUpper);
	        System.out.println("Built-in uppercase: " + builtInUpper);
	        System.out.println("Both results are equal: " + result);
	    }
	}


