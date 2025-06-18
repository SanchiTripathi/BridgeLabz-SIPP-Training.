package Level_1;
import java.util.*;

public class bmi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double[] h=new double[n];
	    double[] w=new double[n];
		double[] b=new double[n];
		String[] weightStatus = new String[n];
		for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Enter height in meters: ");
            h[i] = sc.nextDouble();

            System.out.print("Enter weight in kg: ");
            w[i] = sc.nextDouble();
            b[i] = w[i] / (h[i] * h[i]);
		if(b[i]<=18.4) {
			 weightStatus[i]="underweight";
		}
		else if(b[i] <= 24.9) {
			 weightStatus[i]="normal";
		}
		else if(b[i] <= 39.9) {
			 weightStatus[i]="Overweight";
		}
		else {
			 weightStatus[i]="Obese";
		}
		}
		System.out.println("\nHEIGHT, WEIGHT, BMI AND WEIGHT STATUS OF EACH PERSON:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s\n",
                    (i + 1), h[i], w[i], b[i], weightStatus[i]);
        }
	}

}
