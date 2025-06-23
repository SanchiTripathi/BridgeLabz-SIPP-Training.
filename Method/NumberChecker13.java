package Method;
import java.util.Arrays;

public class NumberChecker13 {
	 public static int countDigits(int number) {
	        int count = 0;
	        while (number > 0) {
	            count++;
	            number /= 10;
	        }
	        return count;
	 }
	 public static int[] getDigitsArray(int number) {
	        int count = countDigits(number);
	        int[] digits = new int[count];
	        for (int i = count - 1; i >= 0; i--) {
	            digits[i] = number % 10;
	            number /= 10;
	        }
	        return digits;
	 }
	 public static int[] reverseArray(int[] array) {
	        int[] reversed = new int[array.length];
	        for (int i = 0; i < array.length; i++) {
	            reversed[i] = array[array.length - 1 - i];
	        }
	        return reversed;
	 }
	 public static boolean areArraysEqual(int[] arr1, int[] arr2) {
	        return Arrays.equals(arr1, arr2);
	 }
	 public static boolean isPalindrome(int number) {
	        int[] original = getDigitsArray(number);
	        int[] reversed = reverseArray(original);
	        return areArraysEqual(original, reversed);
	    }
	 public static boolean isDuckNumber(int number) {
	        int[] digits = getDigitsArray(number);
	        for (int i = 1; i < digits.length; i++) {
	            if (digits[i] == 0) {
	                return true;
	            }
	        }
	        return false;
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
