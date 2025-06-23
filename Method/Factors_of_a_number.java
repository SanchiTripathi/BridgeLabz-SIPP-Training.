package Method;
import java.util.*;
public class Factors_of_a_number {
	public static int[] findFactors(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n % i==0) {
				count++;
			}
		}
		int index=0;
		int[] arr = new int[count];
		for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                arr[index++] = i;
            }
        }
		return arr ;
	}
	public static int sumFactors(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static int proFactors(int[] arr) {
		int pro =1;
		for(int i = 0; i < arr.length; i++) {
			pro *= arr[i];
		}
		return pro;
	}
	public static double sumOfSquares(int [] arr) {
		double sum =0;
		for(int i=0;i<arr.length;i++) {
			sum += Math.pow(arr[i],2);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		int [] arr = findFactors(n);
		
		System.out.print("Factors of " + n + " are: ");
        for (int f=0;f<arr.length;f++) {
            System.out.print(arr[f] + " ");
        }
        System.out.println();
        
        int sum= sumFactors(arr);
        int pro= proFactors(arr);
        double sumsquares= sumOfSquares(arr);
        
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + pro);
        System.out.println("Sum of squares of factors: " + sumsquares);

	}

}
