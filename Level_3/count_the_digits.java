package Level_3;
import java.util.*;

public class count_the_digits {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int count = 0;

	        if (n == 0) {
	            count = 1;
	        } else {
	            if (n < 0) {
	               n=-n;
	            }

	            while (n != 0) {
	                n = n / 10;
	                count++;
	            }
	        }

	        System.out.println("Number of digits: " + count);

}}
