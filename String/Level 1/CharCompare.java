package string;
import java.util.Scanner;
public class CharCompare {
	
	    public static char[] getChars(String s) {
	        char[] arr = new char[s.length()];
	        for (int i = 0; i < s.length(); i++) {
	            arr[i] = s.charAt(i);
	        }
	        return arr;
	    }

	    public static boolean Arrays(char[] a, char[] b) {
	        if (a.length != b.length) return false;
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] != b[i]) return false;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String text = sc.next();
	        char[] arr1 = getChars(text);
	        char[] arr2 = text.toCharArray();
	        boolean result = Arrays(arr1, arr2);
	        System.out.print("User-defined array: ");
	        for (char c : arr1) System.out.print(c + " ");
	        System.out.println();
	        System.out.print("Built-in array: ");
	        for (char c : arr2) System.out.print(c + " ");
	        System.out.println();
	        System.out.println("Both arrays are equal: " + result);
	    }
	}


