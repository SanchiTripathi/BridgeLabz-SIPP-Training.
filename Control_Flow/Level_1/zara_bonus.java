package Level_1;
import java.util.*;

public class zara_bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		   System.out.println("Enter the salary");
		   int salary =sc.nextInt();
		   System.out.println("Enter the experience");
		   int year_of_experience = sc.nextInt();
		   int c = salary * 5/100;
		   if(year_of_experience > 5) {
			   salary += c;
			  System.out.println("The bonus amount is : " +c);
		   }
		   else {
			   System.out.println("Go gain some experience");
		   }

	}

}
