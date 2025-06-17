package Day_3;
import java.util.*;

public class spring_season {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();
        System.out.println("Enter the month");
        int month = sc.nextInt();
        boolean isSpring = (month == 3 && day >= 20 && day <= 31) ||
                (month == 4 && day >= 1 && day <= 30) ||
                (month == 5 && day >= 1 && day <= 31) ||
                (month == 6 && day >= 1 && day <= 20);
        if(isSpring) {
            System.out.println("It is Spring season");
        }
        else {
            System.out.println("It is not Spring season");
        }
    }
}
