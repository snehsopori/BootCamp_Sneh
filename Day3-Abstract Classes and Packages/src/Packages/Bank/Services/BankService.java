package Packages.Bank.Services;

public class BankService {
    String bankName;
    int noOfCustomers;
    double revenue;
    int noOfBranches;

    public BankService() {

    }

    public BankService(String bankName, int noOfCustomers, double revenue, int noOfBranches) {
        this.bankName = bankName;
        this.noOfCustomers = noOfCustomers;
        this.revenue = revenue;
        this.noOfBranches = noOfBranches;
    }

    public String getBranchName() {

        return bankName;
    }

    public int getNoOfCustomers() {
        return noOfCustomers;
    }

    public double getRevenue() {
        return revenue;
    }

    public int getNoOfBranches() {
        return noOfBranches;
    }

    public void display() {
        System.out.println("Welcome to " + this.bankName);
        System.out.println("We have a total of " + this.noOfCustomers + " customers");
        System.out.println("Our annual revenue is : " + this.revenue);
        System.out.println("Our total number of branches are : " + this.noOfBranches);

    }


}

