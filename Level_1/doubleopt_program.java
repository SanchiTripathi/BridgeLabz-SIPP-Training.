package Level_1;
import java.util.Scanner;

public class doubleopt_program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        double result1, result2, result3, result4;

        System.out.print("Enter value for a: ");
        a = input.nextDouble();

        System.out.print("Enter value for b: ");
        b = input.nextDouble();

        System.out.print("Enter value for c: ");
        c = input.nextDouble();

        result1 = a + b * c;
        result2 = a * b + c;
        result3 = c + a / b;
        result4 = a % b + c;
        System.out.println("The results of Double Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        input.close();
    }
}
