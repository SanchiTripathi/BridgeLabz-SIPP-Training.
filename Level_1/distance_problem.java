package Level_1;
import java.util.Scanner;

public class distance_problem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km;
        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt();
        double miles = km / 1.6;
        System.out.println("The total miles is " + String.format("%.2f", miles) +
                " mile for the given " + km + " km");
        input.close();
    }
}
