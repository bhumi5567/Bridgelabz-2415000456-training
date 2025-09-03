package string;
import java.util.Scanner;
public class VowelConsonantType {
	
	    public static String getType(char ch) {
	        char lower = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : ch;
	        if ((lower >= 'a' && lower <= 'z')) {
	            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') return "Vowel";
	            else return "Consonant";
	        }
	        return "Not a Letter";
	    }

	    public static String[][] classifyCharacters(String s) {
	        String[][] result = new String[s.length()][2];
	        for (int i = 0; i < s.length(); i++) {
	            char ch = s.charAt(i);
	            result[i][0] = String.valueOf(ch);
	            result[i][1] = getType(ch);
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String text = sc.nextLine();
	        String[][] classified = classifyCharacters(text);
	        System.out.println("Char\tType");
	        for (String[] row : classified) {
	            System.out.println(row[0] + "\t" + row[1]);
	        }
	    }
	}


