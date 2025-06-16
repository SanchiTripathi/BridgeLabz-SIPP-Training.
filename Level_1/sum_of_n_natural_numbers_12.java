package Level_1;
import java.util.*;

public class sum_of_n_natural_numbers_12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the input");
		int n = sc.nextInt();
		if(n<0) {
			System.out.println("Invalid Input please enter the number who is greater then 0");
		}
		else {
			// Sum using formula
			int sum = n*(n+1)/2;
			
			//sum using while 
			int sum1=0;
			int i=1;
			while(i <=n) {
				sum1+=i;
				i++;
			}
			System.out.println("The sum of using Formula is" +sum);
			System.out.println("the sum using while loop is" +sum1);
			
			//Compare the results
			if(sum1 == sum) {
				System.out.println("Both sum are equal ");
			}
			else {
				System.out.println("Both sum are not equal ");
			}
		}

	}

}
