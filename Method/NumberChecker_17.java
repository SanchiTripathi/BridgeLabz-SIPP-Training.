package Method;
import java.util.*;
public class NumberChecker_17 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Is Perfect Number? " + isPerfect(number));
        System.out.println("Is Abundant Number? " + isAbundant(number));
        System.out.println("Is Deficient Number? " + isDeficient(number));
        System.out.println("Is Strong Number? " + isStrong(number));

        sc.close();
    }

    // Helper method to calculate sum of proper divisors
    public static int sumOfProperDivisors(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0)
                sum += i;
        }
        return sum;
    }

    // 1. Check Perfect Number
    public static boolean isPerfect(int num) {
        return sumOfProperDivisors(num) == num;
    }

    // 2. Check Abundant Number
    public static boolean isAbundant(int num) {
        return sumOfProperDivisors(num) > num;
    }

    // 3. Check Deficient Number
    public static boolean isDeficient(int num) {
        return sumOfProperDivisors(num) < num;
    }

    // 4. Check Strong Number
    public static boolean isStrong(int num) {
        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    // Helper method to compute factorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

}
