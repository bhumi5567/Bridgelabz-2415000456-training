import java.util.*;
public class calender {

		    public static boolean isLeapYear(int year) {
		        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
		    }

		    public static String getMonthName(int month) {
		        String[] months = {
		            "January", "February", "March", "April", "May", "June",
		            "July", "August", "September", "October", "November", "December"
		        };
		        return months[month - 1];
		    }

		    public static int getDaysInMonth(int month, int year) {
		        int[] daysInMonth = {
		            31, 28, 31, 30, 31, 30,
		            31, 31, 30, 31, 30, 31
		        };
		        if (month == 2 && isLeapYear(year)) {
		            return 29;
		        } else {
		            return daysInMonth[month - 1];
		        }
		    }

		    public static int getFirstDayOfMonth(int month, int year) {
		        int y = year;
		        int m = month;
		        int d = 1; 

		        int y0 = y - (14 - m) / 12;
		        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		        int m0 = m + 12 * ((14 - m) / 12) - 2;
		        int d0 = (d + x + (31 * m0) / 12) % 7;

		     
		        return d0;
		    }

		    public static void displayCalendar(int month, int year) {
		        String monthName = getMonthName(month);
		        int days = getDaysInMonth(month, year);
		        int firstDay = getFirstDayOfMonth(month, year);

		        System.out.println(monthName + " " + year);
		        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

		       
		        for (int i = 0; i < firstDay; i++) {
		            System.out.print("    ");
		        }

		       
		        for (int day = 1; day <= days; day++) {
		          
		            String dayStr = day < 10 ? "  " + day : " " + day;
		            System.out.print(dayStr + " ");

		           
		            if ((firstDay + day) % 7 == 0) {
		                System.out.println();
		            }
		        }
		        System.out.println();
		    }

		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter month and year (MM YYYY): ");
		        int month = sc.nextInt();
		        int year = sc.nextInt();

		        displayCalendar(month, year);
		        sc.close();
		    }
		}


	
