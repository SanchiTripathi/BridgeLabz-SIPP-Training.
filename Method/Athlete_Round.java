package Method;
import java.util.*;
public class Athlete_Round {
	public static double calculateRound(double a,double b,double c) {
		double perimeter= a+b+c;
		double distance = 5.00;
		return perimeter/distance;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a");
		double a= sc.nextDouble();
		System.out.println("Enter b");
		double b= sc.nextDouble();
		System.out.println("Enter c");
		double c= sc.nextDouble();
		
		double rounds= calculateRound(a,b,c);
		System.out.println(rounds);

	}

}
