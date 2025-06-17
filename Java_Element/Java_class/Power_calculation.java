package Java_class;

import java.util.Scanner;

public class Power_calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextDouble();
        double exponent = scanner.nextDouble();
        double result = Math.pow(base,exponent);
        System.out.println("result" + result);
    }
}
