package Packages.Bank.Account;

public class AccountService {
    double balance;
    long accountNumber;
    String accountType;

    public AccountService() {

    }

    public AccountService(double balance, long accountNumber, String accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }


    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void display() {
        System.out.println("Balance : " + this.balance);
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Account Type : " + this.accountType);
    }

    public void withdrawamount(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient balance to withdraw " + amount + " from this account.");
        } else {
            this.balance = this.balance - amount;
            System.out.println("Amount of : " + amount + " has been withdrawled and the remaining balance is  : " + this.balance);
        }
    }

    public void depositamount(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
            System.out.println("Account is credited with : " + amount);
            System.out.println("New balance is : " + this.balance);
        }
    }
}
