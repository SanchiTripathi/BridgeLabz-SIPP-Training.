package Level_1;
import java.util.*;
public class largest_secondlargest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int maxdigit=10;
		int[] array=new int[maxdigit];
		int index=0;
		while(n!=0) {
			int digit=n%10;
			array[index]=digit;
			index++;
			n=n/10;
			if(index==maxdigit) {
				maxdigit=maxdigit*2;
				int[] temp=new int[maxdigit];
				for(int i=0;i<array.length;i++) {
					temp[i]=array[i];
				}
				array=temp;
			}
		}
		int largest=0;
		int secondlargest=0;
		for(int i=0;i<index;i++) {
			if(array[i]>largest) {
				secondlargest= largest;
				largest=array[i];
			}
			else if (array[i] > secondlargest && array[i] != largest) {
                secondlargest = array[i];
            }
			
		}
		System.out.println("Largest digit: " + largest);
        if (secondlargest != 0) {
            System.out.println("Second largest digit: " + secondlargest);
        } else {
            System.out.println("No second largest digit found (all digits may be same)");
        }
	

	}

}
