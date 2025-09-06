package method;
import java.util.*;

public class NumberCheckUtility {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }

    public static int[] storeDigits(int n) {
        String s = String.valueOf(n);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int[] digits) {
        int n = digits.length, sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        int num = 0;
        for (int d : digits) num = num * 10 + d;
        return sum == num;
    }

    public static int[] largestAndSecondLargest(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) second = d;
        }
        return new int[]{first, second};
    }

    public static int[] smallestAndSecondSmallest(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) second = d;
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = storeDigits(number);
        System.out.println("Duck: " + isDuck(digits));
        System.out.println("Armstrong: " + isArmstrong(digits));
        System.out.println("Largest & Second Largest: " + Arrays.toString(largestAndSecondLargest(digits)));
        System.out.println("Smallest & Second Smallest: " + Arrays.toString(smallestAndSecondSmallest(digits)));
    }
}

