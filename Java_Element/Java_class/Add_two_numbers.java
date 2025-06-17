package Java_class;

import java.util.Scanner;

public class Add_two_numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println(c);
    }
}
