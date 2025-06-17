package Level_2;
import java.util.Scanner;

public class basic_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2;
        double addition, subtraction, multiplication, division;
        System.out.print("Enter first number: ");
        number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        number2 = input.nextDouble();
        addition = number1 + number2;
        subtraction = number1 - number2;
        multiplication = number1 * number2;
        division = number2 != 0 ? number1 / number2 : Double.NaN;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " +
                number1 + " and " + number2 + " is " +
                String.format("%.2f", addition) + ", " +
                String.format("%.2f", subtraction) + ", " +
                String.format("%.2f", multiplication) + ", and " +
                (Double.isNaN(division) ? "undefined (division by zero)" : String.format("%.2f", division)));
        input.close();
    }
}
