package Level_1;
import java.util.*;

public class odd_even {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("error occcured");
			return;
		}
		int t=(n/2)+1;
		int[] odd=new int[t];
		int[] even=new int[t];
		int oddindex=0;
		int evenindex=0;
		for(int i=1;i<=n;i++) {
			if(i % 2==0) {
				even[evenindex++]=i;
			}
			else {
				odd[oddindex++]=i;
			}
		}
		for(int i=0;i<oddindex;i++) {
			System.out.print(odd[i]);
		}
		for(int i=0;i<evenindex;i++) {
			System.out.print(even[i]);
	}

}}
