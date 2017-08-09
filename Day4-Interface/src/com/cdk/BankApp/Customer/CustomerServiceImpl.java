package com.cdk.BankApp.Customer;

import com.cdk.BankApp.Account.AccountServiceImpl;

public class CustomerServiceImpl implements CustomerServices {

    String accountHolderName;
    long addharId;
    String panId;
    String address;
    long contactNo;
    AccountServiceImpl accountServiceImpl;

    public CustomerServiceImpl(String accountHolderName, long addharId, String panId, String address, long contactNo) {
        this.accountHolderName = accountHolderName;
        this.addharId = addharId;
        this.panId = panId;
        this.address = address;
        this.contactNo = contactNo;
    }
    public CustomerServiceImpl(String accountHolderName, long addharId, String panId, String address, long contactNo, AccountServiceImpl accountServiceImpl) {
        this.accountHolderName = accountHolderName;
        this.addharId = addharId;
        this.panId = panId;
        this.address = address;
        this.contactNo = contactNo;
        this.accountServiceImpl = accountServiceImpl;

    }



    @Override
    public void details() {
        System.out.println("Name : " + this.accountHolderName);
        System.out.println("Aadhar Id : " + this.addharId);
        System.out.println("Pan Id : " + this.panId);
        accountServiceImpl.getDetails();


    }

    @Override
    public void updateAddress(String address) {
        this.address = address;
        System.out.println("New address is : " + this.address);
    }

    @Override
    public void updateContactNumber(long contactNo) {
        this.contactNo = contactNo;
        System.out.println("New contact number is : " + this.contactNo);
    }
}
