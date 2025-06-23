package Method;
import java.util.*;
public class Calendar {
	// Array for month names
    static String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array for number of days in each month
    static int[] daysInMonth = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);
    }

    // Method to print calendar
    static void printCalendar(int month, int year) {
        String monthName = monthNames[month - 1];
        int days = getDaysInMonth(month, year);
        int startDay = getStartDay(month, year);

        // Header
        System.out.println("\n  " + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Initial spacing
        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        // Print days
        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if ((i + startDay) % 7 == 0) System.out.println();
        }
        System.out.println();
    }

    // Method to get number of days in a month
    static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    // Method to check for leap year
    static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the first day of the month using Gregorian formula
    static int getStartDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0; // 0 = Sunday, 1 = Monday, ..., 6 = Saturday
    }

}
