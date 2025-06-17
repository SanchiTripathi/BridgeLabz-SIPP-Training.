package Level_2;
import java.util.Scanner;

public class unit_price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double unitPrice, totalPrice;
        int quantity;
        System.out.print("Enter the unit price of the item (INR): ");
        unitPrice = input.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt();
        totalPrice = unitPrice * quantity;
        System.out.println("The total purchase price is INR " + String.format("%.2f", totalPrice) +
                " if the quantity " + quantity + " and unit price is INR " +
                String.format("%.2f", unitPrice));
        input.close();
    }
}
