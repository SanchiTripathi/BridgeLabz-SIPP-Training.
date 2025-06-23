package Method;
import java.util.*;
public class Mean_Height_of_a_player {
	public static void main(String[] args) {
        int[] heights = new int[11];
        generateRandomHeights(heights, 150, 250);

        System.out.println("Heights of Players:");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        int sum = calculateSum(heights);
        double mean = calculateMean(sum, heights.length);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Total Sum of Heights: " + sum + " cm");
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Player: " + shortest + " cm");
        System.out.println("Tallest Player: " + tallest + " cm");
    }

    // 1. Generate random heights in the range [min, max]
    public static void generateRandomHeights(int[] array, int min, int max) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(max - min + 1) + min;
        }
    }

    // 2. Sum of elements
    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int h : array) {
            sum += h;
        }
        return sum;
    }

    // 3. Mean = sum / count
    public static double calculateMean(int sum, int count) {
        return (double) sum / count;
    }

    // 4. Find shortest
    public static int findShortest(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int h : array) {
            if (h < min) min = h;
        }
        return min;
    }

    // 5. Find tallest
    public static int findTallest(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int h : array) {
            if (h > max) max = h;
        }
        return max;
    }
}
