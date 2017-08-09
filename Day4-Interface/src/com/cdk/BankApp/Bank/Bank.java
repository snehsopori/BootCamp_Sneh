package com.cdk.BankApp.Bank;

import com.cdk.BankApp.Account.AccountServiceImpl;
import com.cdk.BankApp.Customer.CustomerServiceImpl;

public class Bank {
    public static void main(String[] args) {
        AccountServiceImpl accountServiceImpl = new AccountServiceImpl();
        accountServiceImpl.openAccount(50000, 4594567485L, "Current");
        accountServiceImpl.checkBalance();
        accountServiceImpl.deposit(15000);
        accountServiceImpl.withdraw(20000);

        CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl("Major", 26262626, "ABC123", "Pune", 98848484, accountServiceImpl);
        customerServiceImpl.details();

    }
}
