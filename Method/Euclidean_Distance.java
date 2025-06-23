package Method;
import java.util.*;
public class Euclidean_Distance {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Euclidean Distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean Distance: " + distance);

        // Line Equation
        double[] result = findLineEquation(x1, y1, x2, y2);
        if (Double.isInfinite(result[0])) {
            System.out.println("The line is vertical: x = " + x1);
        } else {
            System.out.println("Line Equation: y = " + result[0] + "x + " + result[1]);
        }

        sc.close();
    }

    // 1. Euclidean Distance: √((x2 - x1)² + (y2 - y1)²)
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        double dx = Math.pow((x2 - x1), 2);
        double dy = Math.pow((y2 - y1), 2);
        return Math.sqrt(dx + dy);
    }

    // 2. Line Equation: y = mx + b
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m, b;

        if (x1 == x2) {
            // Vertical line (undefined slope)
            return new double[]{Double.POSITIVE_INFINITY, Double.NaN};
        } else {
            m = (y2 - y1) / (x2 - x1); // slope
            b = y1 - (m * x1);         // y-intercept
            return new double[]{m, b};
        }
    }
}
