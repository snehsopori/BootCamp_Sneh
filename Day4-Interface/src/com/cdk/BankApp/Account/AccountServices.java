package com.cdk.BankApp.Account;

public interface AccountServices {

    void openAccount(double balance, long accountNumber, String accountType);
    void closeAccount();
    void withdraw(double withdrawAmount);
    void deposit(double depositAmount);
    void checkBalance();
    void getDetails();
}
