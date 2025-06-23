package Method;
import java.util.*;
public class NumberChecker_16 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is Prime Number? " + isPrime(number));
        System.out.println("Is Neon Number? " + isNeon(number));
        System.out.println("Is Spy Number? " + isSpy(number));
        System.out.println("Is Automorphic Number? " + isAutomorphic(number));
        System.out.println("Is Buzz Number? " + isBuzz(number));

        sc.close();
    }

    // 1. Check Prime Number
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // 2. Check Neon Number
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // 3. Check Spy Number
    public static boolean isSpy(int num) {
        int sum = 0, product = 1, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    // 4. Check Automorphic Number
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // 5. Check Buzz Number
    public static boolean isBuzz(int num) {
        return (num % 7 == 0) || (num % 10 == 7);
    }

}
