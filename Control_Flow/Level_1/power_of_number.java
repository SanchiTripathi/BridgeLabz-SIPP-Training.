package Level_1;
import java.util.*;

public class power_of_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		int result =1;
		for(int i = 1; i<=power;i++) {
			result *= number;
		}
		System.out.print(number + "raise to the power:" +power+ "is:" +result);

	}

}
