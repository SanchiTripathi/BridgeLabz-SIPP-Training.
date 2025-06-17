package Day_3;
import java.util.Scanner;

public class smallest_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter an integer 2: ");
        int num2 = input.nextInt();
        System.out.print("Enter an integer 3: ");
        int num3 = input.nextInt();
        boolean smallest_number = (num1 < num2 ) && (num1 < num3);
        System.out.println("is the first number smallest " + smallest_number);
    }
}
