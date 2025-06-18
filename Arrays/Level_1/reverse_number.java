package Level_1;
import java.util.*;
public class reverse_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int temp=n;
		int count=0;
		while(temp>0) {
			temp /=10;
			count++;
		}
		int[] digit =new int[count];
		for(int i=count-1;i>=0;i--) {
			digit[i]=n%10;
			n /=10;
		}
        System.out.print("Reverse number is:");
        for(int i=digit.length-1;i>=0;i--) {
        	System.out.println(digit[i]);
        }
	}

}
