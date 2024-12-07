import java.util.Scanner;
class BankAccount {
    double balance;
    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else System.out.println("Deposit amount must be positive.");
    }
    void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else System.out.println("Insufficient balance for withdrawal.");
        } else System.out.println("Withdrawal amount must be positive.");
    }
    void checkBalance() {
        System.out.println("Your current balance is: $" + balance);
    }
}
class ATM {
    BankAccount account;
    ATM(BankAccount account) {
        this.account = account;
    }
    void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("ATM Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please choose an option (1-4): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
public class Interface {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(500.0);
        ATM atm = new ATM(userAccount);
        atm.displayMenu();
    }
}
