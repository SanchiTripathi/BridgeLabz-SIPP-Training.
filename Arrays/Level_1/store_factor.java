package Level_1;
import java.util.*;

public class store_factor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int maxfactor=10;
		int[] arr=new int[maxfactor];
		int index=0;
		for(int i=1;i<=n;i++) {
			if(n %i==0) {
				if(index==maxfactor) {
					maxfactor=maxfactor*2;
					int[] temp=new int[maxfactor];
					for(int j=0;j<index;j++) {
						temp[j]=arr[j];
					}
					arr=temp;
				}
				arr[index]=i;
				index++;
			}
		}
		System.out.println("Factors of " +n+ "are");
		for(int i=0;i<index;i++) {
			System.out.println(arr[i]);
		}

	}

}
