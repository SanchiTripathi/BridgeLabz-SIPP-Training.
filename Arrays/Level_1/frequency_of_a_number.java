package Level_1;
import java.util.*;

public class frequency_of_a_number {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int[] frequency = new int[10];
	 while(n>0) {
		 int digit =n%10;
		 frequency[digit]++;
		 n=n/10;
	 }
	 System.out.println("Digits of frequencies is: ");
	 for(int i=0;i<10;i++) {
		 if(frequency[i]>0) {
			 System.out.println("Digit" +i+ ":" +frequency[i]+ "times");
		 }
	 }

	}

}
