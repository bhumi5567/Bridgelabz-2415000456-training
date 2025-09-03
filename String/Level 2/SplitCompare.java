package string;
import java.util.Scanner;
public class SplitCompare {
	
	    public static int findLength(String s) {
	        int count = 0;
	        for (char c : s.toCharArray()) count++;
	        return count;
	    }

	    public static String[] CharAt(String s) {
	        int len = findLength(s);
	        int spaceCount = 0;
	        for (int i = 0; i < len; i++) {
	            if (s.charAt(i) == ' ') spaceCount++;
	        }
	        int[] spaceIndex = new int[spaceCount + 2];
	        spaceIndex[0] = -1;
	        int idx = 1;
	        for (int i = 0; i < len; i++) {
	            if (s.charAt(i) == ' ') spaceIndex[idx++] = i;
	        }
	        spaceIndex[spaceCount + 1] = len;

	        String[] words = new String[spaceCount + 1];
	        for (int i = 0; i < words.length; i++) {
	            String w = "";
	            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
	                w += s.charAt(j);
	            }
	            words[i] = w;
	        }
	        return words;
	    }

	    public static boolean compareArrays(String[] a, String[] b) {
	        if (a.length != b.length) return false;
	        for (int i = 0; i < a.length; i++) {
	            if (!a[i].equals(b[i])) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String text = sc.nextLine();
	        String[] manualSplit = CharAt(text);
	        String[] builtInSplit = text.split(" ");
	        boolean result = compareArrays(manualSplit, builtInSplit);
	        System.out.println("Manual split:");
	        for (String w : manualSplit) System.out.println(w);
	        System.out.println("Built-in split:");
	        for (String w : builtInSplit) System.out.println(w);
	        System.out.println("Both are equal: " + result);
	    }
	}



