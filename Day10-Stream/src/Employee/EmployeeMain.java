package Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {
        List<Employee> emp = createData();
        double sumTds = emp.stream()
                .filter(employee -> (employee.getSalary() > 50000.0))
                .map(val -> val.getSalary() * 0.1)
                .reduce((x, y) -> x + y)
                .get();
        System.out.printf("Sum of TDS is : %s%n",sumTds);

        double sum = emp.stream().map(val -> val.getSalary()).reduce((x, y) -> x + y).get();
        System.out.printf("Sum of salary is : %s%n",sum);

        System.out.printf("Minimum salary is : %s%n", emp.stream().min((x, y) -> comparing(x, y)).get().getSalary());

        System.out.printf("Maximum salary is : %s%n", emp.stream().max((x, y) -> comparing(x, y)).get().getSalary());

        Long count = emp.stream().count();
        System.out.printf("Total number of employees is : %s%n",count);

        System.out.printf("Average salary of employees is : %s%n",sum/count);
    }

    private static int comparing(Employee x, Employee y) {
        if(x.getSalary() == y.getSalary()) {
            return 0;
        } else if(x.getSalary() > y.getSalary()) {
            return 1;
        } else return -1;
    }

    public static List<Employee> createData() {
        List<Employee> list = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            list.add(new Employee(5000.0 * i));
        }

        return list;
    }
}
