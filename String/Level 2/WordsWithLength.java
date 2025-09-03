package string;
import java.util.Scanner;
public class WordsWithLength {
	
	    public static int findLength(String s) {
	        int c = 0;
	        for (char a : s.toCharArray()) c++;
	        return c;
	    }

	    public static String[] splitWithCharAt(String s) {
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

	    public static String[][] wordsWithLength(String[] words) {
	        String[][] result = new String[words.length][2];
	        for (int i = 0; i < words.length; i++) {
	            result[i][0] = words[i];
	            result[i][1] = String.valueOf(findLength(words[i]));
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String text = sc.nextLine();
	        String[] words = splitWithCharAt(text);
	        String[][] wordTable = wordsWithLength(words);
	        System.out.println("Word\tLength");
	        for (String[] row : wordTable) {
	            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
	        }
	    }
	}


