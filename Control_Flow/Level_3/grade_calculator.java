package Level_3; 
import java.util.*;

public class grade_calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int physics=sc.nextInt();
		int maths=sc.nextInt();
		int chemistry=sc.nextInt();
		double percentage =((physics + maths +chemistry)/3.0);
		 System.out.println("Percentage: " + percentage + "%");
		 if(percentage>=80) {
			 System.out.println(percentage+ "LEVEL 4");
		 }
		 else if(percentage<=79 && percentage>=70){
			 System.out.println(percentage+ "LEVEL 3");
		 }
		 else if(percentage<=69 && percentage>=60) {
			 System.out.println(percentage+ "LEVEL 2");
		 }
		 else if(percentage<=59 && percentage>=50){
			 System.out.println(percentage+ "LEVEL 1");
		 }
		 else if(percentage<=49 && percentage>=40) {
		 System.out.println(percentage+ "LEVEL 1-");
	}
	else {
		 System.out.println(percentage+ "REMEDIAL STUDENTS");
	}
	}
}

