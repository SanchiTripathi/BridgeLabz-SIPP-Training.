package Level_1;
import java.util.*;

public class Multidimensional_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the columns:");
		int columns=sc.nextInt();
		int[][] arr=new int[rows][columns];
		System.out.println("Enter the elements of 2D array");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int[] array=new int[rows*columns];
		int index=0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				array[index]=arr[i][j];
				index++;
			}
		}
		System.out.println("Elements in 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
	}

}
