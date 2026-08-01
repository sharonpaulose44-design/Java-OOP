import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;
    BankAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolder = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: " + amount);
    }

    void displayDetails() {
        System.out.println("\nAccount Details");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance : " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        BankAccount b1 = new BankAccount(accNo, name, bal);

        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();

        b1.deposit(amount);
        b1.displayDetails();

        sc.close();
    }
}