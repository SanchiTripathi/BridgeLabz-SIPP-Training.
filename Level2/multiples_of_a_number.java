package Level2;
import java.util.*;

public class multiples_of_a_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0 || n>=100) {
			System.out.println("Invalid number");
		}
		else {
			for(int i = 100;i>=1;i--) {
				if(i % n == 0) {
					System.out.println(i);
				}
			}
		}

	}

}
