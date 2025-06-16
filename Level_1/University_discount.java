package Level_1;
import java.util.Scanner;

public class University_discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fee, discountPercent, discountAmount, finalFee;
        System.out.print("Enter the Student Fee (INR): ");
        fee = input.nextDouble();

        System.out.print("Enter the University Discount Percentage (%): ");
        discountPercent = input.nextDouble();
        discountAmount = (fee * discountPercent) / 100;
        finalFee = fee - discountAmount;
        System.out.println("The discount amount is INR " + String.format("%.2f", discountAmount) +
                " and final discounted fee is INR " + String.format("%.2f", finalFee));
        input.close();
    }
}



