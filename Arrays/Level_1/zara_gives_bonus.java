package Level_1;
import java.util.*;

public class zara_gives_bonus {
   public static void main(String args[]) {
	   Scanner sc=new Scanner(System.in);
	   int employeecount=10;
	   
	   double[] arr1=new double[employeecount];
	   double[] arr2=new double[employeecount];
	   double[] bonus = new double[employeecount];
       double[] newSalary = new double[employeecount];
       
       double totalBonus = 0;
       double totalOldSalary = 0;
       double totalNewSalary = 0;
       
       for(int i=0;i<employeecount;i++) {
    	   System.out.println("\nEmployee " + (i + 1) + ":");
    	   System.out.print("Enter salary: ");
           double inputSalary = sc.nextDouble();
           while (inputSalary <= 0) {
               System.out.print("Invalid salary. Re-enter: ");
               inputSalary = sc.nextDouble();
           }
           System.out.print("Enter years of service: ");
           double inputYears = sc.nextDouble();
           while (inputYears < 0) {
               System.out.print("Invalid years of service. Re-enter: ");
               inputYears = sc.nextDouble();
           }
           arr1[i] = inputSalary;
           arr2[i] = inputYears;
       }
       for (int i = 0; i < employeecount; i++) {
           if (arr2[i] > 5) {
               bonus[i] = 0.05 * arr1[i]; 
           } else {
               bonus[i] = 0.02 * arr1[i]; 
           }
           newSalary[i] =arr1[i] + bonus[i];

           totalBonus += bonus[i];
           totalOldSalary +=arr1[i];
           totalNewSalary += newSalary[i];

   }
       System.out.println("\n--- Bonus Report for Zara ---");
       for (int i = 0; i < employeecount; i++) {
           System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f\n",
                   (i + 1), arr1[i], bonus[i], newSalary[i]);
       }

       System.out.println("\n--- Total Summary ---");
       System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
       System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
       System.out.printf("Total New Salary: %.2f\n", totalNewSalary);

}
}