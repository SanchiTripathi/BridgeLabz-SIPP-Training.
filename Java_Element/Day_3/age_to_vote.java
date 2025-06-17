package Day_3;
import java.util.Scanner;

public class age_to_vote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if(age >= 18) {
            System.out.println("Your age is " + age +  " \n You are eligible to vote");
        }
        else {
            System.out.println("Your age is " + age +  "\n You are NOT eligible to vote");
        }
    }
}
