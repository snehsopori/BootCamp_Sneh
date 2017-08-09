package com.cdk.IOEmployee;

import java.io.Serializable;

public class Employee implements Comparable<Employee>, Serializable {
    int eid;
    transient double salary;
    String name;

    public Employee(int eid, double salary, String name) {
        this.eid = eid;
        this.salary = salary;
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        return this.getEid() - e.getEid();
    }
}
