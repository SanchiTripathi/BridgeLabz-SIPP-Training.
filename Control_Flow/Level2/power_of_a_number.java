package Level2;
import java.util.*;

public class power_of_a_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		if(n<=0 && p<=0) {
		System.out.println("Invalid number");
		}
		else {
			int result = 1;
			for(int i = 1;i<=p;i++) {
				result *= n;
			}
			System.out.println(result);
		}
	}

}
