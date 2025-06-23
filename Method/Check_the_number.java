package Method;
import java.util.*;
public class Check_the_number {
	public static int checkNumber(int n) {
		if(n>0) {
			return 1;
		}
		else if(n<0) {
			return -1;
		}
		else if(n == 0) {
			return 0;
		}
		return n;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int result =checkNumber(n);
		 if (result == 1) {
	            System.out.println("The number is positive.");
	     }
		 else if (result == -1) {
	            System.out.println("The number is negative.");
	     }
		 else {
	            System.out.println("The number is zero.");
	     }
		

	}

}
