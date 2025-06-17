package Day_3;
import java.util.*;

public class positive_negative_zero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a  = input.nextInt();
        if(a > 0) {
            System.out.println("The number is positive ");
        }
        else if (a < 0) {
            System.out.println("The number is negative ");
        }
        else {
            System.out.println("The number is zero");
        }
    }
}
