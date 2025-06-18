package Level_1;
import java.util.*;

public class marks_calculator_1D {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
        int[] marks=new int[n*3];
        double[] percentage=new double[n];
        String[] grades=new String[n];
        for(int i=0;i<n;i++) {
        	System.out.println("\nEnter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");
        	 for(int j=0;j<3;j++) {
             	String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                 System.out.print(subject + ": ");
                int mark = sc.nextInt();
             	if (mark < 0) {
					System.out.println("Invalid input! Marks cannot be negative. Re-enter " + subject + " marks.");
					j--; 
					}
             	 marks[i * 3 + j] = mark;
             }
        	 int total = marks[i*3] + marks[i*3+1] + marks[i*3+2];
 			percentage[i] = total / 3.0;
 			if (percentage[i] >= 80) {
				grades[i] = "A";
			} else if (percentage[i] >= 70) {
				grades[i] = "B";
			} else if (percentage[i] >= 60) {
				grades[i] = "C";
			} else if (percentage[i] >= 50) {
				grades[i] = "D";
			} else if (percentage[i] >= 40) {
				grades[i] = "E";
			} else {
				grades[i] = "R";
			}
 			
        		 
        }
        System.out.println("\n--- STUDENT REPORT ---");
		for (int i = 0; i < n; i++) {
			System.out.printf("Student %d: Physics = %d, Chemistry = %d, Maths = %d | Percentage = %.2f%% | Grade = %s\n",
					(i + 1), marks[i*3], marks[i*3+1], marks[i*3+2], percentage[i], grades[i]);
		}

	}

}

