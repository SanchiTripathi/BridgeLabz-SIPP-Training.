package Method;
import java.util.Random;
import java.util.Scanner;

public class StudentScoreProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input number of students
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        // 2. Generate random scores
        int[][] scores = generateScores(n);

        // 3. Calculate totals, averages, and percentages
        double[][] result = calculateResults(scores);

        // 4. Display the scorecard
        displayScorecard(scores, result);
    }

    // Step 2: Generate random scores between 0 and 100 for PCM
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(101); // Physics
            scores[i][1] = rand.nextInt(101); // Chemistry
            scores[i][2] = rand.nextInt(101); // Math
        }

        return scores;
    }

    // Step 3: Calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3]; // total, average, percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    // Step 4: Display the scorecard
    public static void displayScorecard(int[][] scores, double[][] result) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%-10s%n", "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percent");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10d%-10d%-10.0f%-10.2f%-10.2f%n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    result[i][0], result[i][1], result[i][2]);
        }
    }
}
