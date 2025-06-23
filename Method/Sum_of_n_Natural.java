package Method;
import java.util.*;
public class Sum_of_n_Natural {
	public static int recursiveSum(int n) {
		if(n == 1) {
			return 1;
		}
		if(n<1) {
			return 0;
		}
		return n+recursiveSum(n-1);
	}
	public static int formulateSum(int n) {
		if(n<1) {
			return 0;
		}
		return n*(n+1)/2;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int recursive = recursiveSum(n);
		int formulateSum= formulateSum(n);
		if(recursive == formulateSum) {
			System.out.println("both computations is correct"+ formulateSum);
		}
		else {
			System.out.println("both computation is incorrect please check logic!");
		}

	}

}
