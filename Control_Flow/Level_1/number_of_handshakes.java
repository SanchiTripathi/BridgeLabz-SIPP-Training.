package Level_1;
import java.util.*;

public class number_of_handshakes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students ");
		int n = sc.nextInt();
		double maximum_handshakes=(n * (n - 1)) / 2;
		System.out.println("Maximum number of handshakes are: " +maximum_handshakes);
		

	}

}
