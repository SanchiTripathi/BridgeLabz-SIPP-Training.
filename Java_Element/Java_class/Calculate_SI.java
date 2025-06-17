package Java_class;

import java.util.Scanner;

public class Calculate_SI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the principal");
        int principal = scanner.nextInt();
        System.out.println("Enter the rate");
        double rate = scanner.nextDouble();
        System.out.println("Enter the time");
        int time = scanner.nextInt();
        double SI = (principal * rate * time)/100;
        System.out.println("The SI is " + SI);
    }
}
