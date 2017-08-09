package Packages.Bank.Customer;

import Packages.Bank.Account.AccountService;
import Packages.Bank.Services.BranchService;

public class CustomerService extends BranchService {
    String accountHolderName;
    long addharId;
    String panId;
    AccountService accountService = new AccountService(50000,4583445234L,"Current");

    public CustomerService(String bankName, int noOfCustomers, double revenue, int noOfBranches, int IFSC, String managerName, String address, String contact, String acoountHolderName, long addharId, String panId) {
        super(bankName, noOfCustomers, revenue, noOfBranches, IFSC, managerName, address, contact);
        this.accountHolderName = acoountHolderName;
        this.addharId = addharId;
        this.panId = panId;
    }
    public String getAcoountHolderName() {
        return accountHolderName;
    }

    public long getAddharId() {
        return addharId;
    }

    public String getPanId() {
        return panId;
    }

    public void display() {
        System.out.println("Customer Name  : " + accountHolderName);
        accountService.display();
        super.display();
    }
}
