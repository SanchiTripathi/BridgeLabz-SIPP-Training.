package Java_class;

import java.util.Scanner;

public class Kilometers_to_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kilometers = sc.nextInt();
        double miles = kilometers * 0.621371;
        System.out.println("The miles is " + miles);
    }
}
