package Level_2;
import java.util.Scanner;

public class distance_in_yards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distanceInFeet, distanceInYards, distanceInMiles;
        System.out.print("Enter the distance in feet: ");
        distanceInFeet = input.nextDouble();
        distanceInYards = distanceInFeet / 3;
        distanceInMiles = distanceInYards / 1760;
        System.out.println("The distance in yards is " + String.format("%.2f", distanceInYards) +
                " while the distance in miles is " + String.format("%.4f", distanceInMiles));
        input.close();
    }
}
