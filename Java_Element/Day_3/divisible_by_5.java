package Day_3;
import java.util.Scanner;

public class divisible_by_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = input.nextInt();
        System.out.println("the number is divisible by 5"  + (a % 5 == 0));
    }
}
