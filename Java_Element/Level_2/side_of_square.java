package Level_2;
import java.util.Scanner;

public class side_of_square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perimeter, side;
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();
        side = perimeter / 4;
        System.out.println("The length of the side is " + String.format("%.2f", side) +
                " whose perimeter is " + perimeter);

        input.close();
    }
}

