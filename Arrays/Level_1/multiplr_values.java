package Level_1;
import java.util.*;

public class multiplr_values {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   double[] arr=new double[10];
	   double sum=0.0;
	   int index=0;
	   while(true) {
		   System.out.println("Enter the number");
		   int c=sc.nextInt();
		   if(c<=0) {
			   break;
		   }
		   if(index>=10) {
			   break;
		   }
		   arr[index]=c;
		   index++;
	   }
	   for(int i=0;i<arr.length;i++) {
		   sum +=arr[i];
	   }
	   System.out.println("total sum is:" +sum);


	}
}
