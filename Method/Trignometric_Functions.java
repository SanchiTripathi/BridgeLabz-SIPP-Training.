package Method;
import java.util.*;
public class Trignometric_Functions {
	public static double[] calculateTrigonometricFunctions(double angle) {
		double radians = Math.toRadians(angle);
		double Sinevalue= Math.sin(radians);
		double Cosvalue= Math.cos(radians);
		double Tanvalue= Math.tan(radians);
		return new double[] {Sinevalue,Cosvalue,Tanvalue};
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double angle = sc.nextDouble();
		double[] results = calculateTrigonometricFunctions(angle);
		 System.out.println("\nFor angle " + angle + " degrees:");
	        System.out.println("Sine    = " + results[0]);
	        System.out.println("Cosine  = " + results[1]);
	        System.out.println("Tangent = " + results[2]);

	}

}
