package Level_1;
import java.util.*;

public class sum_of_n_natural_number_13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value");
		int n= sc.nextInt();
		if(n<0) {
			System.out.println("Invalid output please enter the number greater than 0");
		}
		else {
			//using formula
			int sum = n*(n+1)/2;
			
			// using for loop
			int sum1= 0;
			for(int i=1;i<=n;i++){
				sum1 +=i;
		}
		System.out.println("the sum using formula is: "+sum);
		System.out.println("the sum using for loop is: "+sum1);
		if(sum1 == sum) {
			System.out.println("Both sum are equal");
		}
		else {
			System.out.println("Both sum are not equal");
		}
	}

	}

}
