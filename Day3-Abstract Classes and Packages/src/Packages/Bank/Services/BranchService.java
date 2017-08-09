package Packages.Bank.Services;

public class BranchService extends BankService {
    String branchManagerName;
    String branch;
    String contact;
    int IFSC_Code;

    public BranchService() {

    }
    public BranchService(String bankName, int noOfCustomers, double revenue, int noOfBranches, int IFSC_Code, String branchManagerName, String branch, String contact) {
        super(bankName, noOfCustomers, revenue, noOfBranches);
        this.IFSC_Code = IFSC_Code;
        this.branchManagerName = branchManagerName;
        this.branch = branch;
        this.contact = contact;
    }

    public int getIFSC_Code() {
        return IFSC_Code;
    }

    public String getbranchManagerName() {
        return branchManagerName;
    }

    public String getbranch() {
        return branch;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Branch Manager Name : " + this.branchManagerName);
        System.out.println("IFSC_Code : " + this.IFSC_Code);
        System.out.println("Branch : " + this.branch);
        System.out.println("Contact : " + this.contact);
    }
}
