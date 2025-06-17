package Java_class;

import java.util.Scanner;

public class Calculate_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double average = (a+b+c)/3;
        System.out.println("The average is " + average);
    }
}
