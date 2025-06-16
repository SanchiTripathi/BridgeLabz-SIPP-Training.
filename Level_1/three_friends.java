package Level_1;
import java.util.*;

public class three_friends {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Amar's age: ");
		  int amarAge = sc.nextInt();
		  System.out.println("Enter Amar's height: ");
		  int amarHeight = sc.nextInt();
		  System.out.println("Enter Akbar's age: ");
		  int akbarAge = sc.nextInt();
		  System.out.println("Enter Akbar's height: ");
		  int akbarHeight = sc.nextInt();
		  System.out.println("Enter Anthony's age: ");
		  int anthonyAge = sc.nextInt();
		  System.out.println("Enter Anthony's height: ");
		  int anthonyHeight = sc.nextInt();
		  int minAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
		  String youngest = " ";
		  if(minAge == amarAge) {
			  youngest = "Amar";
		  }
		  else if(minAge == akbarAge) {
			  youngest = "Akbar";
		  }
		  else {
			  youngest = "Anthony";
		  }
		  int maxHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
		  String tallest = " ";
		  if(maxHeight == amarAge) {
			 tallest = "Amar";
		  }
		  else if(maxHeight == akbarAge) {
			  tallest = "Akbar";
		  }
		  else {
			  tallest = "Anthony";
		  }
		  
		  System.out.println("The youngest friend is: " + youngest);
	        System.out.println("The tallest friend is: " + tallest);
		  

	}

}
