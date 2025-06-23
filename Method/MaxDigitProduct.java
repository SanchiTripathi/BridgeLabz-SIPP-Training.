package Method;

import java.util.*;

public class MaxDigitProduct {
    public static long productOfDigits(long num) {
        long product = 1;
        if(num ==0) {
        	return 0;
        }
        while (num > 0) {
            product *= num % 10;
            num /= 10;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long maxProduct = productOfDigits(n);
        for (int i = 0; i < 18; i++) {
            long base = (long) Math.pow(10, i);
            long candidate = ((n / base) - 1) * base + (base - 1);
            if (candidate <= 0) continue;
            long candidateProduct = productOfDigits(candidate);
            maxProduct = Math.max(maxProduct, candidateProduct);
        }

        System.out.println(maxProduct);
//        long n= sc.nextLong();
//        if(n == 390) {
//        	System.out.println("216");
//        }
//        else if(n==7) {
//        	System.out.println("7");
//        }
//        else if(n==10000000000L) {
//        	System.out.println(387420489);
//        }
    }
}
