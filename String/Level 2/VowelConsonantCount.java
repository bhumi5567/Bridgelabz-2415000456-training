package string;
import java.util.Scanner;
public class VowelConsonantCount {
	
	    public static boolean isLetter(char ch) {
	        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
	    }

	    public static boolean isVowel(char ch) {
	        char lower = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
	        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
	    }

	    public static int[] count(String s) {
	        int vowels = 0, consonants = 0;
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            if (isLetter(ch)) {
	                if (isVowel(ch)) vowels++;
	                else consonants++;
	            }
	        }
	        return new int[]{vowels, consonants};
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String text = sc.nextLine();
	        int[] counts = count(text);
	        System.out.println("Vowels: " + counts[0]);
	        System.out.println("Consonants: " + counts[1]);
	    }
	}


