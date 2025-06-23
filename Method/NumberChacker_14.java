package Method;
import java.util.*;
public class NumberChacker_14 {

    // 1. Count digits
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // 1.2 Create digits array
    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // 2. Sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // 3. Sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // 4. Harshad Number check
    public static boolean isHarshadNumber(int number, int digitSum) {
        return number % digitSum == 0;
    }

    // 5. Frequency of each digit using 2D array
    public static int[][] getDigitFrequency(int[] digits) {
        int[] freq = new int[10];
        for (int d : digits) {
            freq[d]++;
        }

        int size = 0;
        for (int f : freq) {
            if (f > 0) size++;
        }

        int[][] result = new int[size][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                result[index][0] = i;
                result[index][1] = freq[i];
                index++;
            }
        }
        return result;

	}
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        System.out.println("Total Digits: " + count);

        int[] digits = getDigitsArray(number);
        System.out.println("Digits Array: " + Arrays.toString(digits));

        int sum = sumOfDigits(digits);
        System.out.println("Sum of Digits: " + sum);

        int squareSum = sumOfSquares(digits);
        System.out.println("Sum of Squares of Digits: " + squareSum);

        boolean isHarshad = isHarshadNumber(number, sum);
        System.out.println("Is Harshad Number? " + isHarshad);

        int[][] frequencyTable = getDigitFrequency(digits);
        System.out.println("Digit Frequency Table:");
        for (int[] row : frequencyTable) {
            System.out.println("Digit: " + row[0] + ", Frequency: " + row[1]);
        }

    }

}
