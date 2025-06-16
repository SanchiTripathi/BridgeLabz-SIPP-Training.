package Level2;
import java.util.*;
public class odd_even {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		if(n<0) {
			System.out.println("Invalid output please enter the number who is greater than 0");
		}
		else if(n ==0) {
			System.out.println("0 is neither a odd number nor a even number");
		}
		else if(n % 2 ==0) {
			for(int i=2;i<=n;i+=2) {
				System.out.println(i);
			}
		}
		else {
			for(int i=1;i<=n;i+=2) {
				System.out.println(i);
			}
		}
		

	}

}