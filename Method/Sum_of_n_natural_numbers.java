package Method;
import java.util.*;
public class Sum_of_n_natural_numbers {
	public static int findSum(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum += i;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		int sum= findSum(n);
		System.out.println(sum);

	}

}
