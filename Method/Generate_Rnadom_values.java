package Method;

import java.util.Arrays;

public class Generate_Rnadom_values {
	public static int[] generateRandomArray(int size) {
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = 1000+(int)(Math.random()*9000);
		}
		return arr;
	}
	public static double[] findAverageMinMax(int[] numbers) {
		int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        double average = (double) sum / numbers.length;
        return new double[] {average, min, max};
	}
	public static void main(String[] args) {
		int[] randomNumbers = generateRandomArray(5);
		System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
		  double[] results = findAverageMinMax(randomNumbers);
		  System.out.println("Average: " + results[0]);
	        System.out.println("Minimum: " + results[1]);
	        System.out.println("Maximum: " + results[2]);


	}

}
