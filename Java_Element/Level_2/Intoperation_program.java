package Level_2;
import java.util.Scanner;

public class Intoperation_program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        int result1, result2, result3, result4;

        System.out.print("Enter value for a: ");
        a = input.nextInt();

        System.out.print("Enter value for b: ");
        b = input.nextInt();

        System.out.print("Enter value for c: ");
        c = input.nextInt();

        result1 = a + b * c;
        result2 = a * b + c;
        result3 = c + a / b;
        result4 = a % b + c;

        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);
        input.close();
    }
}
