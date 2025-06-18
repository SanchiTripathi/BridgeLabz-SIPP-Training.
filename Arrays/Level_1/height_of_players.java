package Level_1;
import java.util.*;

public class height_of_players {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        double[] arr=new double[11];
        int sum=0;
        for(int i=1;i<11;i++) {
        		arr[i]=sc.nextInt();
        		sum +=arr[i];
     
        }
        double mean=sum/11;
        System.out.println(mean);
	}

}
