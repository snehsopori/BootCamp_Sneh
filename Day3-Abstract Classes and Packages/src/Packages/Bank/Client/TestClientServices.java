package Packages.Bank.Client;

import Packages.Bank.Customer.CustomerService;
import org.junit.Test;

public class TestClientServices {
    @Test
    public void test() {
        CustomerService customer = new CustomerService("Axis Bank",50000,36745866,35,3432302,"Alpha","Pune","9999999999","Hero",23123231,"alajsjfhg");
        customer.display();
    }
}
