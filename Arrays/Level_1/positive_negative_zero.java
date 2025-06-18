package Level_1;
import java.util.*;
public class positive_negative_zero {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int n=sc.nextInt();
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
			for(int i =0;i<arr.length;i++) {
			if(arr[i]<0) {
				System.out.println("negative number");
			}
			else if(arr[i]==0) {
				System.out.println("It is Zero");
			}
			else if(arr[i]>0) {
				System.out.println("positive number");
				if(arr[i]%2==0) {
					System.out.println("even number");
				}
			
				else {
					System.out.println("odd number");
				}
			}
		
			
	
			

	}
			int first = arr[0];
	        int last = arr[arr.length - 1];

	        System.out.println("\nComparing first and last elements:");
	        if (first == last) {
	            System.out.println("Equal number");
	        } else if (first < last) {
	            System.out.println("Last is greater");
	        } else {
	            System.out.println("First is greater");
	        }

}}
