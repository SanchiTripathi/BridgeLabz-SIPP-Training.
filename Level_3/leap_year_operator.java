package Level_3;
import java.util.*;

public class leap_year_operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 1582 && (n % 400 == 0 || (n % 4 == 0 && n % 100 != 0))) {
            System.out.println(n + " is a Leap Year.");
        } else if (n >= 1582) {
            System.out.println(n + " is Not a Leap Year.");
        } else {
            System.out.println("Invalid year. Leap year check only works for year >= 1582.");
        }

	}

}
