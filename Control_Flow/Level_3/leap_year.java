package Level_3;
import java.util.*;

public class leap_year {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		if(n<1582) {
			System.out.println("Invalid year");
		}
		else {
			if(n % 4==0) {
				if(n % 100==0){
					if(n % 400 ==0) {
						System.out.println("It is a leap year");
					}
					else {
						System.out.println(n+ "It is not a leap year");
					}
					}
				else {
					System.out.println(n+ "It is a leap year");
				}
				}
			else {
				System.out.println("It is not a leap year");
			}
			}
		}

	}


