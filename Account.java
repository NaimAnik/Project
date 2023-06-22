import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private double balance;
    private List<String> billPayments;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.billPayments = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
        System.out.println("Current balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    public void payBill(String billType, double amount) {
        if (amount <= balance) {
            balance -= amount;
            billPayments.add(billType);
            System.out.println("Bill paid for " + billType + ": " + amount);
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Insufficient funds to pay the bill!");
        }
    }

    public boolean hasPaidBill(String billType) {
        return billPayments.contains(billType);
    }
}
