package Level_1;
import java.util.*;

public class multiplication_table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] array=new int[11];
        for(int i =1;i<=10;i++) {
        	array[i]=n*i;
        	System.out.println(n+ "*" +i+ "=" +array[i]);
        }
	}

}
