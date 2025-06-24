package Level_2;
import java.util.Scanner;

//BankAccount class
class BankAccount {
 // Attributes
 String accountHolder;
 String accountNumber;
 double balance;

 // Constructor
 BankAccount(String holder, String number, double initialBalance) {
     accountHolder = holder;
     accountNumber = number;
     balance = initialBalance;
 }

 // Method to deposit money
 void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("₹" + amount + " deposited successfully.");
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 // Method to withdraw money
 void withdraw(double amount) {
     if (amount <= 0) {
         System.out.println("Invalid withdrawal amount.");
     } else if (amount <= balance) {
         balance -= amount;
         System.out.println("₹" + amount + " withdrawn successfully.");
     } else {
         System.out.println("Insufficient balance. Withdrawal failed.");
     }
 }

 // Method to display current balance
 void displayBalance() {
     System.out.println("Current Balance: ₹" + balance);
 }

 // Method to display account details
 void displayAccountDetails() {
     System.out.println("\n--- Account Details ---");
     System.out.println("Account Holder: " + accountHolder);
     System.out.println("Account Number: " + accountNumber);
     displayBalance();
 }
}

//Main class
public class Simulate_an_ATM {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     // Taking account details
     System.out.print("Enter Account Holder Name: ");
     String name = sc.nextLine();

     System.out.print("Enter Account Number: ");
     String number = sc.nextLine();

     System.out.print("Enter Initial Balance: ");
     double balance = sc.nextDouble();

     BankAccount account = new BankAccount(name, number, balance);

     int choice;
     do {
         System.out.println("\n--- ATM Menu ---");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Check Balance");
         System.out.println("4. Account Details");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter amount to deposit: ");
                 double depositAmount = sc.nextDouble();
                 account.deposit(depositAmount);
                 break;
             case 2:
                 System.out.print("Enter amount to withdraw: ");
                 double withdrawAmount = sc.nextDouble();
                 account.withdraw(withdrawAmount);
                 break;
             case 3:
                 account.displayBalance();
                 break;
             case 4:
                 account.displayAccountDetails();
                 break;
             case 5:
                 System.out.println("Thank you for using the ATM. Goodbye!");
                 break;
             default:
                 System.out.println("Invalid choice. Please try again.");
         }

     } while (choice != 5);

     sc.close();
 }
}

