package Level_3;
import java.util.*;
public class prime_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		boolean isPrime = true;
		if(n<1) {
			 isPrime = false;
		}
		else {
		for(int i =2;i<n;i++) {
			if(n%i==0) {
				isPrime = false;;
				break;
			}
		}
		

	}
		if(isPrime) {
			System.out.println(n+ "it is a prime number");
		}
		else {
			System.out.println(n+ "it is not a prime number");
		}

}
}