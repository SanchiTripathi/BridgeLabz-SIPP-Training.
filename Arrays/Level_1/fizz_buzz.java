package Level_1;
import java.util.*;

public class fizz_buzz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n+1];
		for(int i =0;i<=n;i++) {
		if(i%3==0) {
			arr[i]= "Fizz";
		}
		else if(i%5==0) {
			arr[i]= "buzz";
		}
		else if(i%3==0 && i%5==0) {
			arr[i]= "Fizz Buzz";
		}
		else {
			arr[i]=Integer.toString(i);
		}
	
		

	}
		for(int i=0;i<=n;i++) {
			System.out.println("position for" +i+ "is" +arr[i]);
		}

}}
