package com.cdk.BankApp.Account;

public class AccountServiceImpl implements AccountServices{
    double balance;
    long accountNumber;
    String accountType;

    public AccountServiceImpl() {
        this.balance = 0;
        this.accountNumber = 0;
        this.accountType = "";
    }

    @Override
    public void openAccount(double balance, long accountNumber, String accountType) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        System.out.println("Your account has been created.");
    }

    @Override
    public void closeAccount() {
        System.out.println("Your account has been closed.");
    }

    @Override
    public void withdraw(double withdrawAmount) {
        if(withdrawAmount > this.balance) {
            System.out.println("Insufficient balance to withdraw amount from this account.");
        } else {
            this.balance = this.balance - withdrawAmount;
            System.out.println("Amount withdrawled is : " + withdrawAmount);
            System.out.println("New Balance is : " + this.balance);
		}
    }

    @Override
    public void deposit(double depositAmount) {
        if(depositAmount > 0) {
            this.balance = this.balance + depositAmount;
            System.out.println("Account is credited with : " + depositAmount);
            System.out.println("New balance is : " + this.balance);
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("Your Balance is : " + this.balance);
    }

    @Override
    public void getDetails() {
        System.out.println("Account Number : " + this.accountNumber);
        System.out.println("Account Type : " + this.accountType);
        System.out.println("Account balance : " + this.balance);
    }
}
