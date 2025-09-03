package string;
import java.util.Scanner;
public class TrimString {
	
	    public static int[] trim(String s) {
	        int start = 0, end = s.length() - 1;
	        while (start <= end && s.charAt(start) == ' ') start++;
	        while (end >= start && s.charAt(end) == ' ') end--;
	        return new int[]{start, end + 1};
	    }

	    public static String substringWithCharAt(String s, int start, int end) {
	        String result = "";
	        for (int i = start; i < end; i++) result += s.charAt(i);
	        return result;
	    }

	    public static boolean compareWithCharAt(String s1, String s2) {
	        if (s1.length() != s2.length()) return false;
	        for (int i = 0; i < s1.length(); i++) if (s1.charAt(i) != s2.charAt(i)) return false;
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String text = sc.nextLine();
	        int[] indices = trim(text);
	        String manualTrim = substringWithCharAt(text, indices[0], indices[1]);
	        String builtInTrim = text.trim();
	        boolean result = compareWithCharAt(manualTrim, builtInTrim);
	        System.out.println("Manual trim: '" + manualTrim + "'");
	        System.out.println("Built-in trim: '" + builtInTrim + "'");
	        System.out.println("Both are equal: " + result);
	    }
	}


