package Method;
import java.util.*;
public class Print_Quotient_Remainder {
	public static int[] findRemainderAndQuotient(int n, int divisor) {
			int Q= n/divisor;
			int R= n%divisor;
			return new int[] {Q,R};
		}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int divisor = sc.nextInt();
		
		
		if(divisor ==0) {
			System.out.println("Cannot divide 0");
		}
		else {
			int result[] = findRemainderAndQuotient(n,divisor);
			
			System.out.println("Quotient:" + result[0]);
			System.out.println("Remainder:"+ result[1]);
		}

	}

}
