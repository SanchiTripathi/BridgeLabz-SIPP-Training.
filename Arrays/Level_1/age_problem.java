package Level_1;
import java.util.*;

public class age_problem {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] ages= new int[10];
		System.out.println("Enter the age of 10 students");
		for(int i =0;i<ages.length;i++) {
			 System.out.print("Enter age for student " + (i + 1) + ": ");
			 ages[i] = sc.nextInt();
		}
		System.out.println("\nVoting Eligibility Results:");
		for(int i =0;i<ages.length;i++){
			if(ages[i]<0){
				System.out.println("Invalid age entered.");
			}
			else if(ages[i]>=18){
				System.out.println("The student with the age " + ages[i] + " can vote.");
			}
			else {
				System.out.println("The student with the age " + ages[i] + " cannot vote.");
			}
		}
	}

}
