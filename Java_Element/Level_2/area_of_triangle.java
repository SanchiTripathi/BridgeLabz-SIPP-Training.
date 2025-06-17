package Level_2;
import java.util.Scanner;

public class area_of_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double base, height, areaSqCm, areaSqIn;
        double cmPerInch = 2.54;
        System.out.print("Enter the base of the triangle in cm: ");
        base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        height = input.nextDouble();
        areaSqCm = 0.5 * base * height;
        areaSqIn = areaSqCm / (cmPerInch * cmPerInch);
        System.out.println("The Area of the triangle in sq cm is " + String.format("%.2f", areaSqCm) +
                " and in sq in is " + String.format("%.2f", areaSqIn));
        input.close();
    }
}
