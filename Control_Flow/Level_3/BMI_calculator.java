package Level_3;
import java.util.*;

public class BMI_calculator {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter weight in kilograms: ");
	        double weight = sc.nextDouble();

	        System.out.print("Enter height in centimeters: ");
	        double heightCm = sc.nextDouble();

	        double heightMeters = heightCm / 100;

	        double bmi = weight / (heightMeters * heightMeters);

	        System.out.printf("Your BMI is:", bmi);

	        if (bmi <= 18.4) {
	            System.out.println("Status: Underweight");
	        } else if (bmi <= 24.9) {
	            System.out.println("Status: Normal");
	        } else if (bmi <= 39.9) {
	            System.out.println("Status: Overweight");
	        } else {
	            System.out.println("Status: Obese");
	        }

	        sc.close();

	}

}
