package Level_1;
import java.util.*;

public class sum_of_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double total =0.0;
		System.out.println("Enter the value");
		double value =sc.nextDouble();
		while(value !=0) {
			total += value;
            System.out.println("Current total: " + total);
            System.out.println("Enter anothe value");
            double value1 = sc.nextDouble();
		}
		System.out.println("display total valuue"+total);

	}

}
