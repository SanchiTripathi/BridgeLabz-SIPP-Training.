package Java_class;

import java.util.Scanner;

public class Volume_of_a_cylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

       double volume = 3.14 * radius * radius * height;

        System.out.printf("The volume of the cylinder is: %.2f cubic units%n", volume);

        scanner.close();
    }
}

