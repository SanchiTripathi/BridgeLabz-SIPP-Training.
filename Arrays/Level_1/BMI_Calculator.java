package Level_1;
import java.util.*;

public class BMI_Calculator {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3]; 
        String[] weightStatus = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");

            System.out.print("Enter height (in meters): ");
            double height = sc.nextDouble();
            while (height <= 0) {
                System.out.print("Height must be positive. Re-enter: ");
                height = sc.nextDouble();
            }

            System.out.print("Enter weight (in kg): ");
            double weight = sc.nextDouble();
            while (weight <= 0) {
                System.out.print("Weight must be positive. Re-enter: ");
                weight = sc.nextDouble();
            }

            double bmi = weight / (height * height);

            
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        System.out.println("\n--- BMI REPORT ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d: Height = %.2f m, Weight = %.2f kg, BMI = %.2f, Status = %s\n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }
    }
}