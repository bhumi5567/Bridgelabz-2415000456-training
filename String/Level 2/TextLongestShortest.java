package string;
import java.util.*;
public class TextLongestShortest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name =sc.nextLine();
		String[] str=name.split("\\s+");
		int min= Integer.MAX_VALUE;
		int max= Integer.MIN_VALUE;
		int min_index=0,max_index=0;
		for(int i=0;i<str.length;i++) {
			if(min> str[i].length()) {
				min=str[i].length();
				min_index=i;
			}
			if(max<str[i].length()) {
				max=str[i].length();
				max_index=i;
			}
			
		}
		System.out.println("min length word :- "+str[min_index]);
		System.out.println("max length word :- "+str[max_index]);
		
	}


}
