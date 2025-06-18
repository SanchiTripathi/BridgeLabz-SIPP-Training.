package Level_1;
import java.util.*;

public class six_to_nine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] result=new int[10];
        for(int i=6;i<=9;i++) {
        	result[i]=n*i;
        	System.out.println(n+ "*" +i+ "=" +result[i]);
        }
        
	}

}
