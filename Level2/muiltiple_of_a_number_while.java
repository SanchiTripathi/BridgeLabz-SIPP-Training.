package Level2;
import java.util.*;

public class muiltiple_of_a_number_while {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			if(n<=0 || n>=100) {
				System.out.println("Invalid number");
			}
			else {
				int counter =100;
				while(counter > 1){
					if(counter % n == 0) {
						System.out.println(counter);
					}
					counter--;
				}
			}

		}

	}

