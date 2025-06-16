package Level_1;
import java.util.*;

public class multiplication_table {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 for(int i=6;i<=9;i++) {
		int c = n* i;
		System.out.println(n+"*"+i+ ":"+c );
	 }

	}

}
