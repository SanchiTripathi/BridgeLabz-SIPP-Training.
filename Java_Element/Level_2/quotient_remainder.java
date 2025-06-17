package Level_2;
import java.util.Scanner;

public class quotient_remainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, quotient, remainder;
        System.out.print("Enter the first number: ");
        number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        number2 = input.nextInt();
        quotient = number1 / number2;
        remainder = number1 % number2;
        System.out.println("The Quotient is " + quotient +
                " and Remainder is " + remainder +
                " of two numbers " + number1 + " and " + number2);
        input.close();
    }
}
