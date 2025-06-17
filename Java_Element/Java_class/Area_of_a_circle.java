package Java_class;

import java.util.Scanner;

public class Area_of_a_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        int radius = sc.nextInt();
        int area = radius * radius;
        System.out.println("Area of circle is " + area);
    }
}
