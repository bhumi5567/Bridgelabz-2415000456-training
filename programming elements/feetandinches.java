package programming_elements;
import java.util.*;
public class feetandinches {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		float h=sc.nextFloat();
		double inch=h*2.54;
		double foot=12*2.54*h;
		System.out.print("Your  Height in cm is "+ h+" while in feet is "+foot+" and inches is "+inch);
		sc.close();
	}

}
